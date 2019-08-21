import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个有序数组的中位数
 * [1,2,5,6] [1,3,4,9,10]
 * [1,3] [2]
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int idx1 = 0, idx2 = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        int mid = (len1 + len2) / 2;
        int[] arr = new int[len1 + len2];
        for (int i = 0; i < len1 + len2; i++) {
            if (idx1 == len1) {
                // 数组1遍历完成
                arr[i] = nums2[idx2++];
            } else if (idx2 == len2) {
                // 数组2遍历完成
                arr[i] = nums1[idx1++];
            } else if (nums1[idx1] <= nums2[idx2]) {
                arr[i] = nums1[idx1++];
            } else {
                arr[i] = nums2[idx2++];
            }
        }
        return (len1 + len2) % 2 == 0 ? ((double) arr[mid] + (double)arr[mid-1])/2 : (double) arr[mid];   
    }
}

