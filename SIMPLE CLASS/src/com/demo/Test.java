package com.demo;


public class Test 
{
	public void m1(int age)
	{
		System.out.println("m1");
		if(age<0)
		{
			AgeInvalidException e=new AgeInvalidException();
			throw e;
		}
		System.out.println("m1 end");
	}
	
	
	public static void main(String[] args) 
	{
       System.out.println("main start");
       Test t= new Test();
       try
       {
       t.m1(-5);
       }
       catch (AgeInvalidException e) 
       {
		System.out.println("catch block"+"     "+e.getMessage());
	   }
       System.out.println("end");
	}

}
