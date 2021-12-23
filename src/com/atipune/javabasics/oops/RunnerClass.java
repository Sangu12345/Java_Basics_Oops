package com.atipune.javabasics.oops;

public class RunnerClass implements Interface1,Interface2 {

	
	public void m100() {
		
		System.out.println("im implemented method from interface");
		
	}
	void newmethod() {
			System.out.println("method");
		
		}
	
	

	public static void main(String[] args) {
		Interface1 i1=new RunnerClass();
		i1.m100();
		
		
		Interface2 i2=new RunnerClass();
		i2.m100();
		//i2.newmethod();
		
		RunnerClass rc=new RunnerClass();
		rc.m100();
		rc.newmethod();
		System.out.println(Interface1.x);
		System.out.println(Interface2.x);
	}


}
