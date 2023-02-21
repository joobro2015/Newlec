package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class InputController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		1. 쿼리 스트링을 이용한 입력
//		QueryStiring 이란? : 문서를 요청하면서 요청하는 추가 옵션 값
//		예 : 페이지, 검색어, 레코드 개수, 기간...
//		그럼 위의 옵션들은 누가 결정하는 것인가? 서버
//		그럼 어떤 식으로 서버가 그 값들을 받도록 할 것인가?
		
		// 입력 값은 무조건 문자열으로 바로 int로 사용할 수는 없다.
//		int page = request.getParameter("p");
		response.setContentType("text/html; charset=UTF-8");
		String page = request.getParameter("p");
		String query = request.getParameter("q");
		String size = request.getParameter("s");
		
//		위의 쿼리스트링에서 size를 입력 받기 위한 키워드를 왜 굳이 s라했나 size로하지
//		웹주소는 길이제한을 가지고있어서
//		과거 플랫폼과의 호환성 때문이다.
//		여담이지만 최근에는 제한이 없다는 말도 있다.
		
		
//		그럼 요청하는 방법은?
//		input? p = 1
//		요청하는 값은 사용자가 ?를 사용함
		PrintWriter out = response.getWriter();
		
		page = request.getParameter("p");
		query = request.getParameter("q");
		size = request.getParameter("s");
		
		
		
//		2. from을 이용한 입력
//		사실 쿼리 스트링은 사용자가 전달하는 값이라기 보다 페이지를 제공하는 쪽에서 
//		정해진 값을 선택하게 하는 방식이다.
//		예를 들어 쿼리스트링은 사용자가 URL창을 직접 편집하는 것이 아니라 
//		다음처럼 링크에 있는경우가 일반적
//		<a href =" /input?p=2&q=hello&s=15>2<a/>
//		<a href =" /input?p=3&q=hello&s=15>1<a/>
//		위와 같이 이미 정해진 값들 중에 하나의 링크를 선택함으로써 입력을 요청하게 됩니다.
//		반면에 사용자가 값을 직접 입력하게 하고 싶다면 어떻게 할까?
//		그 떄는 from을 제공함으로써 입력을 하게 됩니다.
		
		
		request.setAttribute("page", page);
		request.setAttribute("query", query);
		request.setAttribute("size", size);
		
		String[] hbs = request.getParameterValues("hb");
		
		request.setAttribute("cnt", hbs.length);
//		3.쿠키 입력
		
		
//		Header 입력
		
		
		
//		5.hiddenr 필드 입력
		
		request.getRequestDispatcher("/WEB-INF/view/input.jsp").forward(request, response);	}
}

