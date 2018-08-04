package week1.day2;

import java.util.Scanner;

public class Largestofthreenumbers 
{
	public static void main(String[] args) 
	{
		//Getting Input from User
		System.out.println("Enter the Numbers to Compare:");
		Scanner scrobj=new Scanner(System.in);
		int number1=scrobj.nextInt();
		int number2=scrobj.nextInt();
		int number3=scrobj.nextInt();
		//System.out.println("Enter the Second Number to Compare:");
		//Scanner number2=new Scanner(System.in);
		//System.out.println("Enter the Third Number to Compare:");
		//Scanner number3=new Scanner(System.in);
		//Condition Flow to compare the inputs
		if (number1>number2)
		{
			if(number1>number3)
			{
				System.out.println("The largest among three Numbers is " +number1);
			}
			else
			{
				System.out.println("The largest among three Numbers is " +number3);
			}
		}
		else
		{
			if (number2>number3)
			{
				System.out.println("The largest among three Numbers is " +number2);
			}
			else
			{
				System.out.println("The largest among three Numbers is " +number3);
			}
		}
	}
}
