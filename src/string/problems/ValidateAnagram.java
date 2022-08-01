package string.problems;

import java.util.HashMap;

public class ValidateAnagram {

	public static void main(String[] args) {

		String a = "geeksforgeeks";
		String b = "forgeeksgeeks";
		System.out.println(isAnagram(a, b));
	}

	public static boolean isAnagram(String a, String b) {

		// Your code here
		if (a.length() != b.length()) {
			return false;
		} else {
			HashMap<Character, Integer> freq1 = new HashMap<>();
			for (int i = 0; i < a.length(); i++) {
				if (freq1.get(a.charAt(i)) != null) {
					freq1.put(a.charAt(i), (freq1.get(a.charAt(i)) + 1));
				} else {
					freq1.put(a.charAt(i), 1);
				}
			}
			HashMap<Character, Integer> freq2 = new HashMap<>();
			for (int i = 0; i < b.length(); i++) {
				if (freq2.get(b.charAt(i)) != null) {
					freq2.put(b.charAt(i), (freq2.get(b.charAt(i)) + 1));
				} else {
					freq2.put(b.charAt(i), 1);
				}
			}

			for (char key : freq1.keySet()) {
				if (freq1.get(key) != freq2.get(key)) {
					return false;
				}
			}
			return true;
		}

	}

}
