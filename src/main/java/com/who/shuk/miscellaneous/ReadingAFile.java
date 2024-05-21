package com.who.shuk.miscellaneous;

import java.io.*;
import java.util.Scanner;

public class ReadingAFile {
    public static void main(String[] args) throws IOException {
        approach1();

    }
    public static void approach1(){
        File file = new File("C:\\Users\\shsus\\Downloads\\file.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void approach2() throws IOException {
        File file = new File("C:\\Users\\shsus\\Downloads\\file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String string;
       // System.out.println("string");
        while((string = br.readLine())!=null){
            System.out.println(string);
        }
    }
    public static void approach3() throws IOException {
        int i;
        FileReader fr = new FileReader("C:\\Users\\shsus\\Downloads\\file.txt");
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }


    }
}
