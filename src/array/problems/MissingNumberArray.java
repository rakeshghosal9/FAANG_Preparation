package array.problems;

public class MissingNumberArray {

	// Given an array of size N-1 such that it only contains distinct integers
	// in the range of 1 to N. Find the missing element.
	/*
	 * Example 1: Input: N = 5 A[] = {1,2,3,5} Output: 4 Example 2:
	 * 
	 * Input: N = 10 A[] = {6,1,2,8,3,4,7,10,5} Output: 9
	 */
	// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1/?page=3&difficulty[]=0&company[]=Amazon&category[]=Arrays&sortBy=submissions
	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 5 };
		System.out.println("Missing Number : " + missingNumber(numbers, 5));
		int numbers1[] = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
		System.out.println("Missing Number : " + missingNumber(numbers1, 10));
	}

	public static int missingNumber(int numbers[], int expectedSize) {
		if ((numbers.length + 1) != expectedSize) {
			return -1;
		} else if (numbers.length == 0) {
			return -1;
			//Logic is to add all the number from the array and subtract from summation
		} else {
			int sumOfNumbers = 0;
			for (int i = 0; i < numbers.length; i++) {
				sumOfNumbers = sumOfNumbers + numbers[i];
			}
			//summation of first N natural integer numbers is N(N+1)/2
			return ((expectedSize * (expectedSize + 1)) / 2) - sumOfNumbers;

		}

	}

}
