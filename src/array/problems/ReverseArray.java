package array.problems;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 3, 6, 1, 8, 4, 54, 22, 34, 87, 12, 43 };
		int indexToBeVisited = (arr.length / 2) - 1;
		// System.out.println(indexToBeVisited);
		int endIndex = arr.length - 1;
		int tempValue = 0;
		for (int startIndex = 0; startIndex <= indexToBeVisited; startIndex++) {
			tempValue = arr[endIndex];
			arr[endIndex] = arr[startIndex];
			arr[startIndex] = tempValue;
			endIndex--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}

	}

}
