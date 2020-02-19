package com.epam.interest;
import java.util.*;
public class App 
{
    public static void main( String[] args ){
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your choice:\n1.Calculate Interest\n2.Estimate House Construction Cost");
        int choice=sc.nextInt();
        while(choice<1 || choice>2) {
        	System.out.println("Enter a valid choice\n");
        	choice=sc.nextInt();
        }
        if(choice==1) {
        	System.out.print("Enter Principle Amount for Interest: ");
        	double p=sc.nextDouble();
        	System.out.print("Enter Rate Of Interest for Amount: ");
        	double r=sc.nextDouble();
        	System.out.print("Enter Time for Rate of Interest : ");
        	double t=sc.nextDouble();
        	System.out.println("Enter your type of Interest:\n1 Simple Interest\n2 Compound Interest");
        	int type=sc.nextInt();
        	switch(type) {
        		case(1):
        			Simple s=new Simple(p,t,r);
        			System.out.println("Simple Interest for Amount is: "+ s.cal()+"INR");
        			break;
        		case(2):
        			Compound c=new Compound(p,t,r);
        			System.out.println("Compound Interest for Amount is: "+c.cal()+"INR");
        			break;
        	}
        }
       if(choice==2){
        	System.out.println("Enter Area Of The House for Construction in Squarefeet: ");
        	double area=sc.nextDouble();
        	System.out.println("Enter Material Standards you need : ");
        	System.out.println("1. Standard Material \n2. Above Standard Material \n3. High Standard Material \n4. High Standard Material And Fully Automated House");
        	int op=sc.nextInt();
        	House h=new House(area,op);
        	System.out.println("Total Cost for Construction is: "+h.total() +"INR");
        }
        sc.close();
    }
}
