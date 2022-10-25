package me.web;

import me.web.member.Member;
import me.web.util.Status;
import me.web.member.MemberDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "DoSignupServlet", value = "/DoSignupServlet")
public class DoSignupServlet extends HttpServlet {

    private MemberDAO memberDAO = MemberDAO.getInstance();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();

        String uEmail = "";
        if (request.getParameter("uEmail") != null) {
            uEmail = request.getParameter("uEmail");
        }

        String uId = "";
        if (request.getParameter("uId") != null) {
            uId = request.getParameter("uId");
        }

        String uPw = "";
        if (request.getParameter("uPw") != null) {
            uPw = request.getParameter("uPw");
        }

        int result = memberDAO.insert(new Member(uId, uPw, uEmail));

        if (result > 0) {
            session.setAttribute("signup", Status.SUCCESS);
            response.sendRedirect("./login.jsp");
        } else {
            session.setAttribute("signup", Status.FAIL);
            response.sendRedirect("./signup.jsp");
        }
    }
}
