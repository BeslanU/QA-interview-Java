package Page1;

public class PrimeNum {
	public static boolean isPrime(int num) {
		if (num <= 1)
		return false;
		for (int i = 2; i < num; i++) {
		if (num % i == 0) {
			return false;
		}
	}
		return true;
	}
	public static void main(String[] argrs) {
		System.out.println(isPrime(5));
	}
}
