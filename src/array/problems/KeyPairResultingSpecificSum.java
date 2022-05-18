package array.problems;

import java.util.HashMap;

public class KeyPairResultingSpecificSum {

	/*
	 * Given an array Arr of N positive integers and another number X. Determine
	 * whether or not there exist two elements in Arr whose sum is exactly X.
	 * Example 1:
	 * 
	 * Input: N = 6, X = 16 Arr[] = {1, 4, 45, 6, 10, 8} Output: Yes
	 * Explanation: Arr[3] + Arr[4] = 6 + 10 = 16 Example 2:
	 * 
	 * Input: N = 5, X = 10 Arr[] = {1, 2, 4, 3, 6} Output: Yes Explanation:
	 * Arr[2] + Arr[4] = 4 + 6 = 10
	 */

	public static void main(String[] args) {

		int Arr[] = { 1, 2, 4, 3, 6 };
		System.out.println(hasArrayTwoCandidates(Arr, 5, 10));

	}

	static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
		// code here
		HashMap<Integer, String> checkedNumbers = new HashMap<>(n);
		for (int i = 0; i < n; i++) {
			//check if the subtraction of current array element is present in HashMap
			if (checkedNumbers.get((x - arr[i])) != null) {
				return true;
			} else {
				checkedNumbers.put(arr[i], "PRESENT");
			}
		}
		return false;

	}

}
