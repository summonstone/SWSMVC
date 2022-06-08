package com.sws.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sws.model.MemberDAO;
import com.sws.model.MemberVO;

public class MemberInsertController implements Controller {
	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ctp = request.getContextPath();

		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String birthday = request.getParameter("birthday");
		String phone = request.getParameter("phone");
//		Date regdate = request.getParameter("id");
		String email = request.getParameter("email");

		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPwd(pwd);
		vo.setName(name);
		vo.setGender(gender);
		vo.setBirthday(birthday);
		vo.setPhone(phone);
		vo.setEmail(email);

		MemberDAO dao = new MemberDAO();
		int cnt = dao.memberInsert(vo);
		String nextPage = null;
		if (cnt > 0) {
			nextPage = "redirect:" + ctp + "/memberList.do";
		} else {
			throw new ServletException("Not Insert");
		}

		return nextPage;
	}
}
