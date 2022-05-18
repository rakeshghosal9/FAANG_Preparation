package array.problems;

public class RemoveDuplicateElementsFromSortedArray {

	/*
	 * Given a sorted array A[] of size N, delete all the duplicates elements
	 * from A[]. Note: Don't use set or HashMap to solve the problem.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: N = 5 Array = {2, 2, 2, 2, 2} Output: 2 Explanation: After
	 * removing all the duplicates only one instance of 2 will remain. Example
	 * 2:
	 * 
	 * Input: N = 3 Array = {1, 2, 2} Output: 1 2
	 */

	public static void main(String[] args) {

		int A[] = { 1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63,
				65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100 };
		int N = 42;

		int count = 0;
		// Loop for all the elements in the array
		for (int i = 0; i < N; i++) {
			if (i == 41) {
				System.out.println("Done");
			}
			// If the current element is equal to the next element, we skip
			if (i < N - 1 && A[i] == A[i + 1]) {
				continue;
			}
			// We will update the array in place
			A[count] = A[i];
			count++;
		}

		for (int i = 0; i < count; i++) {
			System.out.println(A[i]);
		}
	}

}
