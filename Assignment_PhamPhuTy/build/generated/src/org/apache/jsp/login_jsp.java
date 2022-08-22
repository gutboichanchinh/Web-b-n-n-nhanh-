package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Glassy Login Form A Responsive Widget Template :: w3layouts</title>\n");
      out.write("<!-- Meta tag Keywords -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Glassy Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- Meta tag Keywords -->\n");
      out.write("<!-- css files -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome1.css\"> <!-- Font-Awesome-Icons-CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style1.css\" type=\"text/css\" media=\"all\" /> <!-- Style-CSS --> \n");
      out.write("<!-- //css files -->\n");
      out.write("<!-- web-fonts -->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700\" rel=\"stylesheet\">\n");
      out.write("<!-- //web-fonts -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\t<!--header-->\n");
      out.write("\t\t<div class=\"header-w3l\">\n");
      out.write("\t\t\t<h1>Glassy Login Form</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--//header-->\n");
      out.write("\t\t<!--main-->\n");
      out.write("\t\t<div class=\"main-w3layouts-agileinfo\">\n");
      out.write("\t           <!--form-stars-here-->\n");
      out.write("\t\t\t\t\t\t<div class=\"wthree-form\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Fill out the form below to login</h2>\n");
      out.write("\t\t\t\t\t\t\t<form action=\"LoginControll\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-sub-w3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"user\" placeholder=\"Username \" required=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-w3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-sub-w3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"pass\" placeholder=\"Password\" required=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-w3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"submit-agileits\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--//form-ends-here-->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--//main-->\n");
      out.write("\t\t<!--footer-->\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<p>&copy; 2017 Glassy Login Form. All rights reserved | Design by <a href=\"http://w3layouts.com\">W3layouts</a></p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--//footer-->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
