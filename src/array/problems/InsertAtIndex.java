package array.problems;

public class InsertAtIndex {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5,};
		insertAtIndex(arr, 6, 5, 90);

	}
	
	public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
        for(int i=arr.length-1;i>=index;i--)
        {
            System.out.println(i);
            arr[i+1]=arr[i]; 
        }
        arr[index] = element;
    }

}
