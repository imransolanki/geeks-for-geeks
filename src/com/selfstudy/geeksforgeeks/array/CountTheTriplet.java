package com.selfstudy.geeksforgeeks.array;

import java.util.Arrays;

/*
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Constraints:
1 <= T <= 100
3 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
2
4
1 5 3 2
3
3 2 7
Output:
2
-1
*/

public class CountTheTriplet {
	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 3, 4, 0, 2 };

		System.out.println(Arrays.toString(numbers));

		findTriplet(numbers);
	}

	private static void findTriplet(int[] numbers) {
		Arrays.parallelSort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length - 1; j++) {
				// System.out.println(numbers[i + 2] +"=="+ numbers[i] + numbers[j]);
				if (i == 0 && j == 1) {
					if ((numbers[i] + numbers[j]) == numbers[i + 1])
						System.out.println(numbers[i + 1] + ":" + numbers[i] + "+" + numbers[j]);

				}
				if ((numbers[i] + numbers[j]) == numbers[i + 2])
					System.out.println(numbers[i + 2] + ":" + numbers[i] + "+" + numbers[j]);
			}
		}
	}
}
