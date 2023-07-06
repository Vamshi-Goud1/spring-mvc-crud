
package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

@Controller
public class Test {

	@Autowired
	TeacherService service;

	@RequestMapping("/load")
	public ModelAndView load() {
		ModelAndView andView = new ModelAndView("registerteacher.jsp");
		andView.addObject("teach", new Teacher());
		return andView;

	}

	@RequestMapping("/save")

	public ModelAndView saveTeacher(@ModelAttribute Teacher teacher) {
		service.saveTeacher(teacher);
		ModelAndView andView = new ModelAndView("home.jsp");

		return andView;

	}

	@RequestMapping("/displayall")
	public ModelAndView displayall() {
		List<Teacher> list = service.getAll();
		if (list.size() > 0) {
			ModelAndView m = new ModelAndView("display.jsp");
			m.addObject("list", list);
			return m;
		} else {
			ModelAndView m = new ModelAndView("home.jsp");
			m.addObject("mesg", "Add the Data");
			return m;
		}
	}

	@RequestMapping("/getbyid")
	public ModelAndView getById(@RequestParam int id) {
		Teacher t = service.getTeacherById(id);
		ModelAndView m = new ModelAndView("update.jsp");
		m.addObject("teacher", t);
		return m;
	}

	@RequestMapping("/updateteacher")
	public ModelAndView updateteacher(@ModelAttribute Teacher teacher) {
		Teacher t = service.updateTeacher(teacher);
		ModelAndView m = new ModelAndView("displayall");

		return m;
	}

	@RequestMapping("/deleteteacher")
	public ModelAndView deleteteacher(@RequestParam int id) {
		Teacher t = service.deleteTeacher(id);
		if (t != null) {
			ModelAndView m = new ModelAndView("displayall");
			return m;
		}
		return null;

	}

}
