package com.penghk.learn;

import java.util.BitSet;

/**
 * @Author:hangkong.peng
 * @Date: 2021/6/18 16:44
 */
public class LengthOfLongestSubstring03 {


    public int lengthOfLongestSubstring(String s) {

        int longestlen = 0;
        BitSet charSet = new BitSet();

        int subLen = 0;
        for (int i = 0; i < s.length(); i++) {

            if (longestlen >= s.length() - i) {
                return longestlen;
            }

            for (int j = i; j < s.length(); j++) {

                if (charSet.get(s.charAt(j))) {
                    //already have this char
                    if (subLen >  longestlen) {
                        longestlen = subLen;
                    }
                    charSet.clear();
                    subLen = 0;
                    break;
                } else {
                    charSet.set(s.charAt(j));
                    subLen += 1;
                    if ((j == s.length() - 1) && subLen > longestlen) {
                        longestlen = subLen;
                    }
                }

            }
        }

        return longestlen;
    }



}
