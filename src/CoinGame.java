
public class CoinGame {
	public int game(int N, int K, int[] S, int index) {
		if (S[index] > N) {
			return -1;
		}
		if (S[index] == N) {
			return S[index];
		}
		boolean win = true;
		for (int i = 0; i < K; i++) {
			if (game(N-S[index], K, S, i) !=-1) {
				win = false;
				break;
			}
		}
		if (win) {
			return S[index];
		} else {
			return -1;
		}
	}
	public int strategy(int N, int K, int[] S) {
		for (int i = 0; i < K; i++) {
			if (game(N, K, S, i) != -1) {
				return S[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		CoinGame rst = new CoinGame();
		int N = 50;
		int K = 2;
		int[] S = new int[K];
		S[0] = 1; 
		S[1] = 3; 
//		S[2] = 4;
		System.out.println(rst.strategy(N, K, S));
	}
}
