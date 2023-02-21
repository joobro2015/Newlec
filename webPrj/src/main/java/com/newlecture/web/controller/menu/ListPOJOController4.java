package com.newlecture.web.controller.menu;

import com.newlecture.web.service.DefaultMenuService;
import com.newlecture.web.service.MenuService;

public class ListPOJOController4{
	
	private int x =1;
	private int y =3;
	
	
	private MenuService service;
	
	public ListPOJOController4(){
		service = new DefaultMenuService();
	}
	
	public int add(int x, int y) {
		return x+y;
	}
	


	public String requestHandler(String id, String query) {
		return "/WEB-INF/view/menu/list.jsp";
		
	}
}
