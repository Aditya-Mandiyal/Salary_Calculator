package com.godigit.banking;

 class Salary{
	private double basicSalary;
	private double hra;
	private double da;
	private double grossSalary;
	private double pf;
	private double netSalary;
	private double ctc;
	
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
	
	public void calculation()  
    {
       hra=(10/100)*basicSalary;
       da=(10/100)*basicSalary;
       grossSalary=basicSalary+hra+da;
       pf=(10/100)*basicSalary;
       netSalary=grossSalary-pf;
       ctc=grossSalary*12;     
    }
}
public class SalaryIncomeCalculator {
    
	
	
	
	public static void main(String[] args) {
		

	}

}

