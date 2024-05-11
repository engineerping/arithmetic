package com.example.anytest.sorting._2_bubble_sort;


/**
 * @author gongchengship@163.com
 */
public class BubbleSort {

    /**
     * 边界条件可以边调试边确定
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int len = arr.length;
        for (int i = len -1; i >= 0; i--) { //本循环共 len 趟; 每次循环, 将最大的数放到最后位置,下一次循环就少循环最后一位
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapInArray(arr, j, j+1);
                }
            }
        }
    }

    private static void swapInArray(int[] arr, int front, int back) {
        int temp = arr[front];
        arr[front] = arr[back];
        arr[back] = temp;
    }

    /**
     * For 循环的执行顺序(For 循环的3个表达式都可以单独被省略, 如果三个都被省略则相当于 while(true). For 循环式 While 循环的语法糖 ):
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
        bubbleSort(arr);
        print(arr);
    }


}
