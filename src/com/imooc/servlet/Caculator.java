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


//ʹ��Servlet��ɼӷ���������
//1������һ��htmlҳ�棬����һ������������㰴ť���ύ��Servlet���д���
//2���������ݴ��ݸ�Servlet��������������ӡ�����ҳ���ϡ�
//����Ч���μ���ͼ��
public class Caculator extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(request.getParameter("n"));
		int m=Integer.parseInt(request.getParameter("m"));
		int sum=n+m;
		response.setContentType("text/html;charset=utf-8");
		String html="<p>�ӷ�������:</p><br/><p>������Ϊ: "+ sum +"</p>";
        PrintWriter out = response.getWriter();
        out.println(html);
		
	}
	

}
