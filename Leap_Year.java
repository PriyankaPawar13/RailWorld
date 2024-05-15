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
/*public static void main(String[] args) {
// TODO Auto-generated method stub
int year;

 
  Scanner scn = new Scanner(System.in);
  year = scn.nextInt();

  if ((year % 400 == 0)
      || ((year % 4 == 0) && (year % 100 != 0))) {

     
      System.out.println(year + " : Leap Year");
  }

  else {
      
      System.out.println(year + " : Non - Leap Ye*/