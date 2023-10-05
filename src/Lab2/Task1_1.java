package Lab2;

public class Task1_1 {
	public static int getSn1(int n) {
		int result = 0;
		if (n == 1) {
			System.out.print("1" + "+");
			result = 1;

		} else {
			result = (int) (Math.pow(-1, n + 1) * n) + getSn1(n - 1);
			System.out.print((int) (Math.pow(-1, n + 1) * n) + "+");

		}

		return result;
	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}

		return n * fact(n - 1);
	}

	public static int getSn2(int n)

	{

		if (n == 1)

		{

			return 1;
		}

		return getSn2(n - 1) + fact(n);

	}

	public static int getSn3(int n) {
		int result = 0;
		if (n == 0) {
			result = 0;
		} else {
			result = (int) (getSn3(n - 1) + n * n);
		}
		return result;

	}

	public static double temp(int n) {
		double result = 0;
		if (n == 0) {
			result = 1;
		} else {
			result = temp(n - 1) * 2 * n;
		}
		return result;
	}

	public static double getSn4(int n) {
		double result = 0;
		if (n == 0) {
			result = 1;
		} else {
			result = getSn4(n - 1) + 1 / temp(n);
		}
		return result;
	}

	public static void main(String[] args) {
		Task1_1 m = new Task1_1();
		System.out.println("=" + m.getSn1(4));
		System.out.println(m.getSn2(3));
		System.out.println(m.getSn3(4));
		System.out.println(m.getSn4(2));
	}

}
