package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//httpServlet是所有servlet的父类
public class FirstServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name=request.getParameter("name");
       String html="<h1 style='color:red'>hi,"+name+"!</h1><h1/>";
       System.out.println("返回给浏览器的响应数据为："+html);
//       从服务器向浏览器返回的输出流，通过out发送回浏览器
       PrintWriter out=response.getWriter();
       out.println(html);
//       将html发送回浏览器
       
	}
   
}
