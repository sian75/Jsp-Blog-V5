package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8090/blog/board
@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BoardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
	    if(cmd.equals("loginForm")) {
	    	//서비스호출
	    }else if(cmd.equals("login")) {
	    	//서비스호출
	    }
	}

}
