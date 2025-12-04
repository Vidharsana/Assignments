package com.mph;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Servlet implementation class Asyncservlet
 */
@WebServlet(urlPatterns="/Asyncservlet",asyncSupported = true)
public class Asyncservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private static final ExecutorService executor=Executors.newSingleThreadExecutor();
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
		AsyncContext ac = request.startAsync();
        executor.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
                String uname = request.getParameter("uname");
                String pwd = request.getParameter("pwd");
                if (uname.equals("vidhu") && pwd.equals("12345")) {
                    response.getWriter().println("Authentication successful");
                } else {
                    response.getWriter().println("Invalid Credentials");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                ac.complete(); 
            }
        });
    }
		
		
		
		
		
	}	


