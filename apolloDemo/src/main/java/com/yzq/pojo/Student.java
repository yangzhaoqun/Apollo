package com.yzq.pojo;

import lombok.Data;

/**
 * 实体类（学生）
 *
 */
@Data
public class Student {

	private int stuNo;
	private String stuName;
	private String stuAge;
	
	
	public Student(int stuNo, String stuName, String stuAge) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}

	public Student() {
	}
	
	
}
