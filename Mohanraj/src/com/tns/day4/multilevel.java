package com.tns.day4;

public class multilevel {
public static void main(String[]args)
{
	//child3 object crreation
		child3 obj=new child3();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		obj.e();
		obj.f();
		obj.g();
		obj.h();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		//child2 object creation
		child2 obj2=new child2();
		obj2.a();
		obj2.b();
		obj2.c();
		obj2.d();
		obj2.e();
		obj2.f();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		//child 1 object creation
		child1 obj3=new child1();
		obj3.a();
		obj3.b();
		obj3.d();
		obj3.c();
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println(obj3.c);
		

}
}

