package Challenge;

import java.util.Random;

public class UniformProbability {
	// i is the ith number on stream, val is its value, K is the size of element
	public void findKSubset(int[] subset, int i, int val, int K) {
		if ( i < K) {
			subset[i] = val;
		} else {
			Random rnd = new Random();
			int rand = rnd.nextInt(i);
			if (rand < K) {
				subset[rand] = val;
			} else {
				return;
			}
		}
	}
}
