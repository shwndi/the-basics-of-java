package Leetcode;

public class FindAFromB {
    public static void main(String[] args) {
        String A = "hello";
        String B = "ll";
        int i = strStr(A, B);
        System.out.println(i);
    }
    public static  int strStr(String haystack, String needle) {
        int i = haystack.indexOf(needle);
        return i;
    }
}
