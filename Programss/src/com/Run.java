package com;

import java.util.HashMap;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
	HashMap<Character, String> m1=new HashMap<Character, String>();
	
	m1.put('a',"apple");
	m1.put('s',"sony");
	m1.put('h', "hp");
	m1.put('d', "dell");
	System.out.println(m1);
	System.out.println(m1.values());//return values in formate collection
	//Set<Character> s=m1.keySet();
	for(Character key:m1.keySet()) {
		System.out.println(key+":"+m1.get(key));
	}
}
}