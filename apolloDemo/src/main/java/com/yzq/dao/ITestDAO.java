package com.yzq.dao;

import org.springframework.stereotype.Repository;

import com.yzq.pojo.Student;

@Repository
public interface ITestDAO {
	
	/**
	 * 根据序号查询
	 */
	Student searchStudentByStuNo(int stuNo);

	/**
	 * 批量插入数据，测试事务
	 */
	void saveStudent(Student stu);


}
