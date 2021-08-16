package week2_lab;

import java.util.Scanner;

//computing the quotient and remainder of two given numbers
public class QuotientAndRemainder {

	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int firstNumber = s.nextInt();
		System.out.println("Enter the number :");
		int secondNumber = s.nextInt();
		
		System.out.println("quotient of the two number is"+(firstNumber/secondNumber));//this gives quotient
		System.out.println("quotient of the two number is"+(firstNumber%secondNumber));//this gives remainder
	}

}
