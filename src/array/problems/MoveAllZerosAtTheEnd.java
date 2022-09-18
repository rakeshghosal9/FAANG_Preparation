package array.problems;

public class MoveAllZerosAtTheEnd {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 33, 4, 0, 2, 0, 2, 3, 0, 0, 3, 4 };
		int[] result = new int[arr.length];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[counter] = arr[i];
				counter++;
			}
		}

		for (int i = counter; i < arr.length; i++) {
			result[i] = 0;
		}
		
		printArray(result);

	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
