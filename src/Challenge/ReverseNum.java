package Challenge;

public class ReverseNum {
    public int reverse(int x) {
    	int len = 0;
    	if (x < 0) {
    		len = 32;
    	} else {
        	int tmp = x;
        	while (tmp != 0) {
        		tmp = tmp>>1;
        		len++;
        	}
    	}
    	for (int i = 0; i < len/2; i++) {
    		x = swapBits(x, i, len - i - 1);
    	}
    	return x;
    }
    
    public int swapBits(int x, int i, int j) {
    	int low = (x >> i) & 1;
    	int high = (x >> j) & 1;
    	//System.out.println(low);
    	//System.out.println(high);
    	if ((high ^ low) != 0) {
    		x = x ^ ((1 << i) | (1 << j));
    	}
    	return x;
    }
    
    public static void main (String []args) {
    	int in = -1;
    	ReverseNum rst = new ReverseNum();
    	System.out.println(rst.reverse(in));
    }
}
