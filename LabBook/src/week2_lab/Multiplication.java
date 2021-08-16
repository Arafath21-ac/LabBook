package week2_lab;

import java.util.Scanner;

//Multiply Two Numbers.
public class Multiplication {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number :");
		int x=scan.nextInt();
		System.out.println("enter the secind number :");
		int y = scan.nextInt();
		int z=x*y;
		System.out.println("multiplication of two number is :"+z);
	}
}
