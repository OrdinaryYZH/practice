package com.genericyzh.algoDS.string;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 * 给出一个只有小写字母的字符串，返回第一个没有重复的字母的下标
 *
 * @author genericyzh
 * @date 2017/10/7 21:38
 */
public class _01_FirstUniqueCharacterInAString {
    int[] CHAR = new int[256];

    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            CHAR[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (CHAR[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new _01_FirstUniqueCharacterInAString().firstUniqChar("loveleetcode"));
    }

}