package array.problems;

public class RotateAnArrayByDSpaces {

	public static void main(String[] args) {

		// arr = {1,2,3,4,5,6};
		// Rotate = 2
		// arr = {3,4,5,6,1,2};
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int rotate = 4;
		int[] result = new int[arr.length];
		int count = 0;
		for (int i = rotate; i < arr.length; i++) {
			result[count] = arr[i];
			count++;
		}
		for (int i = 0; i < rotate; i++) {
			result[count] = arr[i];
			count++;
		}

		printArray(result);

	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
