/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GAURAV
 */
public class RegisterServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> Welcome to Register Servlet </h1>");
        String name=req.getParameter("user_name");
        String password=req.getParameter("user_password");
        String email=req.getParameter("user_email");
        String gender=req.getParameter("user_gender");
        String course=req.getParameter("user_course");
        String con=req.getParameter("condition");
        if(con!=null){
        if(con.equals("checked"))
        {
           out.println("<h2> You have accepted terms and conditions</h2>");          
           out.println("<h2> Name:" + name +"</h2>");
           out.println("<h2> Password:" + password +"</h2>");
           out.println("<h2> Email:" + email +"</h2>");
           out.println("<h2> Gender:" + gender +"</h2>");
           out.println("<h2> Course:" + course +"</h2>");
           
           //save to data base gc
           RequestDispatcher rd=req.getRequestDispatcher("success");
           rd.forward(req, resp);
        }
       
        }
        if(con==null){
            out.println("<h2> You have not accepted terms and conditions</h2>");
        // include output of index.html
        //get the object of request Dispatcher
        RequestDispatcher rd=req.getRequestDispatcher("index.html");
        //include
        rd.include(req,resp);
        }
    }
}
