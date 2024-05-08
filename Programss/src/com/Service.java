package com;

import java.util.Map;
import java.util.Scanner;

public class Service {

	Product[] arr;
	int k=0;
	Scanner ip=new Scanner(System.in);
	void createDatabase(int size){
		arr=new Product[size];
		System.out.println("Database had been created with size:"+size);
	}
	
	void addProduct() {
		System.out.println("==========Adding Into Database=========");
		if(k==arr.length) {
			System.out.println("Database is full");
		}
		else {
			System.out.println("Enter the product id:");
			int pid=ip.nextInt();
			System.out.println("enter product name:");
			String pname=ip.next();
			System.out.println("enter product price:");
			double price =ip.nextDouble();
			System.out.println("enter the product company:");
			String company=ip.next();
			System.out.println("enter the quantity:");
			int qt=ip.nextInt();
			Product p=new Product(pid, pname, price, company, qt);
			arr[k]=p;
			k++;
			System.out.println("Product had been added database...!");
		}
		System.out.println("=====================================");
	}
	
	void findById() {
		System.out.println("==================================");
		System.out.println("Enter the Id:-");
		int c=0;
		int pid=ip.nextInt();
		for(Product ele:arr) {
			if(ele.getPid()==pid) {
				System.out.println("Pid:"+ele.getPid());
				System.out.println("Pname:"+ele.getPname());
				System.out.println("Price:"+ele.getPrice());
				System.out.println("Company:"+ele.getCompany());
				System.out.println("Qt:"+ele.getQt());
				Map<String,Integer> m;
				m.put(null, null)
				c++;break;
				
			}
		}
		if(c==0) {
			System.out.println("ID NOT FOUND");
		}
		System.out.println("========================");
		
	}
}
