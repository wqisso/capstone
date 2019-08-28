package com.postgraduate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.postgraduate.pojo.TbBrand;
import com.postgraduate.service.BrandService;

import entity.*;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<TbBrand> findAll(){
		return brandService.findAll();		
	}
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int rows) {
		return brandService.findPage(page, rows);
	}
	@RequestMapping("/add")
	public Result add(@RequestBody TbBrand brand) {
		try{
			brandService.add(brand);
			return new Result(true,"增加成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"增加失败");
		}
		
	}
	/**
	 * 修改
	 * @param brand
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBrand brand) {
		try {
			brandService.update(brand);
			return new Result(true,"修改成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"修改失败");
		}
	}
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbBrand findOne(Long id) {
		return brandService.findOne(id);
	}
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long[] ids) {
		try {
			brandService.delete(ids);
			return new Result(true,"删除成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"删除失败");
		}
	}
	/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */

	@RequestMapping("/search")
	public PageResult search(@RequestBody TbBrand brand,int page,int rows) {
		return brandService.findPage(brand, page,rows);
	}
}
