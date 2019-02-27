package com.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

public class OlaMundoAction {

	
	@Action(value = "olaMundo", results = {
			@Result(name = "ok", location = "/segunda.jsp")
	})
	public String execute() {
		System.out.println("Ok Google");
		return "ok";
	}
	
}
