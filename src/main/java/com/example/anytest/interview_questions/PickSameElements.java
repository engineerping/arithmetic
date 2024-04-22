package com.example.anytest.interview_questions;
import java.util.Arrays;

/**
 * @author gongchengship@163.com
 *
 * 有2个数组，存的是字符串，取出相同的元素。
 * (1.对数组排序后使用双指针 ( O(n * log n)) 来做)
 * (1.双重 for 循环 O(n^2) 也可以做)
 */

public class PickSameElements {
    public static void main(String[] args) {
        String[] array1 = new String[]{"AA", "DD", "BB", "CC"};
        String[] array2 = new String[]{"CC", "BB",};

        String[] sameElements = findSameElements(array1, array2);
        for (String element : sameElements) {
            System.out.println(element);
        }
    }

    public static String[] findSameElements(String[] array1, String[] array2) {
        // 对两个数组进行排序,就可以使用双指针法,时间复杂度O(n * log n), 而假如使用嵌套for 循环,时间复杂度就变为 O(n^2)
        Arrays.sort(array1);
        Arrays.sort(array2);

        int min = array1.length < array2.length ? array1.length : array2.length; //取较小值
        String[] resultArray = new String[min];

        // 双指针法遍历两个数组
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            int check = array1[i].compareTo(array2[j]);
            if (check < 0) {
                i++;
            } else if (check > 0) {
                j++;
            } else {
                // 如果两个元素相等，则将其添加到结果数组中
                resultArray[k] = array1[i];
                i++;
                j++;
                k++;
            }
        }

        // 其实 resultArray 数组中, 只有 k 个元素师有效的
        return Arrays.copyOf(resultArray, k);
    }
}
