package Challenge2;

import java.util.LinkedList;
import java.util.Queue;

public class MinQue {
	private Queue<Integer> que = new LinkedList<Integer>();
	private Queue<Integer> que_min = new LinkedList<Integer>();
    public void push(int x) {
        que.offer(x);
        if (!que_min.isEmpty()) {
        	if (x <= que_min.peek()) {
        		que_min.offer(x);
        	}
        } else {
        	que_min.offer(x);
        }
    }

    public void pop() {
        if (que.isEmpty()) {
        	return;
        } else {
        	if (que.peek().equals(que_min.peek())) {
        		que.poll();
        		que_min.poll();
        	} else {
        		que.poll();
        	}
        }
    }

    public int getMin() {
        if (que_min.isEmpty()) {
        	return 0;
        } else {
        	int min = que_min.peek();
        	return min;
        }
    }
}
