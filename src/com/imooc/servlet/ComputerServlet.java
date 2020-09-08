package com.imooc.servlet;
/**
  * 使用Servlet计算n以内自然数的累加和，并输出，参数n通过url地址传递
 * @author Anna
 * @Date 2020/9/6
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComputerServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取到变量n
		String n=request.getParameter("n");
		//得到的结果
		int d=Integer.parseInt(n);
		int sum = 0;
	        for (int i = 1; i <= d; i++) {
	            sum += i;
	        }
		String result ="<h1 style='color:red'>"+sum+"</h1>";
//      从服务器向浏览器返回的输出流，通过out发送回浏览器
		PrintWriter out = response.getWriter();
//      将html发送回浏览器
	    out.println(result);
		
		
	}
	

}
