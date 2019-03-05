package com.yzq.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yzq.dao.ITestDAO;
import com.yzq.pojo.Student;
import com.yzq.service.ITestService;

@Service
public class TestServiceImpl implements ITestService {

	@Autowired
	private ITestDAO iTestDAO;

	/**
	 * 根据序号查询
	 */
	public void searchStudentByStuNo(int stuNo) {
		Student student = iTestDAO.searchStudentByStuNo(stuNo);
		System.out.println(student.getStuNo() + "" + student.getStuName() + "" + student.getStuAge());
	}

	/**
	 * 批量插入数据，测试事务
	 */
	
	public void saveStudent() {
		Student stu1 = new Student();
		stu1.setStuNo(3);
		stu1.setStuName("wangwu");
		stu1.setStuAge("10");
		
		Student stu2 = new Student();
		stu2.setStuNo(4);
		stu2.setStuName("zhaoliu");
		stu2.setStuAge("12");
		
		Student stu3 = new Student();
		stu3.setStuNo(1);
		stu3.setStuName("zhangsan");
		stu3.setStuAge("10");
		
		iTestDAO.saveStudent(stu1);
		iTestDAO.saveStudent(stu2);
		iTestDAO.saveStudent(stu3);
	}

}
