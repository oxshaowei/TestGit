package com.atguigu.git.first;

import com.atguigu.git.first.InnerClass.HelloInner;

public class TestInnerClass {

	public static void main(String[] args) {
		InnerClass innerClass=new InnerClass();
		HelloInner ll=innerClass.new HelloInner();
	}
	
}
