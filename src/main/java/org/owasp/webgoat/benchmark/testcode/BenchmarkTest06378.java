package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest06378")
public class BenchmarkTest06378 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = request.getQueryString();
		
		
		String bar = "safe!";
		java.util.HashMap<String,Object> map34333 = new java.util.HashMap<String,Object>();
		map34333.put("keyA-34333", "a Value"); // put some stuff in the collection
		map34333.put("keyB-34333", param.toString()); // put it in a collection
		map34333.put("keyC", "another Value"); // put some stuff in the collection
		bar = (String)map34333.get("keyB-34333"); // get it back out
		
		
		response.getWriter().write(bar);
	}
}