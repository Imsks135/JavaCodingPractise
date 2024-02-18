package com.practicesorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 2, 18};
        int n = arr.length;
        selectsort(arr, n);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    //TC:theta(n^2) less memory in compare to quicksort,mergesort,Not stable,Inplace
    private static void selectsort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_ind = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_ind]) min_ind = j;
            }
            //swap(arr[min_ind],arr[i])
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }
}
