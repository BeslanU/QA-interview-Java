package Page1;

public class SumOfDigits {
	public static int getSumOfAllDigits(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}
	public static void main(String[] argrs) {
		System.out.println(getSumOfAllDigits(100));
	}
}
