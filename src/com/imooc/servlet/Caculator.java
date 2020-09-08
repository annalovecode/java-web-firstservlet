package com.imooc.servlet;
/**
 * @author Anna
 * @date 2020/9/8
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//使用Servlet完成加法计算器：
//1、创建一个html页面，定义一个表单，点击计算按钮，提交给Servlet进行处理
//2、将表单数据传递给Servlet，并将计算结果打印输出在页面上。
//运行效果参见下图：
public class Caculator extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(request.getParameter("n"));
		int m=Integer.parseInt(request.getParameter("m"));
		int sum=n+m;
		response.setContentType("text/html;charset=utf-8");
		String html="<p>加法计算器:</p><br/><p>运算结果为: "+ sum +"</p>";
        PrintWriter out = response.getWriter();
        out.println(html);
		
	}
	

}
