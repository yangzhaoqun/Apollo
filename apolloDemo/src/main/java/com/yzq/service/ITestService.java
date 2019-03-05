package com.yzq.service;

public interface ITestService {

	void searchStudentByStuNo(int stuNo);

	/**
	 * 批量插入数据，测试事务
	 */
	void saveStudent();

}
