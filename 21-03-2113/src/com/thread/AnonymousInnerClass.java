package com.thread;
abstract class Myabstract
{
	public abstract void add();
	public abstract void sub();
	void display()
	{
		System.out.println("Display method");
	}

}

public class AnonymousInnerClass
{
	//Anonymous inner class can be applied to abstract or interface
	public static void main(String[] args)
	{
		Myabstract ob=new  Myabstract()
		{
			@Override
			public void add()
			{
				System.out.println("add method");
			}
			@Override
			public void sub()
			{
				System.out.println("subtract method");
			}


		};
		ob.add();
		ob.sub();
	}
}
