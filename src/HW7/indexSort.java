package HW7;

/**
 * Created by dongnanzhy on 4/13/15.
 */
// Given an array of integers, write a method to find indices m and n such that if you sorted elements m through n,
// the entire array would be sorted. Minimize n - m (that is, find the smallest such sequence)
public class indexSort {
    public int findLeftSeq(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return i;
        }
        return arr.length - 1;
    }
    public int findRightSeq(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] < arr[i - 1]) return i;
        }
        return 0;
    }
    public int shrinkLeft(int[] arr, int min, int leftEnd) {
        for (int i = leftEnd; i >= 0; i--) {
            if (arr[i] <= min) return i;
        }
        return 0;
    }
    public int shrinkRight(int[] arr, int max, int rightStart) {
        for (int i = rightStart; i < arr.length; i++) {
            if (arr[i] >= max) return i;
        }
        return arr.length - 1;
    }
    public void findUnsortedSequence(int[] arr) {
        int leftEnd = findLeftSeq(arr);
        int rightStart = findRightSeq(arr);
        if (leftEnd >= arr.length - 1) return;
        int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
        for (int i = leftEnd; i <= rightStart; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        int leftIndex = shrinkLeft(arr, min, leftEnd);
        int rightIndex = shrinkRight(arr,max,rightStart);
        System.out.println(leftIndex + "  " + rightIndex);
    }

    public static void main(String[] args) {
        indexSort rst = new indexSort();
        int[] arr = {1,2,4,7,10,11,7,12,6,7,16,18,19};
        rst.findUnsortedSequence(arr);
    }
}
