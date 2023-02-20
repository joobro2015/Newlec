package com.newlecture.web.controller.menu;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.newlecture.web.entity.GList;
import com.newlecture.web.entity.Menu;
import com.newlecture.web.service.DefaultMenuService;
import com.newlecture.web.service.MenuService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/menu/list3")
public class ListController3 extends HttpServlet{
	
	private MenuService service;
	
	public ListController3(){
		service = new DefaultMenuService();
	}
	
//	인증이 안되거나 권환이 없거나 이 요청에 대한 응답을 처리할 수 없는 경우
//	우리는 어떤 상태 코드를 전달해야할까? 사용자에게 : 403
//	400 에러는 뭘 뜻하는 걸까? 인자가 일치하지 않을 때
	//Post 요청에 응답할 수 있는 메소드 처리할수가 없을경우의 오류상태 코드 : 405
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		resp.setCharacterEncoding("UTF-8");
		//브라우저에서 html로 읽고 UTF-8로 읽어라 하고 헤더에 넣어줌.
		resp.setContentType("text/html; charset=UTF-8");
		
		req.getParameter("c");
		
		
		PrintWriter out = resp.getWriter();
		List<Menu> menus = new ArrayList<>();	//service.getList();
//------------------------Session--------------------------------
//		HttpSession session = req.getSession();
//		session.setAttribute("haha", "hoho");
		//("이름","데이터")
//		---------------------------------------------
		
//		----------------Cookie---------------------------
		
		Cookie cookie = new Cookie("haha", "hoho");
		cookie.setPath("/");
		cookie.setMaxAge(60*24);
//		cookie.setMaxAge(분);
		//경로 설정하지 않을 시 현재 서버의 경로에만 쿠키가 간다
		//경로 설정에 맞게 쿠키를 데려갈 수 있음 세션은 안됨        
		resp.addCookie(cookie);
		
		
		
		req.setAttribute("menus", menus);

		req.getRequestDispatcher("/WEB-INF/view/menu/list.jsp")
		.forward(req, resp);
		
		
		
	}
}
