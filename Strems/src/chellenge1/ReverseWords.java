package chellenge1;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "    ASD   gjlkj    jh   kn   m   ";
		System.out.println(str);
		System.out.println(reverseWords(str));

	}

	public static String reverseWords(String str) {
		if (str == null || str.length() == 0)
			return "wrong string";
		String[] strArray = str.trim().split(" ");
		for (String element:strArray) element = element.trim();
		System.out.println(Arrays.toString(strArray));
		String reverseWords = "";
		for (String element : strArray) {
			char[] tmp = element.toCharArray();
			for (int i = 0; i < tmp.length / 2; i++) {
				if (tmp.length == 1)
					break;
				char temparary = tmp[i];
				tmp[i] = tmp[tmp.length - i - 1];
				tmp[tmp.length - i - 1] = temparary;
			}
			String strFromChar = new String(tmp);
			reverseWords = reverseWords + " " + strFromChar;
		}
		return reverseWords.trim();
	}
}
