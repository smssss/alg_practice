import java.io.*;
import java.util.*;

public class Solution_8_4 {
	public static void main(String[] args) {
		System.out.println(perm("abcd"));
	}
	public static List<String> perm(String s) {
		if (s == null || s.isEmpty()) return null;

		List<String> strs = new ArrayList<String>();
		if (s.length() == 1) {
			strs.add(s);
			return strs;
		}		
		
		List<String> strsLast = perm(s.substring(0, s.length() - 1));
		for (String str : strsLast) {
			String pre = null, post = null;
			for (int i = 0; i <= str.length(); i++) {
				pre = i > 0 ? str.substring(0, i) : "";
				post = i < str.length() ? str.substring(i, str.length()) : "";
				strs.add(pre + s.charAt(s.length() - 1) + post);
			}
		}
		
		return strs;
	}
}
