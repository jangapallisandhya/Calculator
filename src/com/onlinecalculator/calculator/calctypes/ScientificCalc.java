package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

import java.lang.Math;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;

public class ScientificCalc extends BasicCalc
{
	public void menu()
	{
	System.out.println("select option");
	System.out.println("1.addtion");
	System.out.println("2.subtraction");
	System.out.println("3.multiplication");
	System.out.println("4.division");
	System.out.println("5.powrof");
	System.out.println("6.sqrtof");
	System.out.println("7.sineof");
	System.out.println("enter your choice");
	Scanner x=new Scanner(System.in);
	ch=x.nextInt();
	
  	
	}

  public void userInputs()
  {

  	Scanner x=new Scanner(System.in);
  	System.out.println("enter first number");
  	a=x.nextInt();
  	if(ch!=6&&ch!=7)
  	{
  		System.out.println("enter second number");
  	  	b=x.nextInt();
  	}
  	
  }

  public void performOperation(){
  		switch(ch)
  		{
  		case 1:
  			
  		case 2:
  			
  		case 3:
  			
  		case 4:
  			super.performOperation();
  			break;
  			
  		case 5:
   		 System.out.println(pwrof());
   		 break;
   	     
   	case 6:
   		 System.out.println(sqrtof());
   		 break;
   	case 7:
   		 System.out.println(sineof());
   		 break;
   	case 8:
   		 System.out.println("bye");
   		 System.exit(0);   		
   		break;
   		default:
   			System.out.println("wrong choice!!");
   			break;
  		}
  		System.out.println("\n............\n");
  		
  		
  	}
   
   
	double pwrof()
	{
		 System.out.println("power");
		 return(Math.pow(a,b));
		
	}
	
	double sqrtof()
	{
		 System.out.println("sqrtof");
		 return(Math.sqrt(a));
		 }
	
	double sineof()
	{
		double rad=Math.toRadians(a);
		return(Math.sin(rad));
		
		}
	
}


	
