package week1.day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); 
	     System.out.print("Enter a number: ");
	     int num = scanner.nextInt(); 
	     scanner.close();

		if (num <= 1) 
		{
			System.out.println(num + " is NOT a Prime number.");
		} 
		else 
		{
			for (int i = 2; i < num; i++)
			{
				if (num % i == 0)
				{
					System.out.println(num + " is NOT a Prime number.");
					return; 
				}
			}
			System.out.println(num + " is a Prime number.");
		}

	}

}
