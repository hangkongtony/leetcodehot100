package com.penghk.learn;

/**
 * @Author:hangkong.peng
 * @Date: 2021/6/19 13:46
 */
public class LongestPalindrome05 {


    public static String longestPalindrome(String s) {
        int beginIndex = 0;
        int maxLen = 1;

        int strLen = s.length();
        boolean[][] isPalind = new boolean[strLen][strLen];
        for (int i = 0; i < strLen; i++) {
            isPalind[i][i] = true;
        }

        for (int i = 0; i < strLen - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalind[i][i + 1] = true;
                maxLen = 2;
                beginIndex = i;
            }
        }

        for (int j = 2; j < strLen; j++) {
            for (int i = 0; i < j -1; i++) {
                isPalind[i][j] = isPalind[i+1][j-1] && s.charAt(i) == s.charAt(j);
                if (isPalind[i][j] && maxLen < (j - i + 1)) {
                    maxLen = j - i + 1;
                    beginIndex = i;
                }
            }
        }

        return s.substring(beginIndex, beginIndex + maxLen);
    }

    public static void main(String[] args) {
        String s = "qqwwrr";
        System.out.println(longestPalindrome(s));
    }

}
