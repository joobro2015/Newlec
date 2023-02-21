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
import com.newlecture.web.service.MenuService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/menu/list2")
public class ListController2 extends HttpServlet{
	
	private MenuService service;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Menu> menus = new ArrayList<Menu>();
		
//		NList menus = new NList();
		
		resp.setCharacterEncoding("UTF-8");
		//브라우저에서 html로 읽고 UTF-8로 읽어라 하고 헤더에 넣어줌.
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		String haha = (String) session.getAttribute("haha");
		System.out.println(haha);
		
		 Cookie[] cookies = req.getCookies(); //원하는 쿠키만 받을 수 없고 다 가져옴
		 	for(Cookie cookie : cookies)
		 		if(cookie.getName().equals("haha")) {
		 			System.out.println(cookie.getValue());
		 		}

		
//		Menu[] list = service.getList();
//		int count = service.count();

//		String query = "";
//		String sql = String.format("select * from member where nicname like '%s'", "%"+query+"%") ;
////		List<Menu> list = new ArrayList<>();
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@oracle.newlecture.com:1521/xepdb1";
//			Connection con = DriverManager.getConnection(url, "NEWLEC", "rland");
//			
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(sql);
//			
////			Menu[] menus = new Menu[100];
//			
//			
//			
//			
//			// 필터링, 집계, 정렬
//			while(rs.next())	// 서버의 커서를 한칸 내리고 그 위치의 레코드를 옮겨 오는 것. -> 레코드 하나가 저장되는 공간은?
//			{
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				String nicName = rs.getString("nicname");
//				Date regDate = rs.getDate("reg_date");
//				String images = "pic1.png,pic2.png,pic3.png,pic4.png,pic5.png";
//				
//				Menu menu = new Menu(id, name, 1000, "", regDate);
//				menu.setImages(images);
//				
//				menus.add(menu);
//				
////				menus.add(3);
//			}
//			
//			con.close();
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		req.setAttribute("menus", menus);
//		resp.sendRedirect("listView");
		//response 출력도구
		//sendRedirect 다른곳에 정보전달
		// list2를 요청받았지만 listview로 찾아가라고 재응답
//		 forward 방법 서버에서 서버로 바로 요청
		req.getRequestDispatcher("/WEB-INF/view/menu/list.jsp")
		.forward(req, resp);
		
//		forward를 통해 두개의 객체를 공유
//		list2를 요청했지만 잠시만 기다려라고하고
//		listview를 물어봐서 들고옴
		
//		셰션, 쿠키 쿼리스트링, 리퀘스트 히든필드
		
//		페이지저장소 리퀘스트저장소 세션 저장소 어플리케이션 저장소 서버상 데이터 저장을 위한 프로
//		============================================
		
//		out.write("<!DOCTYPE html>");
//		out.write("<html>");
//		out.write("<head>");
//		out.write("<meta charset=\"UTF-8\">");
//		out.write("<title>Insert title here</title>");
//		out.write("</head>");
//		out.write("<body>");
//		out.write("<h1>메뉴 목록</h1>");
//		out.write("<table>");
//		out.write("<tr>");
//		out.write("<td>번호</td>");
//		out.write("<td>이름</td>");
//		out.write("<td>가격</td>");		
//		out.write("</tr>");
//		
//		for(int i=0; i<menus.size(); i++) {
//			// 형식 변환
//			Menu m = (Menu) menus.get(i);
//			
//		out.write("<tr>");	
//		out.write("	<td>"+m.getId()+"</td>");	
//		out.write("	<td>"+m.getName()+"</td>");	
//		out.write("	<td>5000</td>");				
//		out.write("</tr>");
//		}
//		
//		out.write("</table>");	
//		out.write("</body>");	
//		out.write("</html>");	
		
	}
}
