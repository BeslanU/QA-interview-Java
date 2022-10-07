package Page1;

import java.util.Iterator;

public class ReverseString {
	public static void main(String[] argrs) {
		String inputString = "Aliya";
		String outputString = "";
		for (int i = inputString.length()-1; i >= 0; i--) {
			outputString = outputString+inputString.charAt(i);
		}
		System.out.println(outputString);
	}
}
