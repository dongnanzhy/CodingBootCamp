package Challenge;

import java.util.ArrayList;

public class FindPyth1000 {
	public ArrayList<Integer> findPyth1000() {
		ArrayList<Integer> rst = new ArrayList<Integer>();
		for (int i = 1; i < 333; i++) {
			int left = i + 1;
			int right = 1000 - i;
			int sum;
			while (left < right) {
				sum = i + left + right;
				if (sum == 1000) {
					if (i*i + left*left == right*right) {
						rst.add(i);
						rst.add(left);
						rst.add(right);
						return rst;
					} else {
						left++;
						right--;
					}
				} else if (sum > 1000) {
					right--;
				} else {
					left++;
				}
			}
		}
		return rst;
	}
	public static void main(String[] args) {
		FindPyth1000 rst = new FindPyth1000();
		System.out.println(rst.findPyth1000());
	}
}
