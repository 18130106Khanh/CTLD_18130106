package Lab1;

public class MyCaesar {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	public static final char[] Number = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	private int n;// shift steps (right shift)

	public MyCaesar(int shiftSteps) {
		this.n = shiftSteps;
	}

	// Encrypt a character according to the given shif steps.
	// Encrypt: En(x) = (x + n) mod 26. x represents the index of c in the ALPHABET
	// array
	private int findChar(char c) {
		for (int i = 0; i < ALPHABET.length; i++) {
			if (c == ALPHABET[i]) {
				return i;
			}
		}
		return -1;
	}

	private int findNumber(char c) {
		for (int i = 0; i < Number.length; i++) {
			if (c == Number[i]) {
				return i;
			}
		}
		return -1;
	}

	public char encryptChar(char c) {
		int index = findChar(c);
		char result = ' ';

		if (index == -1) {
			index = findNumber(c);
			if (index == -1) {
				result = c;

			}
			result = this.Number[(index + n) % 10];

		} else {
			result = this.ALPHABET[(index + n) % 26];

		}
		return result;
	}
	// TO DO

	// Encrypt a text using the above function for encrypting a charater.
	public String encrypt(String input) {
		String result = "";
		int lengthInput = input.length();
		for (int i = 0; i < lengthInput; i++) {
			result += encryptChar(input.charAt(i));
		}
		return result;
	}

	// Decrypt a character according to the given shif steps.
	// Decrypt: Dn(x) = (x – n) mod 26. x represents the index of c in the ALPHABET
	// array
	public char decryptChar(char c) {
		int index = findChar(c);
		char result = ' ';

		if (index == -1) {
			index = findNumber(c);
			if (index == -1) {
				result = c;

			}
			result = this.Number[(index - n + 10) % 10];

		} else {
			result = this.ALPHABET[(index - n + 26) % 26];

		}

		return result;

	}

	// Decrypt a encrypted text using the above function for decrypting a charater.
	public String decrypt(String input) {
		String result = "";
		int lengthInput = input.length();
		for (int i = 0; i < lengthInput; i++) {
			result += decryptChar(input.charAt(i));
		}
		return result;

	}

	// Encrypt a encrypted the text content in the srcfile and save it into desFile.
	public void encrypt(String srcFile, String desFile) {
		// TO DO
	}

	// Decrypt a encrypted the text content in the srcfile and save it into desFile.
	public void decrypt(String srcFile, String desFile) {
		// TO DO
	}

	public static void main(String[] args) {
		MyCaesar mc = new MyCaesar(3);
		MyCaesar mc1 = new MyCaesar(5);

		System.out.println("Ki tu ma hoa cua A:");
		System.out.println(mc.encryptChar('A'));
		System.out.println("Ki tu ma hoa cua 3:");
		System.out.println(mc.encryptChar('3'));
//		System.out.println("Ki tu giai ma cua F:");
//		System.out.println(mc.decryptChar('F'));
		System.out.println("Chuoi ma hoa cua A?B3 C:");
		System.out.println(mc.encrypt("A?B3 C"));
		System.out.println("Chuoi giai ma cua F34!GH:");
		System.out.println(mc1.decrypt("F3 4!GH"));
	}
}
