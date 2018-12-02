package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AskQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\tbody {\n");
      out.write("\t\t\t\tmargin:0;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tp {\n");
      out.write("\t\t\t\tmargin-left:26%;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.header {\n");
      out.write("\t\t\t\tbackground-color:#8000ff;\n");
      out.write("\t\t\t\tborder-bottom: 2px solid orange;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.header ul {\n");
      out.write("\t\t\t\tlist-style: none;\n");
      out.write("    \t\t\t\tmargin-top: -2%;\n");
      out.write("    \t\t\t\tmargin-left: 68%;\n");
      out.write("    \t\t\t\tmargin-bottom: 0;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.header ul li {\n");
      out.write("\t\t\t\tdisplay: inline;\n");
      out.write("\t\t\t\tpadding:10px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.header h1 {\n");
      out.write("\t\t\t\tmargin: 0;\n");
      out.write("\t\t\t\twidth: 41%;\n");
      out.write("\t\t\t\tcolor: white;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ta {\n");
      out.write("\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t\tcolor: white;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ta:hover {\n");
      out.write("\t\t\t\tcolor: orange;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.css\">\n");
      out.write("\t</head>\n");
      out.write("\t<body style=\"background:#f1f1f1;\">\n");
      out.write("\t\t<nav class=\"nav navbar-default navbar-inverse  navbar-fixed-top\">\n");
      out.write("<div class=\"nav navbar-header\">\n");
      out.write("<div class=\"nav navbar-brand\">Ask & Learn</div>\n");
      out.write("</div>\n");
      out.write("<!--<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("<li><a href=\"index.html\">Home</a></li>\n");
      out.write("<li><a href=\"aboutus1.html\">About Us</a></li>\n");
      out.write("<li><a href=\"login1.html\">Login</a></li>\n");
      out.write("<li><a href=\"#\">Register</a></li>\n");
      out.write("<!--<li><a href=\"Signout1.html\">Signout</a></li>-->\n");
      out.write("<!--</ul>-->\n");
      out.write("\n");
      out.write("<div class=\"navbar-form navbar-left\">\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<input type=\"text\" class=\"form-control\" placeholder=\"search\">\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"jumbotron\" style=\"background-image:url();padding:18%;width:100%;\">\n");
      out.write("\t\t\n");
      out.write("\t\t<center><h1 style=\"color:black;\">Ask ?</h1></center>\n");
      out.write("\t\t<form action=\"AskQuestion\" method=\"post\" style=\"border:2px solid orange;width:47%;margin-left:32%;padding:0px\">\n");
      out.write("                    <table style=\"color:black;border:0px\" >\n");
      out.write("\t\t\t<TR>\n");
      out.write("\t\t\t<TD>Topic: </TD> <TD><input type=\"text\" name=\"topic\" required><br><br></TD>\n");
      out.write("\t\t\t</TR>\n");
      out.write("                        \n");
      out.write("                        <TR>\n");
      out.write("\t\t\t<TD>Sub-Topic:</TD> <TD><input type=\"text\" name=\"subtopic\" required><br><br></TD>\n");
      out.write("\t\t\t</TR>\n");
      out.write("\t\t\t<TR>\n");
      out.write("\t\t\t<TD>Ask Your Question:</TD> <TD><input type=\"text\" name=\"question\" required><br><br></TD>\n");
      out.write("\t\t\t</TR>\n");
      out.write("\t\t\t<TR>\n");
      out.write("\t\t\t<TD>User Name:</TD> <TD><input type=\"text\" name=\"userName\" required><br><br></TD>\n");
      out.write("\t\t\t</TR>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!--<p style=\"color:black;\">Topic: <input type=\"text\" ></p>\n");
      out.write("\t\t\t<p style=\"color:black;\">Sub-Topic: <input type=\"text\" name=\"subtopic\" required></p>\n");
      out.write("\t\t\t<p style=\"color:black;\">Ask Your Question: <input type=\"text\" name=\"question\" required></p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<p style=\"color:black;\"> UserName:<input type=\"text\" name=\"userName\" required></p>-->\n");
      out.write("\t\t\t\n");
      out.write("                        \n");
      out.write("\t\t\t<!--<p><center><input type=\"submit\" value=\"submit\"></center>-->\n");
      out.write("                        \n");
      out.write("                        <tr><td colspan=\"2\"><center>\n");
      out.write("                        <input class=\"btn btn-primary btn-lg\" type=\"submit\" value=\"Submit\"/>\n");
      out.write("                        </center></td></tr>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
