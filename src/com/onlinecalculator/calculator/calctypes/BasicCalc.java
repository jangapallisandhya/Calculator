package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

 public class BasicCalc
{
	public int a,b,c,ch,res;//Variable declaration
	
	
	public BasicCalc()//it is a method 
	
        {
		a=0;
		b=0;
		c=0;
		ch=0;
		res=0;
		
		}
	
	public void menu()
        {
		System.out.println("1.addtion");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("enter your choice");
		Scanner x=new Scanner(System.in);
    	ch=x.nextInt();
    
    	
    	
	}
	
    public void userInputs()
    {
    	
    	Scanner x=new Scanner(System.in);
    	System.out.println("enter first number");
    	a=x.nextInt();
    	System.out.println("enter second number");
    	b=x.nextInt();
    	
    	
    	
    }

    public void performOperation()
{
    	switch(ch)
    	{
    	case 1:
    		 System.out.println("addtion");
    		 res=add();
    	     System.out.println("addtion"+res);
    	     break;
    	case 2:
    		 System.out.println("subtraction");
    		res=subtract();
    		System.out.println("subtraction"+res);
    		break;
    	case 3:
    		 System.out.println("multiplication");
    		res=multiply();
    		System.out.println("multplication"+res);
    		break;
    	case 4:
    		 System.out.println("division");
    		res=divide();
    		System.out.println("division"+res);
    		break;
    		
    		
        }
       
    }
    
	int add()
	{
		c=a+b;
		return c;
		
	}
	
	int subtract()
	{
		c=a-b;
		return c;
		
		}
	
	int multiply()
	{
		c=a*b;
		return c;
	}
	
	int divide()
	{
		c=a/b;
		return c;
	}
	
}


		

