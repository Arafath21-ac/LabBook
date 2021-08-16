package week2_lab;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the valuve below 10 =");
		int n=sc.nextInt();
		while (n<10) {
			n++;
			System.out.println(n);
		}
	}
}
