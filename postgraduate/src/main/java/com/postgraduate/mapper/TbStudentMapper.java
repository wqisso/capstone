package com.postgraduate.mapper;

import java.util.List;

import com.postgraduate.pojo.TbStudent;

public interface TbStudentMapper {
	//查询所有学生信息
	List<TbStudent> selectAll();
	//查询单条记录
	TbStudent selectOne(int id);
	//模糊查询
	List<TbStudent> selectPart(TbStudent tbStudent);
	
}
