package com.imooc.servlet;
/**
  * ʹ��Servlet����n������Ȼ�����ۼӺͣ������������nͨ��url��ַ����
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
		//��ȡ������n
		String n=request.getParameter("n");
		//�õ��Ľ��
		int d=Integer.parseInt(n);
		int sum = 0;
	        for (int i = 1; i <= d; i++) {
	            sum += i;
	        }
		String result ="<h1 style='color:red'>"+sum+"</h1>";
//      �ӷ���������������ص��������ͨ��out���ͻ������
		PrintWriter out = response.getWriter();
//      ��html���ͻ������
	    out.println(result);
		
		
	}
	

}
