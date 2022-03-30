package com.thread;
interface MyInt
{
	void add();
	void sub();
}
public class AnonymousInnerInterface 
{

	public static void main(String[] args)
	{
           MyInt ob=new MyInt()
        		   {
        	         //@Override
        	         public void add()
        	         {
        	        	 System.out.println("add");
        	         }
        	         //@Override
        	         public void sub()
        	         {
        	        	 System.out.println("sub");
        	         }
        		   };
        		   ob.add();
        		   ob.sub();
	}

}
