//this is following a factory design pattern!!

package com.pattern;

public abstract class ElectricBill {
	
	double bill_rate;
	
	abstract void getRate();
	
	public void calculateBill(int unit) {
		System.out.println(unit*bill_rate);
	}
}

class DomasticPlan extends ElectricBill{

	@Override
	void getRate() {
		bill_rate=3.5;
		
	}
	
}

class ComericalPlane extends ElectricBill{

	@Override
	void getRate() {
		bill_rate=6.8;
		
	}

}

class IntermidatePlane extends ElectricBill{

	@Override
	void getRate() {
		bill_rate=9.5;
	}
	
}


