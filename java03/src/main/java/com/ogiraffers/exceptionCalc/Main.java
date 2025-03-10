package com.ogiraffers.exceptionCalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        double num1 = sc.nextDouble();
        System.out.print("연산자를 입력해주세요 : ");
        char operator = sc.next().charAt(0);
        System.out.print("두번째 숫자를 입력해주세요 : ");
        double num2 = sc.nextDouble();
        double result = calculate(num1, num2, operator);
        System.out.println("결과 값 : " + result);
        } catch (InputMismatchException e) { // 예외처리
            System.out.println("숫자를 입력해주세요");
        }
    }

    public static double calculate (double num1, double num2, char operator) {

        // 계산 메서드
        switch (operator) {
            case '+' : return num1 + num2;
            case '-' : return num1 - num2;
            case '*' : return num1 * num2;
            case '/' :
                if(num2 == 0) {
                    throw new ArithmeticException("Can't Divide by Zero");
                }
                return num1 / num2;
            default:
                try {
                    throw new Exception("잘못된 연산자입니다.");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }

    }
}


