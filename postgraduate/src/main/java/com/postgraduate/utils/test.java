package com.postgraduate.utils;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.postgraduate.pojo.TbLesson;
import com.postgraduate.pojo.TbStudent;
import com.postgraduate.service.LessonService;
import com.postgraduate.service.StudentService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/applicationContext-*.xml",
        "classpath:spring/springmvc.xml" })
public class test {
	@Resource
    private LessonService plessonService;
	
	
	@Test
    public void findUserTest(){
		TbLesson plesson =new TbLesson();
		//plesson.setId(1);
		plesson.setName("物联网");
		List<TbLesson> plesson2 = plessonService.selectPart(plesson);
		for (TbLesson str : plesson2) {
            System.out.println(JSON.toJSONString(str));
        }
    }
	
	@Resource
	private StudentService studentService;
	
	@Test
	public void Test1() {
		List<TbStudent> ts = studentService.selectAll();
		for (TbStudent str : ts) {
            System.out.println(JSON.toJSONString(str));
        }
	}
}
