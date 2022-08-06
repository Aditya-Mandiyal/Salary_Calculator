package com.godigit.banking;

 class Salary{
	private double basicSalary;
	private double hra;
	private double da;
	
	
	// constructor for salary , we don't accept salary less than 1
	public Salary(double basicSalary)
	{
	     if(basicSalary<1)
	     {
	    	 System.out.println("Sorry You Can't enter Salary less than 1 !!!!!"+"\n Thanks");
	     }
	     else
	     {
	    	 this.basicSalary=basicSalary;
	     }
	}
	
}
public class SalaryIncomeCalculator {
    
	
	
	
	public static void main(String[] args) {
		

	}

}
