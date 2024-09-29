package org.example;
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/


public class MedianTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalArray = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0,sum=0;
        while(i<nums1.length+nums2.length){
            if(j<nums1.length && k<nums2.length){
                if(nums1[j]<=nums2[k]){
                    finalArray[i]=nums1[j];
                    j++;
                }
                else{
                    finalArray[i]=nums2[k];
                    k++;
                }
            }
            else if(j<nums1.length){
                finalArray[i]=nums1[j];
                j++;
            }
            else if(k<nums2.length){
                finalArray[i]=nums2[k];
                k++;
            }
            sum=sum+finalArray[i];
            i++;
        }
        if (finalArray.length % 2 == 1) {
            return finalArray[finalArray.length / 2];
        } else {
            return (finalArray[(finalArray.length / 2) - 1] + finalArray[finalArray.length / 2]) / 2.0;
        }
    }
}
