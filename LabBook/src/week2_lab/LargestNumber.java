package week2_lab;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
//		int x=10;int t=20;int z=30;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value x:");
		int x=scan.nextInt();
		System.out.println("enter the value t:");
		int t=scan.nextInt();
		System.out.println("enter the value z:");
		int z=scan.nextInt();
		System.out.println("the greater number is shiwn below");
		if (x>=t&&x>=z) {
			System.out.println(x+" "+" is greater");
		}
		else if (t>=x&&t>=z) {
			System.out.println(t+" "+" is greater");
		}else {
			System.out.println(z+" "+" is greater");
		}
	}
}
