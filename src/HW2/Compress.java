package HW2;

public class Compress {
	public String compressStr(String str) {
		StringBuffer rst = new StringBuffer();
		int count = 1;
		char prev = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == prev) {
				count++;
			} else {
				rst.append(prev);
				rst.append(count);
				count = 1;
				prev = str.charAt(i);
			}
		}
		rst.append(prev);
		rst.append(count);
		String result = rst.toString();
		return result.length() > str.length() ? str : result;
	}
	
	public static void main(String[] args) {
		Compress rst = new Compress();
		String in = "abcddddddddd";
		System.out.println(rst.compressStr(in));
	}
}
