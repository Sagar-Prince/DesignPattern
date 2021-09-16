package com.pattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		
		GetPlane gp = new GetPlane();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter plane type");
		String plan= scanner.next();
		System.out.println("enter unit");
		int unit=scanner.nextInt();
		
		 ElectricBill bill = gp.getBill(plan);
		 bill.getRate();//here run time polymorphism will happen.
		 bill.calculateBill(unit);
		 //parent reference can be used to hold child object but with that reference we can't call child specific method
		 //but in the case of overriding the the child class method will be executed at run time.
	}

}
