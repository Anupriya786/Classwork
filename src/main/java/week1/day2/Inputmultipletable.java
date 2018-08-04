package week1.day2;
import java.util.Scanner;

public class Inputmultipletable 
{
	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Multiplicaton of Number : ");
		int mulnumber = scr.nextInt();
		System.out.println("Enter Multiplicaton Range : ");
		int range = scr.nextInt();
		for (int i=1;i<=range;i++)
		{
		System.out.println(i+" * "+mulnumber+" ="+" "+i*range);	
		}	
	}

}
