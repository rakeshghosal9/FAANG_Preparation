package array.problems;

public class LargestElementOfArray {

	public static void main(String[] args) {

		int arr[] = { 12, 4, 11, 98, 32, 544, 23 };
		int result = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				result = arr[i];
			} else {
				result = arr[i - 1];
			}
		}

		System.out.println(result);

	}

}
