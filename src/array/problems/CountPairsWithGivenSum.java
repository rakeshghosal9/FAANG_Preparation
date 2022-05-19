package array.problems;

import java.util.HashMap;

public class CountPairsWithGivenSum {

	/*
	 * Given an array of N integers, and an integer K, find the number of pairs
	 * of elements in the array whose sum is equal to K.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: N = 4, K = 6 arr[] = {1, 5, 7, 1} Output: 2 Explanation: arr[0] +
	 * arr[1] = 1 + 5 = 6 and arr[1] + arr[3] = 5 + 1 = 6.
	 * 
	 * Example 2:
	 * 
	 * Input: N = 4, K = 2 arr[] = {1, 1, 1, 1} Output: 6 Explanation: Each 1
	 * will produce sum 2 with any 1.
	 */

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 1 };
		int N = 4;
		int K = 2;
		System.out.println(getPairsCount(arr, N, K));
	}

	public static int getPairsCount(int[] arr, int n, int k) {
		int c = 0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int a = k - arr[i];
			if (hmap.get(a) != null) {
				c = c + hmap.get(a);
			}
			Integer c1 = hmap.get(arr[i]);
			if (hmap.get(arr[i]) == null)
				hmap.put(arr[i], 1);
			else
				hmap.put(arr[i], ++c1);
		}
		return c;
	}

}
