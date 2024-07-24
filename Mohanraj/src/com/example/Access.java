package com.example;

public class Access {
	private int a=5;
	public int b=6;
	protected int c=3;
	int d=8;
	private void a() {
		System.out.println("private");
	}
	public void b()
	{
		System.out.println("public");
		
	}
protected void c()
{
	System.out.println("protected");
	}
void d() {
	System.out.println("default");
}
}
