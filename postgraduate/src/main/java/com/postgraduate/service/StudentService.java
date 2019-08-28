package com.postgraduate.service;

import java.util.List;


import com.postgraduate.pojo.TbStudent;

public interface StudentService {
	/**
	 * 查询全部课程
	 * @return
	 */
	public List<TbStudent> selectAll();
	/**
	 * 查询单个课程
	 * @return
	 */
	public TbStudent selectOne(int id);
	/**
	 * 模糊查询课程
	 * @return
	 */
	public List<TbStudent> selectPart(TbStudent tbStudent);
}
