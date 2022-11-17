package com.demo;

public class TestSingleton {
public static void main(String[] args) {
	
	System.out.println("Hello Singleton Design Pattern");
	
	SingletonDemo obj1=SingletonDemo.getInstance();	
	System.out.println(obj1.hashCode());
	
	SingletonDemo obj2=SingletonDemo.getInstance();
	System.out.println(obj2.hashCode());
}
}
