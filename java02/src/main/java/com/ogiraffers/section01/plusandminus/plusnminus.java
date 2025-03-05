package com.ogiraffers.section01.plusandminus;

import java.util.Scanner;

public class plusnminus {
    // 두개의 정수를 입력받기 입력받은 정수에 대한 더하기와 빼기 연산
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("두 정수의 합은 "+(num1+num2)+", 두 정수의 차이(절대값)는 "+Math.abs(num1-num2)+"입니다.");
        // Math 클래스의 절대값을 구하는 메소드를 사용
    }
}
