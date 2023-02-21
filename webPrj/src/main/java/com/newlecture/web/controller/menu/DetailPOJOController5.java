package com.newlecture.web.controller.menu;

import com.newlecture.web.service.DefaultMenuService;
import com.newlecture.web.service.MenuService;

public class DetailPOJOController5{
	
	private MenuService service;
	
	public DetailPOJOController5(){
		service = new DefaultMenuService();
	}
	
	
	public String requestHandler() {
		
			return "/WEB-INF/view/menu/detail.jsp";
		
		
		
	}
}
