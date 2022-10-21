import member.Member;
import database.MemberDatabase;
import util.Status;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


/*
* implicitObject project 문제점
* localhost:8080/session.jsp 경로를 직접 들어가면 로그인하지 않아도 서베이 가능.
* 불가능하게 만들 수 있을까? 🫠
* */

@WebServlet (name = "DoLoginServlet", value = "/DoLoginServlet")
public class DoLoginServlet extends HttpServlet {

    static final MemberDatabase database = MemberDatabase.getInstance();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();

        String uId = "";
        if (request.getParameter("uId") != null) {
            uId = request.getParameter("uId");
        }

        String uPw = "";
        if (request.getParameter("uPw") != null) {
            uPw = request.getParameter("uPw");
        }

        Member member = database.select(uId);
        if (member != null) {
            if (member.getuPw().equals(uPw)) {
                session.setAttribute("uId", uId);
                session.setMaxInactiveInterval(1800);
                session.setAttribute("login", Status.SUCCESS);
                response.sendRedirect("./survey.jsp");
            } else {
                session.setAttribute("login", Status.FAIL);
                response.sendRedirect("./login.jsp");
            }
        } else {
            session.setAttribute("login", Status.NULL);
            response.sendRedirect("./signup.jsp");
        }

    }
}
