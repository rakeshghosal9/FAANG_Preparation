package array.problems;

public class LeftRotateAnArrayByOne {

	public static void main(String[] args) {

		// arr1[] = {1,2,3,4,5};
		// arr2[] = {2,3,4,5,1};
		int arr[] = { 4, 2, 9, 66, 4, 34, 65, 76 };
		int firstElement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = firstElement;
		printArray(arr);

	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

}
