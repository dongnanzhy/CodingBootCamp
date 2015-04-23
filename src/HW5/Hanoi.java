package HW5;

public class Hanoi {
	public static void main(String[] args) {
		Tower[] tower = new Tower[3];
		for (int i = 0; i < 3; i++) {
			tower[i] = new Tower(i);
		}
		for (int i = 3; i >= 0; i--) {
			tower[0].add(i);
		}
		tower[0].moveDisks(4, tower[2], tower[1]);
	}
}
