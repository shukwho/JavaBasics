package com.who.shuk.basicCodingQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdefedcba";
        String res = reverseString(str);
        if(str.equals(res)) System.out.println("Palidrome");
        else System.out.println("Not a palindrome");

    }
    public static String reverseString(String s){
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            res.append(chars[i]);
        }
        return String.valueOf(res);
    }
}
