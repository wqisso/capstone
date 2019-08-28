package com.postgraduate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.postgraduate.pojo.TbLesson;
import com.postgraduate.pojo.TbStudent;
import com.postgraduate.service.LessonService;
import com.postgraduate.service.StudentService;


@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<TbStudent> selectAll(){
		return studentService.selectAll();
	}
}
