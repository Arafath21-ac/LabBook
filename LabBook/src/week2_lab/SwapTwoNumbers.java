package week2_lab;

//import org.graalvm.compiler.lir.LIRInstruction.Temp;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a=21; int b=23;
		System.out.println("--------------before swapping two numbers----------------");
		System.out.println("first number = "+a);
		System.out.println("second number = "+b);
		int temp =a;
		a=b;
		b=temp;
		System.out.println("------------------before swapping two numbers-------------");
		System.out.println("first number = "+a);
		System.out.println("second number ="+b);
	}
}
