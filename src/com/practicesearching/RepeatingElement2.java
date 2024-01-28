package com.practicesearching;

public class RepeatingElement2 {
    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 5, 4, 6, 7, 2, 2};
        System.out.println("Repeating element is " + repeatelem(arr));
    }

    // TC:O(n), SC:(1)
    private static int repeatelem(int[] arr) {
        int slow = arr[0] + 1, fast = arr[0] + 1;
        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        } while (slow != fast);
        slow = arr[0] + 1;
        while (slow != fast) {
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }
        return slow - 1;
    }
}
