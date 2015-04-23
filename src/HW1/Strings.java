package HW1;

import java.util.HashMap;

public class Strings {
	public boolean isUnique(String in) {
		if (in.length() > 256) {
			return false;
		}
		char[] input = in.toCharArray();
		HashMap<Character, Integer> hash= new HashMap<Character, Integer>();
		for (int i = 0; i < input.length; i++) {
			if (hash.containsKey(input[i])) {
				return false;
			}
			hash.put(input[i], 0);
		}
		return true;
	}
	
	// unfinished
	public boolean isPermu(String in, String target) {
		char[] tar = target.toCharArray();
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		for (int i = 0; i < tar.length; i++) {
			if (hash.containsKey(tar[i])) {
				hash.put(tar[i], hash.get(tar[i])+1);
			} else {
				hash.put(tar[i], 1);
			}
		} 
		return true;
	}
	
	public void replace(char[] in, int length) {
		int count = 0;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == ' ') {
				count++;
			}
		}
		int dif = count * 2;
		for (int i = length - 1; i >= 0; i--) {
			if (in[i] == ' ') {
				in[i + dif] = '0';
				in[i + dif - 1] = '2';
				in[i + dif - 2] = '%';
				dif = dif - 2;
			} else {
				in[i + dif] = in[i];
			}
		}
	}
	
	public static void main (String[] args) {
		Strings rst = new Strings();
		String in = "abcede";
		char[] input = new char[20];
		input[0] = 'a';
		input[1] = 'b';
		input[2] = ' ';
		input[3] = 'd';
		input[4] = ' ';
		input[5] = 'e';
		rst.replace(input, 6);
		System.out.println(input);
	}
}
