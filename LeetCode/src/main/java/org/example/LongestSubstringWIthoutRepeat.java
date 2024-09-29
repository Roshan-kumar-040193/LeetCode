package org.example;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstringWIthoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int n=s.length();
        int win =0;
        int[] idx =new int[96];
        for(int i=0;i<n;i++)
        {
            int c=s.charAt(i)-32;
            win=Math.max(idx[c],win);
            ans=Math.max(ans,i-win+1);
            idx[c]=i+1;
        }
        return ans;
    }
}
