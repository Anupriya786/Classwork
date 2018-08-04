package week1.day2;

//import java.util.Scanner;

public class numberforeachloop 
{
	//static String[] stdnames = {"sai","Saravanan","Keerthana"};
	static int[] stdage= {23,32,30};
	static char[][] stdgrade= {
			{'A', 'B', 'A','C','D'},
			{'A', 'A', 'A','A','A'},
			{'A', 'A', 'A','A','A'}};
	public static void main(String[] args) 
	{
		String[] stdnames = {"sai","Saravanan","Keerthana"};
		//	System.out.println("Enter the Student Name You Wish to See");
		//  Scanner scr=new Scanner(System.in);
		//	int stdId=scr.nextInt();
		//	stdId=stdId-1;
		//	System.out.println(stdId);
		//	String[][] stdgrade = null;
		for(String names: stdnames) 
		{
			System.out.print(names + " ");
			System.out.println(names.length());
		}
	}
}