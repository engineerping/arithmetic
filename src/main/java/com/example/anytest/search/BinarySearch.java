package com.example.anytest.search;

import com.example.anytest._bisic_utils.MyArrayUtils;

/**
 * @author gongchengship@163.com
 *
 * https://leetcode.cn/problems/binary-search/description/
 * 704. 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int result = -1;

        int begin = 0;
        int end = arr.length - 1;

        int times = 0;
        while (begin <= end) {
            int middle = (begin + end) / 2;

            if( arr[middle] == target ) {
                return middle;
            } else if (arr[middle] > target) {
                end = middle - 1; //注意这里要减 1
            } else if (arr[middle] < target) {
                begin = middle + 1; //注意这里要加 1
            }

            times++;
        }
        System.out.println("Looped for " + times + " times");
        return result;

    }
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10};
        MyArrayUtils.print(arr);
        int target = 5;
        System.out.println("target is: " + target);


        int r = binarySearch(arr, target);

        System.out.println(r);

    }
}
