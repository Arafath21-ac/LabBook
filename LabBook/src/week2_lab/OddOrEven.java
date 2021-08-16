package week2_lab;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = s.nextInt();
		if (a%2==0) {
			System.out.println(a+"  "+"is even number");
		} else {
			System.out.println(a+"  "+"is odd number");
		}
	}
}
