package com.example.anytest.sorting._1_selection_sort;

/**
 * @author gongchengship@163.com
 *
 * 选择排序的原理是:
 * 1. 默认只有一个元素的数组是有序的
 * 1. 找到数组中的最小值的下标, 将其与数组中 0 位置的数交换
 * 2. 找到数组中的第二小值, 将其放在数组的第二个位置
 *
 *
 */
public class SelectSort {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <len; j++) {
                if (arr[i] > arr[j]) {
                    swapInArray(arr, i, j);
                }
            }
        }
    }

    public static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * For 循环的执行顺序:
     * 1.执行表达式1, 初始化循环变量.
     *
     * 2.执行表达式2 判断循环条件.
     * 3.执行循环体...
     * 4.执行表达式3, 更新循环变量.
     * 2. ...
     * @param arr
     */
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i +"]: " + arr[i] + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        print(arr);
        selectSort(arr);
        print(arr);
    }
}
