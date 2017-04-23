package com.atguigu.git.first;

public class TestMain extends Helloworld{

	public final static native int w();
	
	public TestMain(int num) {
		super(num);
	}

	public static void main(String[] args) {
		Helloworld helloworld = new Helloworld(15);
		new TestMain(15);
	}
}
