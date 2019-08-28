package com.postgraduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgraduate.mapper.TbStudentMapper;
import com.postgraduate.pojo.TbStudent;
import com.postgraduate.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private TbStudentMapper tbStudentMapper;
	
	@Override
	public List<TbStudent> selectAll() {
		
		return tbStudentMapper.selectAll();
	}

	@Override
	public TbStudent selectOne(int id) {
		return null;
	}

	@Override
	public List<TbStudent> selectPart(TbStudent tbStudent) {
		
		return null;
	}

}
