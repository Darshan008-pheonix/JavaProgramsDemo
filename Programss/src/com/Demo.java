package com;

import java.util.Scanner;
class A{
	A(float a){
		this(10);
		System.out.println("Cons A1");
	}
	A(int n){
		this("hello");
		System.out.println("Cons A2");
	}
	A(String s){
		System.out.println("Cons A3");
	}
}

