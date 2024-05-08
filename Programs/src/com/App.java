package com;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Service s=new Service();
		System.out.println("======Product Management System========");
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Size Of Database..!!");
		int size=ip.nextInt();
		s.createDatabase(size);
		while(true) {
			System.out.println("=====Menu=====");
			System.out.println("1.Add Product\n2.Find By Id");
			System.out.println("3.Find By Company\n4.Update By ID");
			System.out.println("5.All Details\n6.Exit");
			System.out.println("Enter the Option:-");
			int op=ip.nextInt();
			switch(op) {
			case 1:s.addProduct(); break;
			case 2:s.findById(); break;
			case 3:System.out.println("Not Impltd"); break;
			case 4:System.out.println("Not Impltd"); break;
			case 5:System.out.println("Not Impltd"); break;
			case 6:System.out.println("Thank You...!!!");
			       System.exit(0);
			default:System.out.println("InValid Option"); break;
			}
			
			
		}
	}
}
