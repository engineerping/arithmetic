package com.example.anytest._bisic_utils;

import java.util.Arrays;

/**
 * @author gongchengship@163.com
 * 算法常用工具集
 */
public class ArrayUtils {
    public static void print(int[] arr) {
        if (null == arr || arr.length == 0) {
            System.out.println("数组为空或者数组长度为0, 所以什么也没做");
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print("[" + i+ "]: " + arr[i] + ", ");
            } else {
                System.out.print("[" + i+ "]: " + arr[i]);
            }
        }
        System.out.println();
    }
    public static void swapInArray(int[] arr, int i, int j) {
        if (null == arr || arr.length < i || arr.length < j || i == j) {
            throw new RuntimeException("数组为null, 或者数组长度小于i, 或者数组长度小于j, 或者i等于j");
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveAllToRightThenInsertInArray(int[] arr, int indexFrom, int indexTo, int addingValue) {
        if (null == arr || arr.length < indexFrom || arr.length < indexTo || indexFrom == indexTo) {
            throw new RuntimeException("数组为null, 或者数组长度小于indexFrom, 或者数组长度小于indexTo");
        }

        if (arr.length == indexTo + 1) {
            throw new RuntimeException("indexTo + 1 等于数组长度,将会导致数组下标越界,请使用 重载方法");
        }

        for (int i = indexTo ; i >= indexFrom; i--) {
            arr[i + 1] = arr[i];
        }
        arr[indexFrom] = addingValue;

    }

    public static int[] moveAllToRightThenInsertInArray(int[] arr, int indexFrom, int indexTo, int addingValue, int newArrayLength) {
        int[] resultArr;
        if (null == arr || arr.length < indexFrom || arr.length < indexTo || indexFrom == indexTo) {
            throw new RuntimeException("数组为null, 或者数组长度小于indexFrom, 或者数组长度小于indexTo");
        }
        if (newArrayLength < arr.length + 1) {
            throw new RuntimeException("newArrayLength 小于 arr.length + 1 ");
        }

        resultArr = copyArray(arr, 0, arr.length-1, newArrayLength);

        moveAllToRightThenInsertInArray(resultArr, indexFrom, indexTo, addingValue);

        return resultArr;
    }


    /**
     * 该方法简单模拟 Arrays.copyOf(arr, newArrayLength)
     * @param arr
     * @param newArrayLength
     * @return
     */
    public static int[] copyArray(int[] arr, int newArrayLength) {
        //该方法简单模拟 : Arrays.copyOf();
        if (null == arr || arr.length == 0 ) {
            System.out.println("数组为空或者数组长度为 0");
            return arr;
        }
        if (newArrayLength < arr.length) {
            throw new RuntimeException("newArrayLength 小于 arr.length, 所以什么也没做");
        }

        int[] resultArr = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            resultArr[i] = arr[i];
        }
        return resultArr;
    }


    public static int[] copyArray(int[] arr, int indexFrom, int indexTo) {
        if (null == arr || arr.length < indexFrom || arr.length < indexTo || indexFrom == indexTo) {
            throw new RuntimeException("数组为null, 或者数组长度小于indexFrom, 或者数组长度小于indexTo");
        }

        int newArrayLength = indexTo - indexFrom + 1;

        int[] resultArr = new int[newArrayLength];

        int k = 0;
        for (int i = indexFrom; i <= indexTo; i++) {
            resultArr[k] = arr[indexFrom];
            k++;
        }

        return resultArr;
    }

    /**
     * 拷贝数组
     * @param arr
     * @param indexFrom
     * @param indexTo
     * @param newArrayLength
     * @return
     */
    public static int[] copyArray(int[] arr, int indexFrom, int indexTo, int newArrayLength) {
        if (null == arr || arr.length < indexFrom || arr.length < indexTo || indexFrom == indexTo) {
            throw new RuntimeException("数组为null, 或者数组长度小于indexFrom, 或者数组长度小于indexTo");
        }

        if (newArrayLength < indexTo - indexFrom + 1) {
            throw new RuntimeException("newArrayLength 小于 indexTo - indexFrom + 1");
        }

        int[] resultArr = new int[newArrayLength];

        int k = 0;
        for (int i = indexFrom; i <= indexTo; i++) {
            resultArr[k] = arr[i];
            k++;
        }

        return resultArr;
    }

    public static int[] copyArray(int[] arr, int indexFrom, int indexTo, int newArrayLength, int targetArrayStartIndex) {
        if (null == arr || arr.length < indexFrom || arr.length < indexTo || indexFrom == indexTo) {
            throw new RuntimeException("数组为null, 或者数组长度小于indexFrom, 或者数组长度小于indexTo, 所以什么也没做");
        }

        if (newArrayLength < arr.length || newArrayLength < targetArrayStartIndex + indexTo - indexFrom + 1) {
            throw new RuntimeException("newArrayLength小于arr.length, 或者newArrayLength小于targetArrayStartIndex + indexTo - indexFrom + 1, 所以什么也没做");
        }

        int[] resultArr = new int[newArrayLength];

        for (int i = indexFrom; i <= indexTo; i++) {
            resultArr[targetArrayStartIndex] = arr[i];
            targetArrayStartIndex++;
        }

        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(arr);
        int[] newArr = moveAllToRightThenInsertInArray(arr, 0, 9, -1, 11);
        print(newArr);
    }
}
