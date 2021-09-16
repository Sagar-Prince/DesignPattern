package com.pattern;

public class GetPlane {
	
	public ElectricBill getBill(String planType) {
		
		if(planType.equals(null)) {
		return null;
		}
		if(planType.equals("domestic")) {
			return new DomasticPlan();
		}
		if(planType.equals("comerical")) {
			return new ComericalPlane();
		}
		if(planType.equals("intermidate")) {
			return new IntermidatePlane();
		}
		return null;
	}

}
