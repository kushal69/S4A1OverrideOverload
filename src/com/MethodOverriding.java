package com;

//	Class Extended MethodOverriding Class
class Honda extends MethodOverriding {
	public void getBike(){					//	Override method
		System.out.println("Unicorn Dazzler 150 cc");
	}
}

//Class Extended MethodOverriding Class
class Yamaha extends MethodOverriding {
	public void getBike(){					//	Override method
		System.out.println("R15 V3 150 cc");
	}
}

//	Main Class
public class MethodOverriding {
	public void getBike(){					//	Override method
		System.out.println("Method Overriding");
	}
	
	// Main Function
	public static void main(String [] args) {
		MethodOverriding methodOverriding = new MethodOverriding();
		MethodOverriding honda = new Honda();
		MethodOverriding yamaha = new Yamaha();
		
		methodOverriding.getBike();
		honda.getBike();
		yamaha.getBike();
	}
}