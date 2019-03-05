package com.yzq.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yzq.service.ITestService;

@Controller
@RequestMapping("testController")	
public class TestController {
	
	@Autowired
	private ITestService iTestService;

	/**
	 * 根据序号查询
	 */
	@RequestMapping("searchStudentByStuNo")
	public void searchStudentByStuNo(){
		System.out.println("--->开始插入数据");
		
		//批量插入数据，测试事务
		iTestService.saveStudent();	
	}
	
}
