package com.example.anytest.sorting._3_straight_insertion_sort;

/**
 * @author gongchengship@163.com
 */
public class StraightInsertionSort {
    private static void insertSort(int[] arr) {
        if (arr == null && arr.length <= 1) {
            return;
        }

        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[i]) {
                    swapInArray(arr, i, j);
                }
                break;
            }
        }
    }

    public static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "}: " + arr[i] + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        print(arr);
        insertSort(arr);
        print(arr);
    }

}
