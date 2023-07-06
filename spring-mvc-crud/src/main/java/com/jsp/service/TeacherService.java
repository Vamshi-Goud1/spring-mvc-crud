package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

@Controller
public class TeacherService {

	@Autowired
	TeacherDao dao;

	public Teacher saveTeacher(Teacher teacher) {
		return dao.saveTeacher(teacher);
	}

	public Teacher getTeacherById(int id) {
		return dao.getTeacherById(id);
	}

	public List<Teacher> getAll() {
		return dao.getAll();
	}

	public Teacher deleteTeacher(int id) {
		return dao.deleteTeacher(id);
	}

	public Teacher updateTeacher(Teacher teacher) {
		return dao.updateTeacher(teacher);
	}

	public Teacher deleteByName(Teacher teacher) {
		return dao.deleteByName(teacher);
	}
}
