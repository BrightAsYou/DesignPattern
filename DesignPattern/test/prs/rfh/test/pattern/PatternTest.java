package prs.rfh.test.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[0-9]{1,}.?[0-9]{1,2}");
		Matcher matcher = pattern.matcher("222.90");
		System.out.println(matcher.matches());
	}
	
}
