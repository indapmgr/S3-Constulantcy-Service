package com.s3.demo;

public class Employee extends CustomerClass {

	private double totalHours;
	private int Salary;

	public double getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(double totalHours) {
		this.totalHours = totalHours;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}

	@Override
	public int getPhone() {
		// TODO Auto-generated method stub
		return super.getPhone();
	}

	@Override
	public void setPhone(int phone) {
		// TODO Auto-generated method stub
		super.setPhone(phone);
	}

	@Override
	public String getJobType() {
		// TODO Auto-generated method stub
		return super.getJobType();
	}

	@Override
	public void setJobType(String jobType) {
		// TODO Auto-generated method stub
		super.setJobType(jobType);
	}

}
