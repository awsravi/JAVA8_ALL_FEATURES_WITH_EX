package com.stream.defaultmethod;

public class IfTest12 implements If1,It2{


@Override
public void method2() {
	System.out.println("method 2");
	
}

@Override
public void method1() {
System.out.println("method 1");
	
}

@Override
public void log(String str) {
	// TODO Auto-generated method stub
	If1.super.log(str);
}






}
