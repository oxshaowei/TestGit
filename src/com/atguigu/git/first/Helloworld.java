package com.atguigu.git.first;

public class Helloworld {

	public static void testChildren(){
		System.out.println("hello");
	}
	
	private int count;
	
	public static void main(String[] args) {
	    Helloworld helloworld = new Helloworld(88); 
	    System.out.println(helloworld.count);
	}
	
	public Helloworld(int num) {
		count = num;
	}
}
