package org.example;

//https://leetcode.com/problems/roman-to-integer/description/


public class Roman2Int {
    public int romanToInt(String s) {
        //int M=1000,D=500,C=100,L=50,X=10,I=1;
        char[] cArray = s.toCharArray();
        int sum = 0;
        int i=cArray.length-1;
        while(i>=0){
            //System.out.println(cArray[i]);
            if(cArray[i]=='I') sum+=1;
            if(cArray[i]=='V'){
                if(i-1>=0 && cArray[i-1]=='I') {
                    sum+=4;
                    i--;
                }
                else sum+=5;
            }
            if(cArray[i]=='X'){
                if(i-1>=0&&cArray[i-1]=='I') {
                    sum+=9;
                    i--;
                }
                else sum+=10;
            }
            if(cArray[i]=='L'){
                if(i-1>=0&&cArray[i-1]=='X') {
                    sum+=40;
                    i--;
                }
                else sum+=50;
            }
            if(cArray[i]=='C'){
                if(i-1>=0&&cArray[i-1]=='X') {
                    sum+=90;
                    i--;
                }
                else sum+=100;
            }
            if(cArray[i]=='D'){
                if(i-1>=0&&cArray[i-1]=='C') {
                    sum+=400;
                    i--;
                }
                else sum+=500;
            }
            if(cArray[i]=='M'){
                if(i-1>=0&&cArray[i-1]=='C') {
                    sum+=900;
                    i--;
                }
                else sum+=1000;
            }
            i--;
            //System.out.println("i = "+i+" sum "+sum);
        }
        return sum;
    }
}
