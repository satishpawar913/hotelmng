package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.helper.Message;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public String login(HttpSession session) {
		session.setAttribute("message", new Message("Successfully Registered", "alert-success"));
		return "login";
	}
}
