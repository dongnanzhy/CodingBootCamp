package Challenge;

import java.util.ArrayList;
import java.util.Hashtable;

public class FindPythagorean {
	public ArrayList<ArrayList<Integer>> findPyth(int[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
		int[] pow = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			pow[i] = a[i] * a[i];
		}
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		for (int i = 0; i < pow.length; i++) {
			hash.put(pow[i], i);
		}
		for (int i = 0; i < pow.length - 2; i++) {
			for (int j = i; j < pow.length - 1; j++) {
				if (hash.containsKey(pow[i] + pow[j])) {
					ArrayList<Integer> pyth = new ArrayList<Integer>();
					pyth.add(a[i]);
					pyth.add(a[j]);
					pyth.add(a[hash.get(pow[i] + pow[j])]);
					rst.add(pyth);
				}
			}
		}
		return rst;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		FindPythagorean rst = new FindPythagorean();
		System.out.println(rst.findPyth(a));
	}
}
