package Lab2;

public class Fibonacci {
	public static int getFibonacci(int n) {
		int result = 0;
		if (n == 1) {
			return 0;
		}
		if (n < 4) {
			result = 1;
		} else {
			result = getFibonacci(n - 1) + getFibonacci(n - 2);
		}
		return result;

	}

	public static void main(String[] args) {

		int n = 7;

		Fibonacci m = new Fibonacci();
		System.out.println("Vi trí thư " + n + " là:" + m.getFibonacci(n));
		for (int i = 1; i <= 10; i++) {
			System.out.println("fibonacci(" + i + ") = " + getFibonacci(i));
		}
	}
}
