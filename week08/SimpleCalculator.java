package week08;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		try {
			main0();
		} catch(Exception e) {
			System.out.println(e.getClass().getSimpleName());
		}
	}
	
	private static void main0() {
		String line = new Scanner(System.in).nextLine();
		int operatorIndex = 0;
		while("0123456789".indexOf(line.charAt(operatorIndex)) != -1) {
			operatorIndex++;
		}
		String strA = line.substring(0, operatorIndex);
		boolean add = line.charAt(operatorIndex) == '+';
		String strB = line.substring(operatorIndex + 1);
		
		int a = Integer.parseInt(strA);
		int b = Integer.parseInt(strB);
		
		if(a == 0 || b == 0) {
			if(add) throw new AddZeroException();
			else throw new SubtractZeroException();
		}
		if(strA.length() > 4 || strB.length() > 4) throw new OutOfRangeException();
		if(a < 0 || a > 1000 || b < 0 || b > 1000) throw new OutOfRangeException();
		int result = add ? a + b : a - b;
		if(result > 1000 || result < 0) throw new OutOfRangeException();
		
		System.out.println(result);
	}
	
	public static final class OutOfRangeException extends RuntimeException {
	}
	public static final class AddZeroException extends RuntimeException {
	}
	public static final class SubtractZeroException extends RuntimeException {
	}
}
