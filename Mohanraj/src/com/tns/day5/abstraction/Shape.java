package com.tns.day5.abstraction;

public abstract class Shape {
	  protected float area;
	     
	     //abstract method 
		 abstract void calArea();
		 
		 //concrete method
		 void show()
		 {
			 System.out.println("Area of shape is "+area);
		 }
}
