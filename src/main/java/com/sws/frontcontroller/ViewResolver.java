package com.sws.frontcontroller;

public class ViewResolver {

	public static String makeView(String nextPage) {
		return "/WEB-INF/view/" + nextPage + ".jsp";
	}

}
