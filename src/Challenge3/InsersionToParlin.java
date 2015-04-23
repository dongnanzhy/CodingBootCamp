package Challenge3;

public class InsersionToParlin {
	public int findMinInsertions(String str) {
		if (str.isEmpty() || str.length() == 0) {
			return 0;
		}
		int len = str.length();
		return helper(str, 0, len - 1);
	}
	public int helper(String str, int l, int h)
	{
	    // Base Cases
	    if (l > h) return Integer.MAX_VALUE;
	    if (l == h) return 0;
	    if (l == h - 1) return (str.charAt(l) == str.charAt(h))? 0 : 1;
	 
	    // Check if the first and last characters are same. On the basis of the
	    // comparison result, decide which subrpoblem(s) to call
	    return (str.charAt(l) == str.charAt(h))? helper(str, l + 1, h - 1):
	                               (Math.min(helper(str, l, h - 1),
	                                   helper(str, l + 1, h)) + 1);
	}
	
	public static void main(String[] args) {
		InsersionToParlin rst = new InsersionToParlin();
		System.out.println(rst.findMinInsertions("abcd"));
	}
}
