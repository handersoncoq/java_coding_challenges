package com.coqhanderson.codingChallenges.batch2;


import java.util.Arrays;

public class MedianSortedArrays {

    // given two sorted arrays
    // find the median
    // time complexity of O(log(n+m))

    public static double medianOfArrays(int[] nums1, int[] nums2){

        int[] mergedArray = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        Arrays.sort(mergedArray);

        int trueMiddle = mergedArray.length/2;
        int falseMiddle = mergedArray.length/2-1;

        if(mergedArray.length % 2 == 0)
            return (double) (mergedArray[trueMiddle] + mergedArray[falseMiddle])/2;


        return mergedArray[trueMiddle];
    }

    public static void main(String[] args) {

        System.out.println(medianOfArrays(new int[]{1, 2}, new int[]{3,4}));
    }
}
