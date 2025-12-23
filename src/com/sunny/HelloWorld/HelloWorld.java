package com.sunny.HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		B b=new B();
		System.out.println("Hello World!!");
		b.m();
	}


}
class A{
	static{
		System.out.println("A static block");
	}
	A()
	{
		System.out.println("A constructor");
	}
	
}
class B extends A{
	static {
		System.out.println("Static block B");
	}
	{
		System.out.println("Non static B");
	}
	B()
	{
		System.out.println("Contsructor B");
	}
	public void m() {
		System.out.println("m method executed");
	}
}
//output : 
