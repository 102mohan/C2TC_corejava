package com.tns.day5;

public class Interfacemain implements Interface1,Interface2 {
public void demo() {
	    
		System.out.println("it is demo method");
	    }
public void view()
{
	System.out.println("it is view method");
}
public static void main(String[]args) {
	
    
	Interfacemain obj=new Interfacemain();
	obj.view();
	obj.demo();
	System.out.println(obj.a);
	
	
}
}
