<%-- 
    Document   : searchResults
    Created on : Apr 12, 2019, 10:33:08 AM
    Author     : user
--%>
<%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
    
    if(request.getSession().getAttribute("uname")==null)
    {
%>
<script>
        location = "Login.jsp";
    </script>
    <%
    }
    else
    {
    %>
<%@page import="Modal.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modal.Pet"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Pet Shop | Search Results</title>
        <script src="all.js"></script>
	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
        <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="assets/css/animate.min.css" rel="stylesheet"/>

    <!--  Light Bootstrap Table core CSS    -->
    <link href="assets/css/light-bootstrap-dashboard.css?v=1.4.0" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="assets/css/demo.css" rel="stylesheet" />


    <!--     Fonts and icons     -->
    <link href="C:/Users/user/Desktop/Assignments/Assignment-1/fontawesome/css/fontawesome.min.css" rel="stylesheet">
    <link href="assets/css/pe-icon-7-stroke.css" rel="stylesheet" />
    <style type="text/css">
        .main-panel > .content
        {
            background-image: url("t5.png");
            background-repeat: repeat;
        }
        .col-md-3{
/*            background-color: rgba(0,0,0,0.5);
*/            color:white;
        }
        .card{
            background-color: #f1f1f1;
            color:white;
        }
        .btn
        {
          background-color: dodgerblue;
          color:white;
          padding:10px 12px;
          outline: none;
          margin-left: 55px;
          border:none;
          cursor:pointer;
        }
    </style>
</head>
<body>

<div class="wrapper">
        <div class="sidebar" data-image="assets/img/dog1.jpg" >

<!--     <div class="sidebar" data-color="orange" data-image="assets/img/sidebar-5.jpg">
 -->
    <!--

        Tip 1: you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple"
        Tip 2: you can also add an image using data-image tag

    -->

    	<div class="sidebar-wrapper" style="background-color:#000cff1a">
            <div class="logo">
                <a href="#" class="simple-text" style="color:black;font-size: 20px;font-weight: bold;">
                    Pet Shop
                </a>
            </div>
<%
                        
                        ArrayList<Customer> c = (ArrayList<Customer>)session.getAttribute("customer");
                    %>
            <ul class="nav" >
                <li class="active">
                    <a href="dashboard.html">
                        <i class="pe-7s-graph" style="color:black;font-size: 25px;"></i>
                        <p style="color:black;font-size: 15px;">Today's Deals</p>
                    </a>
                </li>
                <li>
                    <a href="userProfile.jsp">
                        <i class="pe-7s-user" style="color:black;font-size: 25px;"></i>
                        <p style="color:black;font-size: 15px;">Account Info</p>
                    </a>
                </li>
                 <li>
                    <a href="showDeliveredOrders?u_name<%= c.get(0).getUname() %>">
                        <i class="pe-7s-note2" style="color:black;font-size: 25px;"></i>
                        <p style="color:black;font-size: 15px;">Past Orders</p>
                    </a>
                </li>
                <li>
                    <a href="showPendingOrders?u_name=<%= c.get(0).getUname() %>">
                        <i class="pe-7s-news-paper" style="color:black;"></i>
                        <p style="color:black;font-size: 15px;">Recent Orders</p>
                    </a>
                </li>
            </ul>
    	</div>
    </div>

    <div class="main-panel">
        <nav class="navbar navbar-default navbar-fixed">
            <div class="container-fluid" style="background-color: #000cff1a">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    
                    <a class="navbar-brand" href="#" style="color:black;">Welcome, <%= c.get(0).getName() %></a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                        <li class="dropdown">
                              <a href="getAllCart">
                                  <%
                                      int count = (int)(Integer)session.getAttribute("count");
                                  %>
                                    <i class="fa fa-shopping-cart" style="font-size:30px;color:black;"></i>
                                    <b class="caret hidden-lg hidden-md"></b>
                                    <span class="notification hidden-sm hidden-xs"><%= count %></span>
                                    <p class="hidden-lg hidden-md" style="color:black;">
										<%= count %> Items Cart
										<b class="caret"></b>
									</p>
                              </a>
                        </li>
                        <li>
                           <p>                        </p>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-center" style="margin-left:100px;">
                        <li>
                               <form action="searchPet" class="form-inline" style="text-align: center;">
                                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="srch">
                                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit" style="color:black;">Search</button>
                                </form>
                        </li>
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li>
                           <a href="userProfile.jsp">
                               <p style="color:black;">Account</p>
                            </a>
                        </li>
                        <li>
                            <a href="Logout.jsp">
                                <p style="color:black;">Log out</p>
                            </a>
                        </li>
			<li class="separator hidden-lg"></li>
                    </ul>
                </div>
            </div>
        </nav>


        <div class="content" >
            <div class="container-fluid">
                <div class="row">
                    
                    <%
                        ArrayList<Pet> pl = (ArrayList<Pet>)session.getAttribute("searPet");
                       if(pl!=null  && !pl.isEmpty()){
                           System.out.println("done");
                        for(int i=0;i<pl.size();i++){    
                    %>
                    
                    <div class="col-md-3">
                        <div class="card">

                            <div class="header">
                                <h4 class="title"><%= pl.get(i).getBreed() %></h4>
                                <p class="category"><%= pl.get(i).getAge() %></p>
                            </div>
                            <div class="content">
                                <%
                                    String s[] = pl.get(i).getBreed().split(" ");
                                    String str ="" ;
                                    if(s.length !=1){
                                        if(s.length!=3){
                                          str= str+s[0]+s[1];
                                        }
                                        else{
                                            str=str+s[0]+s[1]+s[2];
                                        }
                                      }
                                      else{
                                          str=str+s[0];
                                      }
                                %>
                                <img src="<%= str%>.jpg" alt="..." class="img-thumbnail">
                                <div class="footer">
                                    <div class="legend">
                                        <h5><%= pl.get(i).getPrice() %></h5>
                                    </div>
                                    <hr>
                                    <div class="stats">
                                        <a href="addToCart?breed=<%= pl.get(i).getBreed() %>&usname=<%= (String) session.getAttribute("uname") %>&price=<%= pl.get(i).getPrice() %>&gen=<%= pl.get(i).getGender() %>&cartt=<%= count %>&ages=<%= pl.get(i).getAge() %>"><center><button class="btn" style="text-align: center;"><i class="fa fa-shopping-cart" style="font-size:10px;color:white;"></i>Add To Cart</button></center></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <%
                        }
                      }
                      else{
                    %>
                        <div class="col-md-3">
                            <div class="card">
                                <div class="header">
                                    <h4 class="title">Nothing To Display</h4>
                                </div>
                            </div>
                        </div>
                    <%
                        }
                    %>
                </div>

            </div>
        </div>
    </div>
</div>


</body>

    <!--   Core JS Files   -->
    <script src="assets/js/jquery.3.2.1.min.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

	<!--  Charts Plugin -->
	<script src="assets/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="assets/js/bootstrap-notify.js"></script>

    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->
	<script src="assets/js/light-bootstrap-dashboard.js?v=1.4.0"></script>

	<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->
	<script src="assets/js/demo.js"></script>

	<!-- <script type="text/javascript">
    	$(document).ready(function(){

        	demo.initChartist();

        	$.notify({
            	icon: 'pe-7s-gift',
            	message: "Welcome to <b>Light Bootstrap Dashboard</b> - a beautiful freebie for every web developer."

            },{
                type: 'info',
                timer: 4000
            });

    	});
	</script> -->
<!-- style="background-image: url("assets/img/dog1.jpg");" -->
</html>
<%
  }  
%>