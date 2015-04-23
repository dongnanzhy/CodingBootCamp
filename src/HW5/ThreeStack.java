package HW5;

public class ThreeStack {
	final int stackSize = 100;
	int[] array = new int [stackSize * 3];
	int[] start = {-1,-1,-1};
	
	public void push(int stackNum, int value) {
		if (start[stackNum] + 1 >= stackSize) {
			System.out.println("out of size");
		}
		start[stackNum]++;
		array[stackNum * stackSize + start[stackNum]] = value;
	}
	
	public int pop(int stackNum) {
		if (start[stackNum] == -1) {
			System.out.println("stack empty");
			return 0;
		}
		int value = array[stackNum * stackSize + start[stackNum]];
		array[stackNum * stackSize + start[stackNum]] = 0;
		start[stackNum]--;
		return value;
	}
	
	public int peek(int stackNum) {
		return array[stackNum * stackSize + start[stackNum]];
	}
	
	public boolean isEmpty(int stackNum) {
		if (start[stackNum] == -1) {
			return true;
		} else {
			return false;
		}
	}
	
}
