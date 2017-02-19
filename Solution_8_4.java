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
		String sLast = s.substring(0, s.length() - 1);
		List<String> strsLast = perm(sLast);
		String pre = null, post = null;
		for (String str : strsLast) {
			for (int i = -1; i < str.length(); i++) {
				pre = i >= 0 ? str.substring(0, i + 1) : "";
				post = i < str.length() - 1 ? str.substring(i + 1, str.length()) : "";
				strs.add(pre + s.charAt(s.length() - 1) + post);
			}
		}
		
		return strs;
	}
}
