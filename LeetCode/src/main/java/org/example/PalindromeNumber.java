package org.example;
//https://leetcode.com/problems/palindrome-number/description/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int y=0;
        int p=0;
        if(x>0){
            p=reverse(x,y);
        }
        if(p==x) return true;
        else return false;
    }
    public int reverse(int x,int y){
        int j=x%10;
        y= (y*10)+j;
        if((x/10)==0) return y;
        else{
            return reverse(x/10,y);
        }
    }
}