package HW6;

import java.util.Stack;

public class SortStack {
	public Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> rst = new Stack<Integer>();
		while (!s.isEmpty()) {
			int tmp = s.pop();
			while (true) {
				if (rst.isEmpty() || tmp >= rst.peek() ) {
					rst.push(tmp);
					break;
				} else {
					s.push(rst.pop());
				}
			}
		}
		return rst;
	}
}
