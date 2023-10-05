package Lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		super();
		this.array = array;
	}

	// Task1_1
	// Method mirror that outputs the contents of an array in a
	// reverse order like a mirror
	// Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	public int[] mirror() {
		int[] result = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
			result[array.length * 2 - 1 - i] = array[i];
		}
		return result;
	}

	// removes all duplicate elements from an array and returns a
	// new array
	// Input: 1 3 5 1 3 7 9 8
	// Output: 1 3 5 7 9 8
	public int[] removeDuplicates() {
		int n = array.length;
		if (n == 0) {

			return array;
		}

		int[] temp = new int[n];
		int resultLength = 0;

		// Duyệt qua mảng ban đầu và thêm các phần tử không trùng lặp vào mảng kết quả
		for (int i = 0; i < n; i++) {
			boolean flag = false;

			for (int j = 0; j < resultLength; j++) {
				if (array[i] == temp[j]) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				temp[resultLength] = array[i];
				resultLength++;
			}
		}

		// Tạo một mảng mới có kích thước chính xác bằng độ dài của mảng kết quả
		int[] result = new int[resultLength];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}

		return result;
	
	}

	// Task1_2
	// Input: 10 11 12 13 14 16 17 19 20
	// Output: 15 18
	public int[] getMissingValues() {
		int n = array.length;
		if (n == 0) {

			return array;
		}

		int[] temp = new int[n];
		int resultLength = 0;

		// Duyệt qua mảng ban đầu và thêm các phần tử không trùng lặp vào mảng kết quả
		for (int i = 0; i < n; i++) {
			boolean flag = false;

			for (int j = 0; j < resultLength; j++) {
				if (array[i] == temp[j]) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				temp[resultLength] = array[i];
				resultLength++;
			}
		}

		// Tạo một mảng mới có kích thước chính xác bằng độ dài của mảng kết quả
		int[] result = new int[resultLength];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}

		return result;
	
	}

	// Input: 10 11 12 -1 14 10 17 19 20
	// Output(k=3): 10 11 12 12 14 16 17 19 20
	public int[] fillMissingValues(int k) {
		// TODO
		return null;
	}

	public static void main(String[] args) {
		System.out.println("Task 1-1");
		int [] arr1 = {1,2,3};
		MyArray m1 = new MyArray(arr1);
		System.out.println("Mảng trước khi nhân bản: " + Arrays.toString(arr1));
		System.out.println("Mảng sau khi nhân bản: " + Arrays.toString(m1.mirror()));
		int[] arr2 = { 1, 3, 5, 1, 3, 7, 9, 8 };
		MyArray m2 = new MyArray(arr2);
		System.out.println("Mảng trước khi xóa các phần tử trùng lập: " + Arrays.toString(arr2));
		System.out.println("Mảng sau khi xóa các phần tử trùng lập: " + Arrays.toString(m2.removeDuplicates()));
		System.out.println("Task 1-2");
		int [] arr3 = {10, 11, 12, 13, 14, 16, 17, 19, 20};
		System.out.println("Mảng trước khi chưa tìm phần tử bị thiếu: " + Arrays.toString(arr3));
		MyArray m3 = new MyArray(arr3);
		System.out.println("Phần tử còn thiếu là: " + Arrays.toString(m3.fillMissingValues(0))) ;
		
	}

}
