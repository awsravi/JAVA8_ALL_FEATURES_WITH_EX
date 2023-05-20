package com.stream.defaultmethod;

public interface If1 {

	void method1();
	
	 default void log(String str) {
		   System.out.println("if1 :" +str);
	   }

}
