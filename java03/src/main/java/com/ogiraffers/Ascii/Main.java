package com.ogiraffers.Ascii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영어로 된 문자열을 입력해주세요 : ");
        String str = sc.nextLine();
        String newLine = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)>=65 && str.charAt(i)<=90) {
                newLine = newLine + (char)(str.charAt(i)+32);
            }else if (str.charAt(i)>=97 && str.charAt(i)<=122){
                newLine = newLine + (char)(str.charAt(i)-32);
            }
        }
        System.out.println(newLine);
    }
}
