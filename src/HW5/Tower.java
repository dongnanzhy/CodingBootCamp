package HW5;

import java.util.Stack;

public class Tower {
	private Stack<Integer> disks;
	private int towerNum;
	public Tower(int towerNum) {
		disks = new Stack<Integer>();
		this.towerNum = towerNum;
	}
	public int num() {
		return this.towerNum;
	}
	
	public void add(int disk) {
		if (!disks.isEmpty() && disks.peek() <= disk) {
			System.out.println("Error");
		}
		disks.push(disk);
	}
	
	public void moveTopTo(Tower t) {
		if (disks.isEmpty()) {
			return;
		}
		int disk = disks.pop();
		t.add(disk);
		System.out.println("Move disk" + disk + "from" + num() + "to" + t.num());
	}
	
	public void moveDisks(int n, Tower destination, Tower buffer) {
		if (n > 0) {
			moveDisks(n - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n - 1, destination, this);
		}
	}
}
