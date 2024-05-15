package DAY_11_DateandTime;

import java.util.Scanner;

public class Leap_Year {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		//String Date = sc.nextLine();
		int Year = sc.nextInt();
		if((Year%400 == 0) || ((Year % 4 ==0)&& (Year % 100)!= 0))
		{
			System.out.println("Leap Year");
		}else
		{
			System.out.println("Not a Leap Year");
		}
		
		
	}
	

}
