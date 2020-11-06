package com.pay.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pay.domain.Employee;


@Controller
public class EmployeeController {
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String getCostDeductionForm() {
		return "deductionForm";
	}
	
	@RequestMapping(value = "/deduction" , method = RequestMethod.POST)
	public String calculateDeductionAndDiscount(@RequestParam String empName, @RequestParam String dependents, Model model) {
		//suppose to get these from database
		double empSalary = 2000;
		double empDeduction = 1000/26; 
		double eachDependentDeduction = 500/26;
		double discountPerPerson = .1 * empSalary /26;
		
		Employee e = new Employee();
		String[] temp = dependents.split(",");
		double totalDeduction = empDeduction + (eachDependentDeduction * (temp[0].isBlank()? 0: temp.length));
//		System.out.println("***"+totalDeduction +" "+temp.length+" "+(temp[0].isBlank())+" "+ eachDependentDeduction +" "+ empDeduction);
		e.setDeduction(totalDeduction);
		
		double discount = empName.startsWith("A") || empName.startsWith("a") ?  discountPerPerson : 0;
		
		for(int i=0; i<temp.length; i++) {
			if(temp[i].startsWith("A") || temp[i].startsWith("a")) {
				discount += discountPerPerson;
			}
		}
		e.setDiscount(discount);
		double payCheckAfter = empSalary - totalDeduction + discount ;
		e.setPaycheckAfterDiscountDeduction(payCheckAfter);
		model.addAttribute("employee", e);
		return "deductionForm";
	}
}
