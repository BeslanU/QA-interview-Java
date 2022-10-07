package Page1;

public class SwapStrings {
	public static void main(String[] argrs) {
		String firstString = "Aliya";
		String secondString = "Uruzbiyeva";
		firstString = firstString+secondString;
		secondString = firstString.substring(0,firstString.length() - secondString.length());
		firstString = firstString.substring(secondString.length());
		System.out.println(firstString);
		System.out.println(secondString);
	}
}
