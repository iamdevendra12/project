package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.ISpDao;



@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private ISpDao dao;

	public AdminController() {
		System.out.println("in ctor of " + getClass().getName());
	}

	// req handling method for listing sp dtls
	@GetMapping("/list")
	public String listsp(Model map) {
		System.out.println("in list sp");
		map.addAttribute("sp_list", dao.listofsp());
		return "/admin/list";
	}
}