package com.sws.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberInsertController implements Controller {
	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ctp = request.getContextPath();

		String id = request.getParameter("id");
		String pwd = request.getParameter("id");
		String name = request.getParameter("id");
		String gender = request.getParameter("id");
		String birthday = request.getParameter("id");
		String phone = request.getParameter("id");
//		Date regdate = request.getParameter("id");
		String email = request.getParameter("id");

		return "memberInert";
	}
}
