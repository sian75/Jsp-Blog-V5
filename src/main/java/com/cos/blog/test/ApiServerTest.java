package com.cos.blog.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//localhost:8080/blog/test(GET,POST)
@WebServlet("/test")
public class ApiServerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ApiServerTest() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		String mime = request.getContentType();
		
		System.out.println(mime);
		
		request.setCharacterEncoding("UTF-8");
		if(mime.equals("application/json")) {
			
			BufferedReader br = request.getReader();
			String input;
			StringBuffer buffer = new StringBuffer();
			while((input = br.readLine()) != null) {
				buffer.append(input);
			}
			System.out.println(buffer.toString());
			//out.println("{\"food\":"+food+",\"method\":"+method+"}");
		}else {
			String food = request.getParameter("food");
			String method = request.getParameter("method");
			System.out.println(food);
			System.out.println(method);
		}
		
		//db에 insert하고 끝
		
		int result = 1; //정상
		PrintWriter out = response.getWriter();
//		if(result==1) {
//			out.println("{\"food\":,"+food+"\"method\":"+method+"}");
//		}else {
//			out.println("{\"error\":\"fail\"}");
//		}
		out.println(1);
		out.flush();
		*/
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>안녕</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

}
