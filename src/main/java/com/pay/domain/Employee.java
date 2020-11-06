package com.pay.domain;

import java.util.List;

public class Employee {
	private long empId;
	private String empName;
	private List<String> dependents;
	private double deduction;
	private double discount;
	private double paycheckAfterDiscountDeduction;
	
	
	public Employee() {}


	public Employee(long empId, String empName, List<String> dependents, double deduction, double discount,
			double paycheckAfterDiscountDeduction) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dependents = dependents;
		this.deduction = deduction;
		this.discount = discount;
		this.paycheckAfterDiscountDeduction = paycheckAfterDiscountDeduction;
	}


	public long getEmpId() {
		return empId;
	}


	public void setEmpId(long empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public List<String> getDependents() {
		return dependents;
	}


	public void setDependents(List<String> dependents) {
		this.dependents = dependents;
	}


	public double getDeduction() {
		return deduction;
	}


	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getPaycheckAfterDiscountDeduction() {
		return paycheckAfterDiscountDeduction;
	}


	public void setPaycheckAfterDiscountDeduction(double paycheckAfterDiscountDeduction) {
		this.paycheckAfterDiscountDeduction = paycheckAfterDiscountDeduction;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dependents=" + dependents + ", deduction="
				+ deduction + ", discount=" + discount + ", paycheckAfterDiscountDeduction="
				+ paycheckAfterDiscountDeduction + "]";
	}


	
}
