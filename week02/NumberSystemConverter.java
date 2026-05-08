package week02;

import java.util.Scanner;


public class NumberSystemConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.print("b ");
		System.out.println(Integer.toBinaryString(number));
		
		System.out.print("o ");
		System.out.println(Integer.toOctalString(number));
		
		System.out.print("h ");
		System.out.println(Integer.toHexString(number));
	}
}
