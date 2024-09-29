package org.example;

//https://leetcode.com/problems/container-with-most-water/description/

public class ContainerMostWater {
    public int maxArea(int[] height) {
        int maxArea=0;
        int min=0;
        int l=0;
        int r=height.length-1;
        while(r>l){
            int area=0;
            min = height[r]>=height[l]?height[l]:height[r];
            area=min*(r-l);
            if(area>maxArea){
                maxArea=area;
            }
            if(height[r]<height[l]) r--;
            else l++;
        }
        return maxArea;
    }
}
