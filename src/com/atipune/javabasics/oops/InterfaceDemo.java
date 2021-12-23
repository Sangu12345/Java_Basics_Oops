package com.atipune.javabasics.oops;
interface AbstactInterface {
	int x=30;
	void m1();
	void m2();

}
	interface AbstracterInterface3
	{
		int x=20;
		void m1();
		void m2();
	}
interface AbstactInterfacenew extends AbstactInterface
{
	void m3();
	void m4();
}
class derived1 implements AbstactInterface
{
	void m23()
	{
		System.out.println("implementation m23");
	}
	public void m1()
	{
		System.out.println("im implemented m1");
	}
	public void m2()
	{
		System.out.println("im implemented m2");
	}
}
	
class derived2 implements AbstactInterfacenew
	{
		
		public void m1()
		{
			System.out.println("im implemented m1");
		}
		public void m2()
		{
			System.out.println("im implemented m2");
		}
		public void m3()
		{
			System.out.println("im implemented m3");
		}
		public void m4()
		{
			System.out.println("im implemented m4");
		}
	}


public class InterfaceDemo {

	public static void main(String[] args) {
		
		derived1 d1=new derived1();
		d1.m1();
		d1.m2();
		d1.m23();
		System.out.println(".........................");
		
		System.out.println("..........................");
		AbstactInterface ai=new derived1();
		ai.m1();
		ai.m2();
		
		
		
		
		
		

	}

}
