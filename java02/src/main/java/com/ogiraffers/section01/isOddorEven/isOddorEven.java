package com.ogiraffers.section01.isOddorEven;
import java.util.Scanner;

public class isOddorEven {
    public static void main(String[] args) {
        // 사용자가 입력한 숫자가 홀수인지 짝수인지 판별하는 프로그램
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 : ");
        int number = sc.nextInt();
        if((number % 2) == 0) {
            System.out.println("짝수입니다!");
        }else {
            System.out.println("홀수입니다!");
        }
    }
}
