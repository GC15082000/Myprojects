package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
public class FirstServlet implements Servlet {
   // Servlet Life Cycle
    ServletConfig conf;

    /**
     *
     * @param conf
     */
    @Override
    public void init(ServletConfig conf)
    {   
        this.conf=conf;
        System.out.println("Creating first object ... ");
    }
    @Override
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException{
        System.out.println("servlice logic .....");
        // set the content type of response 
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1> this is my servlet page with logic </h1>");
        out.print("<h1>Today date is"+new Date().toString()+"</h1>");
        
    }
    
    @Override
    public void destroy(){
        System.out.println(" Going to destroy Service Object");
    } 
     // Non Life Cycle  methods
    
    @Override
    public ServletConfig getServletConfig(){
        return this.conf;    
    } 
    
    @Override
    public String getServletInfo(){
        
        return "this servlet is created by Gaurav";
        
    }
    
}
