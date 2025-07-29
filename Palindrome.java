package week2.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner receive = new Scanner(System.in);  
        System.out.print("Enter a number: ");      
        int input = receive.nextInt();
		int temp = input;
		int output = 0;
		int remainder;
		for(input=input;input>0;input=input/10)
		{
			remainder = input % 10;
			output = (output*10)+remainder;
		}
		if(temp==output)
		{
			System.out.println(temp + " is a Palindrome");
		}
		else
		{
			System.out.println(temp + " is not a Palindrome");
		}

	}

}
