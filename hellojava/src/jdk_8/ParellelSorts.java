package jdk_8;

import java.util.Arrays;

public class ParellelSorts {

	public static void main(String[] args) {

		int a[] = { 5, 2, 4, 1, 3, 6, 7, 9, 8, 10 };

		Arrays.parallelSort(a);
		// By for Each loop
		for (int f : a) {
			System.out.println(f);
		}

	}

}
