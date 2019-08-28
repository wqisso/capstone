package com.postgraduate.service;

import java.util.List;

import com.postgraduate.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	public List<TbBrand> findAll();
	/**
	 * 分页
	 * 
	 *
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 增加
	 * 
	 *
	 */
	public void add(TbBrand brand);
	/**
	 * 修改
	 * 
	 *
	 */
	public void update(TbBrand brand);
	/**
	 * 根据id查询
	 * 
	 *
	 */
	public TbBrand findOne(Long id);
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);
	
	/**
	 * @param brand
	 * @param pageNum 当前页码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbBrand brand,int pageNum,int pageSize);
}
