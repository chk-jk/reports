package com.ogiraffers.StringReverse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        사용자로부터 문자열을 입력받습니다. 입력받은 문자열을 뒤집어 출력합니다.
//        입력받은 문자열의 대소문자를 변환하여 출력합니다.
//        결과물로 사용자가 입력한 문자열을 뒤집고 대소문자를 변환하여 출력하는 스크린샷을 제출합니다.

        // 1-1 번 charAt()을 이용한 알고리즘
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String line = sc.nextLine();
        String reverse = "";
        for(int i = line.length()-1; i>=0; i--) {
            reverse = reverse+line.charAt(i);
        }
        System.out.println(reverse);
        // 1-2 번 Stringbuilder의 reverse()를 이용한 뒤집기
        StringBuilder sb = new StringBuilder(line);
        System.out.println("--------------------");
        System.out.println(sb.reverse());

        // 2번 대소문자 변환 upperCase, lowerCase 사용
        System.out.print("영문으로 된 문자열 입력 : ");
        String engLine = sc.nextLine();
        String upperlower = "";
        for(int i=0; i<engLine.length(); i++) {
            if(Character.isUpperCase(engLine.charAt(i))){
                upperlower = upperlower+Character.toLowerCase(engLine.charAt(i));
            }else {
                upperlower = upperlower+Character.toUpperCase(engLine.charAt(i));
            }
        }
        System.out.println("변환된 문자열은 : "+upperlower+" 입니다.");

    }
}
