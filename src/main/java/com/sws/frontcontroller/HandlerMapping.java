package com.sws.frontcontroller;

import java.util.HashMap;

import com.sws.controller.Controller;
import com.sws.controller.*;

public class HandlerMapping {
	private HashMap<String, Controller> mappings;

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/memberRegister.do", new MemberRegisterController());
		mappings.put("/memberInsert.do", new MemberInsertController());
	}

	public Controller getController(String command) {
		return mappings.get(command);
	}

}
