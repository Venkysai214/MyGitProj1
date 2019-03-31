package com.nt.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.service.Handler;
import com.nt.service.LocaleCountry;
import com.nt.service.LocaleLang;

public class FrontControllerServlet extends HttpServlet  {
        public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
             Handler handler=null;      
        	LocaleLang llang=null;
        String locale=null;
        	 LocaleCountry ctry=null;
        	RequestDispatcher rd=null;
      try {
        	if(req.getServletPath().equalsIgnoreCase("/lang.htm")) {
        		handler=new LocaleLang();
               locale=handler.execute(req, res);
        		//	pw.println(sysDate);
        		req.setAttribute("result", locale);
        	}
        	else if(req.getServletPath().equalsIgnoreCase("/country.htm")) {
        		handler=new LocaleCountry();
        		locale=handler.execute(req, res);
        		req.setAttribute("result", locale);
        	}
      }
      catch(Exception e) {
    	  e.printStackTrace();
      }
        	if(req.getScheme().equalsIgnoreCase("/lang.htm")) {
        		rd=req.getRequestDispatcher("/show_lang.jsp");
        		rd.forward(req, res);
        		
        	}
        	else if(req.getServletPath().equalsIgnoreCase("/country.htm")) {
        		rd=req.getRequestDispatcher("/show_ctry.jsp");
        		rd.forward(req, res);
        	}
        	
        }
        @Override
    	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	 doGet(req,res);
    	}

}
