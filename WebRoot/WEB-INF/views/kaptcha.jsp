<%@page import="java.io.Console"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'kaptcha.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="http://ip.chinaz.com/getip.aspx"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table>  
        <tr>  
            <td><img id="kaptchaImage"  src="static/images/kaptcha.jpg" /></td>  
            <td valign="top">  
          
                <form method="POST">  
                    <br>sec code:<input type="text" name="kaptchafield"><br />  
                    <input type="submit" name="submit">  
                </form>  
            </td>  
        </tr>  
    </table>    
  
    <br /><br /><br /><br />  
      
    <%  
        String kaptcha = (String)request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);  
        String parm = (String) request.getParameter("kaptchafield");  
          
        out.println("Parameter: " + parm + " ? Session Key: " + kaptcha + " : ");  
          
        if (kaptcha != null && parm != null) {  
            if (kaptcha.equals(parm)) {  
                out.println("<b>true</b>");  
            } else {  
                out.println("<b>false</b>");  
            }  
          }
    %> 
  </body>
  <script src="static/js/jquery-3.2.1.min.js"></script>
  <script type="text/javascript">
  console.info("<%=basePath%>");
  console.info("<%=path%>");
  console.info("<%=kaptcha%>");
  $(function(){    
        $("#kaptchaImage").click(function () { $(this).attr('src', 'static/images/kaptcha.jpg?' + Math.floor(Math.random()*100) ); })    
    }); 
  
  </script>
</html>
