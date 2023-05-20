package com.stream.defaultmethod;

public interface It2 {
   void method2();
   default void log(String str) {
	   System.out.println("if2 :" +str);
   }
   
   static void m11() {
	   
	   System.out.println("static : method");
   }
}
