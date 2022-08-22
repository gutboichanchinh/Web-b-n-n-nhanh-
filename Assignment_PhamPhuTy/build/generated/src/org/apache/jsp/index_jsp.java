package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Basic -->\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"\">\n");
      out.write("\n");
      out.write("        <title> Feane </title>\n");
      out.write("\n");
      out.write("        <!-- bootstrap core css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("        <!--owl slider stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\n");
      out.write("        <!-- nice select  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css\" integrity=\"sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==\" crossorigin=\"anonymous\" />\n");
      out.write("        <!-- font awesome style -->\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- responsive style -->\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"hero_area\">\n");
      out.write("            <div class=\"bg-box\">\n");
      out.write("                <img src=\"images/hero-bg.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <!-- header section strats -->\n");
      out.write("            <header class=\"header_section\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg custom_nav-container \">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                            <span>\n");
      out.write("                                Feane\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"\"> </span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\n");
      out.write("                            <div class=\"user_option\">\n");
      out.write("                                <a href=\"\" class=\"user_link\">\n");
      out.write("                                    <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"cart_link\" href=\"LoadCartControll\">\n");
      out.write("                                    <svg version=\"1.1\" id=\"Capa_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\" viewBox=\"0 0 456.029 456.029\" style=\"enable-background:new 0 0 456.029 456.029;\" xml:space=\"preserve\">\n");
      out.write("                                    <g>\n");
      out.write("                                    <g>\n");
      out.write("                                    <path d=\"M345.6,338.862c-29.184,0-53.248,23.552-53.248,53.248c0,29.184,23.552,53.248,53.248,53.248\n");
      out.write("                                          c29.184,0,53.248-23.552,53.248-53.248C398.336,362.926,374.784,338.862,345.6,338.862z\" />\n");
      out.write("                                    </g>\n");
      out.write("                                    </g>\n");
      out.write("\n");
      out.write("                                    <g>\n");
      out.write("                                    <path d=\"M439.296,84.91c-1.024,0-2.56-0.512-4.096-0.512H112.64l-5.12-34.304C104.448,27.566,84.992,10.67,61.952,10.67H20.48\n");
      out.write("                                          C9.216,10.67,0,19.886,0,31.15c0,11.264,9.216,20.48,20.48,20.48h41.472c2.56,0,4.608,2.048,5.12,4.608l31.744,216.064\n");
      out.write("                                          c4.096,27.136,27.648,47.616,55.296,47.616h212.992c26.624,0,49.664-18.944,55.296-45.056l33.28-166.4\n");
      out.write("                                          C457.728,97.71,450.56,86.958,439.296,84.91z\" />\n");
      out.write("                                    </g>\n");
      out.write("\n");
      out.write("                                    <g>\n");
      out.write("                                    <g>\n");
      out.write("                                    <path d=\"M215.04,389.55c-1.024-28.16-24.576-50.688-52.736-50.688c-29.696,1.536-52.224,26.112-51.2,55.296\n");
      out.write("                                          c1.024,28.16,24.064,50.688,52.224,50.688h1.024C193.536,443.31,216.576,418.734,215.04,389.55z\" />\n");
      out.write("                                    </g>\n");
      out.write("                                    </g>\n");
      out.write("\n");
      out.write("                                    </svg>\n");
      out.write("                                </a>\n");
      out.write("                                <form class=\"form-inline\">\n");
      out.write("                                    <button class=\"btn  my-2 my-sm-0 nav_search-btn\" type=\"submit\">\n");
      out.write("                                        <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </form>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- end header section -->\n");
      out.write("            <!-- slider section -->\n");
      out.write("            <section class=\"slider_section \">\n");
      out.write("                <div id=\"customCarousel1\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                        <div class=\"carousel-item active\">\n");
      out.write("                            <div class=\"container \">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-7 col-lg-6 \">\n");
      out.write("                                        <div class=\"detail-box\">\n");
      out.write("                                            <h1>\n");
      out.write("                                                Fast Food Restaurant\n");
      out.write("                                            </h1>\n");
      out.write("                                            <p>\n");
      out.write("                                                Doloremque, itaque aperiam facilis rerum, commodi, temporibus sapiente ad mollitia laborum quam quisquam esse error unde. Tempora ex doloremque, labore, sunt repellat dolore, iste magni quos nihil ducimus libero ipsam.\n");
      out.write("                                            </p>\n");
      out.write("                                            <div class=\"btn-box\">\n");
      out.write("                                                <a href=\"\" class=\"btn1\">\n");
      out.write("                                                    Order Now\n");
      out.write("                                                </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item \">\n");
      out.write("                            <div class=\"container \">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-7 col-lg-6 \">\n");
      out.write("                                        <div class=\"detail-box\">\n");
      out.write("                                            <h1>\n");
      out.write("                                                Fast Food Restaurant\n");
      out.write("                                            </h1>\n");
      out.write("                                            <p>\n");
      out.write("                                                Doloremque, itaque aperiam facilis rerum, commodi, temporibus sapiente ad mollitia laborum quam quisquam esse error unde. Tempora ex doloremque, labore, sunt repellat dolore, iste magni quos nihil ducimus libero ipsam.\n");
      out.write("                                            </p>\n");
      out.write("                                            <div class=\"btn-box\">\n");
      out.write("                                                <a href=\"\" class=\"btn1\">\n");
      out.write("                                                    Order Now\n");
      out.write("                                                </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <div class=\"container \">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-7 col-lg-6 \">\n");
      out.write("                                        <div class=\"detail-box\">\n");
      out.write("                                            <h1>\n");
      out.write("                                                Fast Food Restaurant\n");
      out.write("                                            </h1>\n");
      out.write("                                            <p>\n");
      out.write("                                                Doloremque, itaque aperiam facilis rerum, commodi, temporibus sapiente ad mollitia laborum quam quisquam esse error unde. Tempora ex doloremque, labore, sunt repellat dolore, iste magni quos nihil ducimus libero ipsam.\n");
      out.write("                                            </p>\n");
      out.write("                                            <div class=\"btn-box\">\n");
      out.write("                                                <a href=\"\" class=\"btn1\">\n");
      out.write("                                                    Order Now\n");
      out.write("                                                </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#customCarousel1\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#customCarousel1\" data-slide-to=\"1\"></li>\n");
      out.write("                            <li data-target=\"#customCarousel1\" data-slide-to=\"2\"></li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <!-- end slider section -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"food_section layout_padding-bottom\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"heading_container heading_center\">\n");
      out.write("                    <h2>\n");
      out.write("                        Our Menu\n");
      out.write("                    </h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"filters_menu\">\n");
      out.write("                    <li class=\"active\" data-filter=\"*\">All</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"filters-content\">\n");
      out.write("                    <div class=\"row grid\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- end food section -->\n");
      out.write("\n");
      out.write("    <!-- about section -->\n");
      out.write("\n");
      out.write("    <section class=\"about_section layout_padding\">\n");
      out.write("        <div class=\"container  \">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 \">\n");
      out.write("                    <div class=\"img-box\">\n");
      out.write("                        <img src=\"images/about-img.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"detail-box\">\n");
      out.write("                        <div class=\"heading_container\">\n");
      out.write("                            <h2>\n");
      out.write("                                We Are Feane\n");
      out.write("                            </h2>\n");
      out.write("                        </div>\n");
      out.write("                        <p>\n");
      out.write("                            There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration\n");
      out.write("                            in some form, by injected humour, or randomised words which don't look even slightly believable. If you\n");
      out.write("                            are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in\n");
      out.write("                            the middle of text. All\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            Read More\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- end about section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- client section -->\n");
      out.write("\n");
      out.write("    <section class=\"client_section layout_padding-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"heading_container heading_center psudo_white_primary mb_45\">\n");
      out.write("                <h2>\n");
      out.write("                    What Says Our Customers\n");
      out.write("                </h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-wrap row \">\n");
      out.write("                <div class=\"owl-carousel client_owl-carousel\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <div class=\"box\">\n");
      out.write("                            <div class=\"detail-box\">\n");
      out.write("                                <p>\n");
      out.write("                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam\n");
      out.write("                                </p>\n");
      out.write("                                <h6>\n");
      out.write("                                    Moana Michell\n");
      out.write("                                </h6>\n");
      out.write("                                <p>\n");
      out.write("                                    magna aliqua\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"img-box\">\n");
      out.write("                                <img src=\"images/client1.jpg\" alt=\"\" class=\"box-img\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <div class=\"box\">\n");
      out.write("                            <div class=\"detail-box\">\n");
      out.write("                                <p>\n");
      out.write("                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam\n");
      out.write("                                </p>\n");
      out.write("                                <h6>\n");
      out.write("                                    Mike Hamell\n");
      out.write("                                </h6>\n");
      out.write("                                <p>\n");
      out.write("                                    magna aliqua\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"img-box\">\n");
      out.write("                                <img src=\"images/client2.jpg\" alt=\"\" class=\"box-img\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- end client section -->\n");
      out.write("\n");
      out.write("    <!-- footer section -->\n");
      out.write("    <footer class=\"footer_section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 footer-col\">\n");
      out.write("                    <div class=\"footer_contact\">\n");
      out.write("                        <h4>\n");
      out.write("                            Contact Us\n");
      out.write("                        </h4>\n");
      out.write("                        <div class=\"contact_link_box\">\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    Location\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    Call +01 1234567890\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    demo@gmail.com\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 footer-col\">\n");
      out.write("                    <div class=\"footer_detail\">\n");
      out.write("                        <a href=\"\" class=\"footer-logo\">\n");
      out.write("                            Feane\n");
      out.write("                        </a>\n");
      out.write("                        <p>\n");
      out.write("                            Necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with\n");
      out.write("                        </p>\n");
      out.write("                        <div class=\"footer_social\">\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <i class=\"fa fa-facebook\" aria-hidden=\"true\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <i class=\"fa fa-twitter\" aria-hidden=\"true\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <i class=\"fa fa-instagram\" aria-hidden=\"true\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 footer-col\">\n");
      out.write("                    <h4>\n");
      out.write("                        Opening Hours\n");
      out.write("                    </h4>\n");
      out.write("                    <p>\n");
      out.write("                        Everyday\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        10.00 Am -10.00 Pm\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-info\">\n");
      out.write("                <p>\n");
      out.write("                    &copy; <span id=\"displayYear\"></span> All Rights Reserved By\n");
      out.write("                    <a href=\"https://html.design/\">Free Html Templates</a><br><br>\n");
      out.write("                    &copy; <span id=\"displayYear\"></span> Distributed By\n");
      out.write("                    <a href=\"https://themewagon.com/\" target=\"_blank\">ThemeWagon</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- footer section -->\n");
      out.write("\n");
      out.write("    <!-- jQery -->\n");
      out.write("    <script src=\"js/jquery-3.4.1.min.js\"></script>\n");
      out.write("    <!-- popper js -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\">\n");
      out.write("    </script>\n");
      out.write("    <!-- bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\n");
      out.write("    <!-- owl slider -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <!-- isotope js -->\n");
      out.write("    <script src=\"https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js\"></script>\n");
      out.write("    <!-- nice select -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js\"></script>\n");
      out.write("    <!-- custom js -->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("    <!-- Google Map -->\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap\">\n");
      out.write("    </script>\n");
      out.write("    <!-- End Google Map -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ACC != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <a class=\"navbar-brand\" >\n");
        out.write("                            <span style=\"font-size: 20px\">\n");
        out.write("                                Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ACC.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                            </span>\n");
        out.write("                        </a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ACC == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <a href=\"login.jsp\" class=\"order_online\">\n");
        out.write("                                    Login\n");
        out.write("                                </a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ACC != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <a href=\"LogoutControll\" class=\"order_online\">\n");
        out.write("                                    Log Out\n");
        out.write("                                </a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("f");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listF}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"col-sm-6 col-lg-4 all pizza\">\n");
          out.write("                                <div class=\"box\">\n");
          out.write("                                    <div>\n");
          out.write("                                        <div class=\"img-box\">\n");
          out.write("                                            <img src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" >\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"detail-box\">\n");
          out.write("                                            <h5>\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                                            </h5>  \n");
          out.write("                                            <p>\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getDescriptionShort()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </p>\n");
          out.write("                                            <div class=\"options\">\n");
          out.write("                                                <h6>\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $\n");
          out.write("                                                </h6>\n");
          out.write("                                                <a href=\"addToCart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                    <svg version=\"1.1\" id=\"Capa_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\" viewBox=\"0 0 456.029 456.029\" style=\"enable-background:new 0 0 456.029 456.029;\" xml:space=\"preserve\">\n");
          out.write("                                                    <g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    <path d=\"M345.6,338.862c-29.184,0-53.248,23.552-53.248,53.248c0,29.184,23.552,53.248,53.248,53.248\n");
          out.write("                                                          c29.184,0,53.248-23.552,53.248-53.248C398.336,362.926,374.784,338.862,345.6,338.862z\" />\n");
          out.write("                                                    </g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    <path d=\"M439.296,84.91c-1.024,0-2.56-0.512-4.096-0.512H112.64l-5.12-34.304C104.448,27.566,84.992,10.67,61.952,10.67H20.48\n");
          out.write("                                                          C9.216,10.67,0,19.886,0,31.15c0,11.264,9.216,20.48,20.48,20.48h41.472c2.56,0,4.608,2.048,5.12,4.608l31.744,216.064\n");
          out.write("                                                          c4.096,27.136,27.648,47.616,55.296,47.616h212.992c26.624,0,49.664-18.944,55.296-45.056l33.28-166.4\n");
          out.write("                                                          C457.728,97.71,450.56,86.958,439.296,84.91z\" />\n");
          out.write("                                                    </g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    <path d=\"M215.04,389.55c-1.024-28.16-24.576-50.688-52.736-50.688c-29.696,1.536-52.224,26.112-51.2,55.296\n");
          out.write("                                                          c1.024,28.16,24.064,50.688,52.224,50.688h1.024C193.536,443.31,216.576,418.734,215.04,389.55z\" />\n");
          out.write("                                                    </g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    <g>\n");
          out.write("                                                    </g>\n");
          out.write("                                                    </svg>\n");
          out.write("                                                </a>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
