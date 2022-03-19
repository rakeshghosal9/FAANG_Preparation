package array.problems;

public class SortAnArrayOf012 {

	/*
	 * Given an array of size N containing only 0s, 1s, and 2s; sort the array
	 * in ascending order.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: N = 5 arr[]= {0 2 1 2 0} Output: 0 0 1 2 2 Explanation: 0s 1s and
	 * 2s are segregated into ascending order. Example 2:
	 * 
	 * Input: N = 3 arr[] = {0 1 0} Output: 0 0 1 Explanation: 0s 1s and 2s are
	 * segregated into ascending order.
	 */

	public static void main(String[] args) {
		int arr[] = { 2, 1, 0, 0, 2, 0, 1, 1 };
		sort012(arr, 8);

	}

	public static void sort012(int[] a, int n) {
		int startIndex = 0;
		int temp = 0;
		int endIndex = (n - 1);
		int mid = 0;

		while (mid <= endIndex) {
			switch (a[mid]) {
			case 0:
				temp = a[startIndex];
				a[startIndex] = 0;
				a[mid] = temp;
				startIndex++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp = a[endIndex];
				a[endIndex] = 2;
				a[mid] = temp;
				endIndex--;
				break;

			}
		}

	}

}
