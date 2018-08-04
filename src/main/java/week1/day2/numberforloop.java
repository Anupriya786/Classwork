package week1.day2;

import java.util.Scanner;

public class numberforloop
{
	static String[] stdnames = {"sai","Saravanan","Keerthana"};
	static int[] stdage= {23,32,30};
	static char[][] stdgrade= {
			{'A', 'B', 'A','C','D'},
			{'A', 'A', 'A','A','A'},
			{'A', 'A', 'A','A','A'}};
	public static void main(String[] args) {
		//	System.out.println("Enter the Student Name You Wish to See");
		//Scanner scr=new Scanner(System.in);
		//	int stdId=scr.nextInt();
		//	stdId=stdId-1;
		//	System.out.println(stdId);
		//	String[][] stdgrade = null;
		for(int i=0;i<=2;i++) {
			System.out.println(stdnames[i] + " whose is " + stdage[i] +" years old scored " + stdgrade[i][0] +", "+ stdgrade[i][1] + ", " +stdgrade[i][2] + ", "+stdgrade[i][3] + ", " +stdgrade[i][4]);
		}
	}
}