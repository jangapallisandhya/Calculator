package com.onlinecalculator.calculator.maincalc;

import com.onlinecalculator.calculator.calctypes.*;
import java.util.Scanner;
public class MainPgm
{
public static void main(String args[])
{
    int type;
    type=disp();
    if(type==1)
        {
    	BasicCalc B=new BasicCalc();
		B.menu();
		B.userInputs();
		B.performOperation();
        }
        if(type==2)
        {
        	 ScientificCalc calc=new ScientificCalc();
    		 calc.menu();
    		 calc.userInputs();
    		calc.performOperation();
    		 
       	}
        	
        	if(type==3)
        	{
        	  StatisticCalc calc1=new StatisticCalc();
       		 calc1.menu();
       		 calc1.userInputs();
       		calc1.performOperation();
        	}
 
    }
static int disp()
{
	int ch;
	Scanner s1=new Scanner(System.in);
	System.out.println("******CALCULATOR******");
	System.out.println("******1.BASIC CALCULATOR******");
	System.out.println("******2.SCIENTIFIC CALCULATOR******");
	System.out.println("******3.STATISTIC CALCULATOR******");
	System.out.println("enter your choice");
	ch=s1.nextInt();
	return(ch);
}
}
        
   