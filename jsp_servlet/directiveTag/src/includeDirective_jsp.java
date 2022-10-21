/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-10-19 19:44:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */

import javax.servlet.*;
import javax.servlet.http.*;

import java.util.StringTokenizer;

public final class includeDirective_jsp extends org.apache.jasper.runtime.HttpJspBase
        implements org.apache.jasper.runtime.JspSourceDependent,
        org.apache.jasper.runtime.JspSourceImports {

    public java.lang.String getServletInfo() {
        return "Directive Tag Description Page";
    }


    static final String CURRENT_FILE = "includeDirective.jsp";


    static String FOOTER_FILE = "includeFooter.jsp";


    public String getFooterFileName() {
        StringTokenizer stringTokenizer = new StringTokenizer(FOOTER_FILE, ".");
        return stringTokenizer.nextToken();
    }

    private static final javax.servlet.jsp.JspFactory _jspxFactory =
            javax.servlet.jsp.JspFactory.getDefaultFactory();

    private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

    static {
        _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
        _jspx_dependants.put("/includeFooter.jsp", Long.valueOf(1666208645970L));
        _jspx_dependants.put("/header.jsp", Long.valueOf(1666203653642L));
    }

    private static final java.util.Set<java.lang.String> _jspx_imports_packages;

    private static final java.util.Set<java.lang.String> _jspx_imports_classes;

    static {
        _jspx_imports_packages = new java.util.HashSet<>();
        _jspx_imports_packages.add("javax.servlet");
        _jspx_imports_packages.add("java.util");
        _jspx_imports_packages.add("java.time");
        _jspx_imports_packages.add("java.time.format");
        _jspx_imports_packages.add("javax.servlet.http");
        _jspx_imports_packages.add("javax.servlet.jsp");
        _jspx_imports_classes = new java.util.HashSet<>();
        _jspx_imports_classes.add("java.util.StringTokenizer");
        _jspx_imports_classes.add("member.Member");
    }

    private volatile javax.el.ExpressionFactory _el_expressionfactory;
    private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

    public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
        return _jspx_dependants;
    }

    public java.util.Set<java.lang.String> getPackageImports() {
        return _jspx_imports_packages;
    }

    public java.util.Set<java.lang.String> getClassImports() {
        return _jspx_imports_classes;
    }

    public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
        if (_el_expressionfactory == null) {
            synchronized (this) {
                if (_el_expressionfactory == null) {
                    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
                }
            }
        }
        return _el_expressionfactory;
    }

    public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
        if (_jsp_instancemanager == null) {
            synchronized (this) {
                if (_jsp_instancemanager == null) {
                    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
                }
            }
        }
        return _jsp_instancemanager;
    }

    public void _jspInit() {
    }

    public void _jspDestroy() {
    }

    public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
            throws java.io.IOException, javax.servlet.ServletException {

        if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
            final java.lang.String _jspx_method = request.getMethod();
            if ("OPTIONS".equals(_jspx_method)) {
                response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
                return;
            }
            if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
                response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
                response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
                return;
            }
        }

        final javax.servlet.jsp.PageContext pageContext;
        javax.servlet.http.HttpSession session = null;
        final javax.servlet.ServletContext application;
        final javax.servlet.ServletConfig config;
        javax.servlet.jsp.JspWriter out = null;
        final java.lang.Object page = this;
        javax.servlet.jsp.JspWriter _jspx_out = null;
        javax.servlet.jsp.PageContext _jspx_page_context = null;


        try {
            response.setContentType("text/html; charset=UTF-8");
            pageContext = _jspxFactory.getPageContext(this, request, response,
                    null, true, 8192, true);
            _jspx_page_context = pageContext;
            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();
            _jspx_out = out;

            out.write("\n");
            out.write("\n");
            out.write("\n");
            out.write("\n");
            out.write("\n");
            out.write("<html>\n");
            out.write("<head>\n");
            out.write("    <meta charset=\"UTF-8\">\n");
            out.write("    <title>JSP Title</title>\n");
            out.write("    <link href=\"./css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("</head>\n");
            out.write("\n");
            out.write("\n");
            out.write("<body>\n");
            out.write("<header>");
            out.write("<html>\n");
            out.write("<head>\n");
            out.write("    <meta charset=\"UTF-8\">\n");
            out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
            out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
            out.write("    <link rel=\"stylesheet\" href=\"./css/header.css\">\n");
            out.write("\n");
            out.write("    <!-- font awesome apis (icon) -->\n");
            out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css\"/>\n");
            out.write("\n");
            out.write("    <!-- google font apis (font) -->\n");
            out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
            out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
            out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@600&display=swap\" rel=\"stylesheet\">\n");
            out.write("    <title>Responsive Header</title>\n");
            out.write("\n");
            out.write("    <!-- favicon (ë¸ë¼ì°ì  ì´ë¦ ìì ìì´ì½)\n");
            out.write("        https://www.flaticon.com/kr/\n");
            out.write("        https://www.favicon-generator.org/\n");
            out.write("    -->\n");
            out.write("    <link rel=\"shortcut icon\" href=\"./icon/favicon.ico\" type=\"image/x-icon\">\n");
            out.write("    <link rel=\"icon\" href=\"./icon/favicon-16x16.png\" sizes=\"16x16\">\n");
            out.write("    <link rel=\"icon\" href=\"./icon/favicon-32x32.png\" sizes=\"32x32\">\n");
            out.write("    <link rel=\"icon\" href=\"./icon/favicon-96x96.png\" sizes=\"96x96\">\n");
            out.write("\n");
            out.write("\n");
            out.write("    <script src=\"./js/header.js\" defer></script>\n");
            out.write("    <!-- defer: html ììê° ëª¨ë í¸ì¶ë íì ì¤í¬ë¦½í¸ ì¤í\n");
            out.write("         async: html ììê° ëëì§ ììë ì¤í¬ë¦½í¸ ì¤í\n");
            out.write("               (ì¤í¬ë¦½í¸ ë¡ë ìë£ëë©´)\n");
            out.write("    -->\n");
            out.write("\n");
            out.write("</head>\n");
            out.write("<body>\n");
            out.write("<header class=\"header\">\n");
            out.write("    <div class=\"header__logo\">\n");
            out.write("        <!-- inline êµ¬ì¡°ì¬ì ìì§ì  ì¤ìì´ ë§ì§ ìì -->\n");
            out.write("        <a href=\"index.jsp\"><i class=\"fas fa-camera\"></i></a>\n");
            out.write("        <a href=\"index.jsp\">Sallys</a>\n");
            out.write("    </div>\n");
            out.write("\n");
            out.write("\n");
            out.write("    <ul class=\"header__nav\">\n");
            out.write("        <!-- block êµ¬ì¡°ì¬ì ìì§ì  ì¤ìì´ ë§ì -->\n");
            out.write("        <li><a href=\"#\">Home</a></li>\n");
            out.write("        <li><a href=\"#\">Board</a></li>\n");
            out.write("        <li><a href=\"#\">Survey</a></li>\n");
            out.write("    </ul>\n");
            out.write("\n");
            out.write("    <ul class=\"header__icons\">\n");
            out.write("        <li><i class=\"fab fa-twitter\"></i></li>\n");
            out.write("        <li><i class=\"fab fa-facebook\"></i></li>\n");
            out.write("    </ul>\n");
            out.write("\n");
            out.write("\n");
            out.write("</header>\n");
            out.write("</body>\n");
            out.write("</html>");
            out.write("</header>\n");
            out.write("<main>\n");
            out.write("    ");
            out.write("\n");
            out.write("    <div>");
            out.print(CURRENT_FILE);
            out.write("</div>\n");
            out.write("</main>\n");
            out.write("<footer>");
            out.write("\n");
            out.write("<html>\n");
            out.write("<head><link rel=\"stylesheet\" href=\"./css/footer.css\"></head>\n");
            out.write("<footer class=\"footer\">\n");
            out.write("    ");
            out.write("\n");
            out.write("    ");
            out.write("\n");
            out.write("\n");
            out.write("    <div></div>\n");
            out.write("    <div>");
            out.print(getFooterFileName().toUpperCase());
            out.write("</div>\n");
            out.write("    <div></div>\n");
            out.write("</footer>\n");
            out.write("</html>\n");
            out.write("</footer>\n");
            out.write("</body>\n");
            out.write("</html>");
        } catch (java.lang.Throwable t) {
            if (!(t instanceof javax.servlet.jsp.SkipPageException)){
                out = _jspx_out;
                if (out != null && out.getBufferSize() != 0)
                    try {
                        if (response.isCommitted()) {
                            out.flush();
                        } else {
                            out.clearBuffer();
                        }
                    } catch (java.io.IOException e) {}
                if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
                else throw new ServletException(t);
            }
        } finally {
            _jspxFactory.releasePageContext(_jspx_page_context);
        }
    }
}
