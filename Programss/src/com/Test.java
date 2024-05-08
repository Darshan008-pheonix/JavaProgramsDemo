package com;

public  class Test {
	Test(){
		System.out.println("abs cons1");
	}

	Test(int n){
		this();
		System.out.println("abs cons2");
	}
}
