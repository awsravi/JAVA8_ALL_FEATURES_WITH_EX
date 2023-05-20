package com.stream.defaultmethod;

public interface DefaultInterface {

	default void m1() {
		System.out.println("default method m1");
	};
	
	public static void m11() {
		   System.out.println("static method ");
	   }
	
	
}
