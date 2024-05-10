package poly.servlet;

import java.util.Date;

public class Student {
	String name = "Nguyễn Nghiệm";
	double mark = 9.5;
	boolean gender = true;
	Date birthday = new Date();
	
	public Student() {
		super();
	}
	
	public Student(String name, double mark, boolean gender, Date birthday) {
		super();
		this.name = name;
		this.mark = mark;
		this.gender = gender;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
