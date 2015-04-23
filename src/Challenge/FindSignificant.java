package Challenge;

public class FindSignificant {
	public int findSignificant(int x) {
		int pos = 0;
		if (x < 0) return 32;
		while (x != 0) {
			x = x>>1;
			pos++;
		}
		return pos;
	}
    public static void main (String []args) {
    	int in = -1;
    	FindSignificant rst = new FindSignificant();
    	System.out.println(rst.findSignificant(in));
    }
}
