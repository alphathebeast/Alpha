package programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddtnOfNumbersInString {

	public static void regExp() {
		String s = "He110 Te5tin9 5hastra";
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(s);
		int sum = 0;
		while (m.find()) {
			int digit = Integer.parseInt(m.group());
			sum = sum + digit;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		AddtnOfNumbersInString.regExp();
	}
}
