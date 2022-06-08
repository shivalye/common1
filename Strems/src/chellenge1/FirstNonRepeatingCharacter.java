package chellenge1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String string = "zxcvbzxcvbazxcv";
		System.out.println("index of first non-repeating character " + findFirstSingleCharacter(string));
	}

	public static int findFirstSingleCharacter(String string) {
		if (string==null || string.length()==0) {
			System.out.println("wrong string");
			return -1;
		}
		int i;
		for (i = 0; i < string.length(); i++) {
			int count = 0;
			String regEx = string.substring(i, i + 1);
			Pattern pattern = Pattern.compile(regEx);
			Matcher matcher = pattern.matcher(string);
			while (matcher.find()) {
				count++;
			}
			if (count == 1)
				return i;
		}
		return -1;
	}

}
