package week1.day2;

import java.util.Scanner;

public class Learningarrays {
	static String[] stdnames = {"sai","Saravanan","Keerthana"};
	static int[] stdage= {23,32,30};
	static char[][] stdgrade= {
			{'A', 'B', 'A','C','D'},
			{'A', 'A', 'A','A','A'},
			{'A', 'A', 'A','A','A'}};
	public static void main(String[] args) 
	{
		System.out.println("Enter the Student Name You Wish to See");
		Scanner scr=new Scanner(System.in);
		int stdId=scr.nextInt();
		stdId=stdId-1;
		System.out.println(stdId);
		//	String[][] stdgrade = null;
		System.out.println(stdnames[stdId] + " whose is" + stdage[stdId] +" years old scored" + stdgrade[stdId][0] +", "+ stdgrade[stdId][1] + ", " +stdgrade[stdId][2] + ", "+stdgrade[stdId][3] + ", " +stdgrade[stdId][4]);
	}
}
