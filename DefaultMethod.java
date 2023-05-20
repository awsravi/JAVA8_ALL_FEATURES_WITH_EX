package com.stream.defaultmethod;

import com.stream.defaultmethod.DefaultInterface;

public class DefaultMethod  implements DefaultInterface{
  public static void main(String[] args) {
	  
	  
	  DefaultMethod a=new DefaultMethod();
	  a.m1();
	  
	  
  }
	//we can ovrried default methods

@Override
public void m1() {
	// TODO Auto-generated method stub
	DefaultInterface.super.m1();
}

	
	
	
	
}
