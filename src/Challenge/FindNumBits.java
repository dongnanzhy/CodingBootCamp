package Challenge;

public class FindNumBits {
	public int findNumBits(int a) {
		int count = 0;
		for (int i = 0; i < 32; i++) {
			int test = 1<<i;
			int tmp = test & a;
			if (tmp != 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int a = 0;
		FindNumBits rst = new FindNumBits();
		System.out.println(rst.findNumBits(a));
	}
}
