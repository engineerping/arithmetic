package com.example.anytest.sorting;

/**
 * @author gongchengship@163.com
 *
 * 将两个有序数组, 合并成一个有序数组
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */
public class MergeSort {

    public static int[] merge(int[] arr1, int[] arr2) {
        // 健壮性条件省略

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while ( i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;

            } else if (arr1[i] > arr2[j]){
                result[k] = arr2[j];
                j++;
                k++;

            } else {
                result[k] = arr1[i];
                i++;
                k++;
                result[k] = arr2[j];
                j++;
                k++;
            }

        }

        return result;
    }

    public static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i +"]: " + arr[i] + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        print(arr1);
        print(arr2);
        int[] result = merge(arr1, arr2);
        print(result);

    }

}
