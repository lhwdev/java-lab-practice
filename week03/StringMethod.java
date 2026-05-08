package week03;

public class StringMethod {
	// // Returns the string created by adding 's2' after position 'index' of 's1'.
	// static String addString(String s1, int index, String s2) {
	// 	char[] result = new char[s1.length() + s2.length()];
	// 	s1.getChars(0, index, result, 0);
	// 	s2.getChars(0, s2.length(), result, index);
	// 	s1.getChars(index, s1.length(), result, index + s2.length());
	// 	return String.valueOf(result);
	// }
	//
	// // Returns reversed string of 's'
	// static String reverse(String s) {
	// 	char[] result = new char[s.length()];
	// 	for(int i = s.length() - 1; i >= 0; i--) {
	// 		result[i] = s.charAt(i);
	// 	}
	// 	return String.valueOf(result);
	// }
	//
	// // Returns a string with all 's2's removed from 's1'
	// static String removeString(String s1, String s2) {
	// 	char[] result = new char[s1.length()];
	// 	int index = 0; // cursor for s1
	// 	int length = 0; // cursor for result
	// 	while(true) {
	// 		int next = s1.indexOf(s2, index);
	// 		if(next == -1) {
	// 			s1.getChars(index, s1.length(), result, length);
	// 			return String.valueOf(result, 0, length + s1.length() - index);
	// 		}
	//
	// 		s1.getChars(index, next, result, length); // before/between occurrence of s2
	//
	// 		length += next - index;
	// 		index = next + s2.length();
	// 	}
	// }
	
	// Returns the string created by adding 's2' after position 'index' of 's1'.
	static String addString(String s1, int index, String s2) {
		return s1.substring(0, index).concat(s2).concat(s1.substring(index));
	}
	// Returns reversed string of 's'
	static String reverse(String s) {
		char[] result = new char[s.length()];
		for(int i = s.length() - 1; i >= 0; i--) {
			result[i] = s.charAt(i);
		}
		return String.valueOf(result);
	}
	// Returns a string with all 's2's removed from 's1'
	static String removeString(String s1, String s2) {
		String[] list = s1.split(s2);
		String result = "";
		for(int i = 0; i < list.length; i++) {
			result = result.concat(list[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(addString("0123456", 3, "-"));
		System.out.println(reverse("abc"));
		System.out.println(removeString("01001000", "00"));
	}
}
