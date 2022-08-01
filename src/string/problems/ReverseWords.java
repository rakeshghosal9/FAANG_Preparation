package string.problems;

public class ReverseWords {

	public static void main(String[] args) {
		
		String S = "i;like;this;program;very;much";
		System.out.println(reverseWordsTask(S));

	}
	
	
	static String reverseWordsTask(String S)
    {
        // code here 
        String result="";
        String[] arr = S.split(";");
        for(int i=(arr.length - 1);i>=0;i--)
        {
            if(i==arr.length - 1)
            {
                result = arr[i];
            }
            else
            {
                result = result + "." + arr[i];
            }
        }
        return result;
    }

}
