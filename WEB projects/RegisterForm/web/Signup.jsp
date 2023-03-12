<%-- 
    Document   : reg.jsp
    Created on : 01-Feb-2023, 9:34:51 pm
    Author     : GAURAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
    </head>
    <body style="background:url(img/Images.jpg);background-size:cover; background-attachment: fixed">
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    
                    <div class="card">
                        
                        <div class="card-content">
                            
                            <h3> Register Here!!</h3>
                            <div class="form">
                                <!--creating form-->
                                
                                <form action="Register" method="post">
                                    <input type="text" name="user_name" placeholder="Enter_user name"/>
                                    <input type="password" name="user_password" placeholder="Enter_user password"/>
                                    <input type="email" name="user_email" placeholder="Enter_user email"/>
                                    <button type="submit" class="btn blue"> Submit </button>
                                </form>
                            </div> 
                            
                            <div class="loader centre-align" style="margin-top: 10px">
                                <div class="preloader-wrapper big active">
                                    <div class="spinner-layer spinner-blue">
                                      <div class="circle-clipper left">
                                        <div class="circle"></div>
                                      </div><div class="gap-patch">
                                        <div class="circle"></div>
                                      </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                      </div>
                                    </div>

                                    <div class="spinner-layer spinner-red">
                                      <div class="circle-clipper left">
                                        <div class="circle"></div>
                                      </div><div class="gap-patch">
                                        <div class="circle"></div>
                                      </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                      </div>
                                    </div>

                                    <div class="spinner-layer spinner-yellow">
                                      <div class="circle-clipper left">
                                        <div class="circle"></div>
                                      </div><div class="gap-patch">
                                        <div class="circle"></div>
                                      </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                      </div>
                                    </div>

                                    <div class="spinner-layer spinner-green">
                                      <div class="circle-clipper left">
                                        <div class="circle"></div>
                                      </div><div class="gap-patch">
                                        <div class="circle"></div>
                                      </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                      </div>
                                    </div>
                                  </div>
                              
                            </div>
                              <h5>Please Wait!</h5>
                        </div>
                    </div>
                </div>
                
            </div>
        
        </div>
<script src="https://code.jquery.com/jquery-3.6.3.js" 
integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" 
crossorigin="anonymous"></script>
 
<script>
   $(document).ready(function(){
       console.log("page....");
   });
  </script>
    </body>
</html>
