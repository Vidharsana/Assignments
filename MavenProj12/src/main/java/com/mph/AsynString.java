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
 * Servlet implementation class AsynString
 */
@WebServlet(urlPatterns="/AsynString",asyncSupported = true)
public class AsynString extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private static final ExecutorService executor=Executors.newFixedThreadPool(5);

   @Override
	public void destroy() {
		executor.shutdown();  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 AsyncContext ac = request.startAsync();
		 
	        executor.submit(() -> {
	            try {
	                
	                String inputText = request.getParameter("text");
	                
	                Thread.sleep(1000);
	                System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());

	               
	                String rev = new StringBuilder(inputText.toUpperCase()).reverse().toString();

	     
	                response.setContentType("text/plain");
	                response.getWriter().println("Processed Result: " + rev);

	            } catch (Exception e) {
	                e.printStackTrace();
	            } finally {
	                ac.complete();
	            }
	        });
	}

}
