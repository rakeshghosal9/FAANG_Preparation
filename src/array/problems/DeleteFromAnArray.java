package array.problems;

public class DeleteFromAnArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int index = 0;
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
