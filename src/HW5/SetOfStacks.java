package HW5;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {
	public ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
	private final int stackSize = 100;
	
	public void push(int x) {
		Stack<Integer> last = stacks.get(stacks.size() - 1);
		if (last.capacity() < stackSize) {
			last.push(x);
		} else {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(x);
			stacks.add(stack);
		}
	}
	
	public int pop() {
		Stack<Integer> last = stacks.get(stacks.size() - 1);
		if (last.isEmpty()) {
			stacks.remove(stacks.size() - 1);
			return pop();
		} else {
			int result = last.pop();
			return result;
		}
	}
	
	public int popAt(int stackNum) {
		return leftShift(stackNum, true);
	}
	
	public int leftShift(int stackNum, boolean removeTop) {
		Stack<Integer> stack = stacks.get(stackNum);
		int value;
		value = removeTop? stack.pop() : removeBot(stackNum);
		if (stack.isEmpty()) {
			stacks.remove(stackNum);
		} else if (stacks.size() > stackNum + 1){
			int bottom = leftShift(stackNum + 1, false);
			stack.push(bottom);
		}
		return value;
	}
	
	public int removeBot(int stackNum) {
		Stack<Integer> stack = stacks.get(stackNum);
		Stack<Integer> tmp = new Stack<Integer>();
		while (!stack.isEmpty()) {
			int value = stack.pop();
			tmp.push(value);
		}
		int result = tmp.pop();
		while (!tmp.isEmpty()) {
			int value = tmp.pop();
			stack.push(value);
		}
		return result;
	}
}
