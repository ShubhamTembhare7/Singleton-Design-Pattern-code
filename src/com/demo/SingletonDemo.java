package com.demo;

public class SingletonDemo {
 
	private SingletonDemo() {}
	
	private static SingletonDemo instance;
	
	public static SingletonDemo getInstance() {
		if(instance==null) {
			return instance=new SingletonDemo();
		}else {
			return instance;
		}
	}
}
