package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modal.Customer;
import java.util.ArrayList;

public final class SuccessfullPlaced_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.ico\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("\t<title>Account Info</title>\n");
      out.write("    <script src=\"all.js\"></script>\n");
      out.write("\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Animation library for notifications   -->\n");
      out.write("    <link href=\"assets/css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("    <link href=\"assets/css/light-bootstrap-dashboard.css?v=1.4.0\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("    <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"C:/Users/user/Desktop/Assignments/Assignment-1/fontawesome/css/fontawesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<!--     <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write(" -->    <link href=\"assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .main-panel > .content\n");
      out.write("        {\n");
      out.write("            background-image: url(\"t5.png\");\n");
      out.write("            background-repeat: repeat;\n");
      out.write("        }\n");
      out.write("        .col-md-3{\n");
      out.write("/*            background-color: rgba(0,0,0,0.5);\n");
      out.write("*/            color:white;\n");
      out.write("        }\n");
      out.write("        .card{\n");
      out.write("            background-color: #f1f1f1;\n");
      out.write("            color:white;\n");
      out.write("        }\n");
      out.write("        .btn1\n");
      out.write("        {\n");
      out.write("          background-color: dodgerblue;\n");
      out.write("          color:white;\n");
      out.write("          padding:10px 12px;\n");
      out.write("          outline: none;\n");
      out.write("          margin-left: 230px;\n");
      out.write("          border:none;\n");
      out.write("          cursor:pointer;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("        <div class=\"sidebar\" data-image=\"assets/img/dog1.jpg\" >\n");
      out.write("\n");
      out.write("<!--     <div class=\"sidebar\" data-color=\"orange\" data-image=\"assets/img/sidebar-5.jpg\">\n");
      out.write(" -->\n");
      out.write("    <!--\n");
      out.write("\n");
      out.write("        Tip 1: you can change the color of the sidebar using: data-color=\"blue | azure | green | orange | red | purple\"\n");
      out.write("        Tip 2: you can also add an image using data-image tag\n");
      out.write("\n");
      out.write("    -->\n");
      out.write("\n");
      out.write("    \t<div class=\"sidebar-wrapper\" style=\"background-color: #ffa400;\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"#\" class=\"simple-text\" style=\"color:black;\">\n");
      out.write("                    Creative Tim\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav\" >\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"dashboard.html\">\n");
      out.write("                        <i class=\"pe-7s-graph\" style=\"color:black;font-size: 25px;\"></i>\n");
      out.write("                        <p style=\"color:black;font-size: 15px;\">Dashboard</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"pe-7s-user\" style=\"color:black;font-size: 25px;\"></i>\n");
      out.write("                        <p style=\"color:black;font-size: 15px;\">Add a Pet</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"pe-7s-note2\" style=\"color:black;font-size: 25px;\"></i>\n");
      out.write("                        <p style=\"color:black;font-size: 15px;\">View Orders</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"pe-7s-news-paper\" style=\"color:black;\"></i>\n");
      out.write("                        <p style=\"color:black;font-size: 15px;\">View Delivered Items</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"pe-7s-note2\" style=\"color:black;\"></i>\n");
      out.write("                        <p style=\"color:black;font-size: 15px;\">All Items</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navigation-example-2\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    ");

                        ArrayList<Customer> c = (ArrayList<Customer>)session.getAttribute("customer");
                    
      out.write("\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" style=\"color:black;\">Welcome, ");
      out.print( c.get(0).getName() );
      out.write("</a>                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\" class=\"navbar navbar-light bg-light\">\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                              <a href=\"getAllCart\">\n");
      out.write("                                  ");

                                      int count = (int)(Integer)session.getAttribute("count");
                                  
      out.write("\n");
      out.write("                                    <i class=\"fa fa-shopping-cart\" style=\"font-size:30px;color:black;\"></i>\n");
      out.write("                                    <b class=\"caret hidden-lg hidden-md\"></b>\n");
      out.write("                                    <span class=\"notification hidden-sm hidden-xs\">");
      out.print( count );
      out.write("</span>\n");
      out.write("                                    <p class=\"hidden-lg hidden-md\" style=\"color:black;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print( count );
      out.write(" Items Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b class=\"caret\"></b>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("                              </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                           <p>                        </p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                               <form action=\"\" class=\"form-inline\" style=\"text-align: center;\">\n");
      out.write("                                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                                </form>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"\">\n");
      out.write("                               <p>Account</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- <li class=\"dropdown\">\n");
      out.write("                              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDropdown\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b class=\"caret\"></b>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("                              </a>\n");
      out.write("                              <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\">Action</a></li>\n");
      out.write("                                <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                <li><a href=\"#\">Something</a></li>\n");
      out.write("                                <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                <li><a href=\"#\">Something</a></li>\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("                                <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                              </ul>\n");
      out.write("                        </li> -->\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <p>Log out</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\t\t\t\t\t\t<li class=\"separator hidden-lg\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content\" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <center><h4 class=\"title\" style=\"text-align: center;font-size: 20px;font-weight: bold;color:red;\">Your Order has been Placed Successfully</h4></center>\n");
      out.write("                            </div>\n");
      out.write("                            <hr>\n");
      out.write("                                <div class=\"footer\">\n");
      out.write("                                    <div class=\"legend\">\n");
      out.write("                                        <a href=\"dashboard.jsp\"><center><button class=\"btn1\">Back</button></center></a></center>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- <footer class=\"footer\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <nav class=\"pull-left\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                Home\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                Company\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                Portfolio\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                               Blog\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <p class=\"copyright pull-right\">\n");
      out.write("                    &copy; <script>document.write(new Date().getFullYear())</script> <a href=\"http://www.creative-tim.com\">Creative Tim</a>, made with love for a better web\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write(" -->\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"assets/js/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Charts Plugin -->\n");
      out.write("\t<script src=\"assets/js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"assets/js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\n");
      out.write("\t<script src=\"assets/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\n");
      out.write("\t<script src=\"assets/js/demo.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- <script type=\"text/javascript\">\n");
      out.write("    \t$(document).ready(function(){\n");
      out.write("\n");
      out.write("        \tdemo.initChartist();\n");
      out.write("\n");
      out.write("        \t$.notify({\n");
      out.write("            \ticon: 'pe-7s-gift',\n");
      out.write("            \tmessage: \"Welcome to <b>Light Bootstrap Dashboard</b> - a beautiful freebie for every web developer.\"\n");
      out.write("\n");
      out.write("            },{\n");
      out.write("                type: 'info',\n");
      out.write("                timer: 4000\n");
      out.write("            });\n");
      out.write("\n");
      out.write("    \t});\n");
      out.write("\t</script> -->\n");
      out.write("<!-- style=\"background-image: url(\"assets/img/dog1.jpg\");\" -->\n");
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
