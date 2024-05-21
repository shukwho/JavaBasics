package com.who.shuk.basicCodingQuestions;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="abs dfg sd";
        System.out.println(removeSpaces(str));
    }
    public static String removeSpaces(String s){
        StringBuilder stringBuilder = new StringBuilder();
        char[] ch = s.toCharArray();
        for(char c: ch){
            if(!Character.isWhitespace(c))
                stringBuilder.append(c);

        }

        return stringBuilder.toString();
    }
}
