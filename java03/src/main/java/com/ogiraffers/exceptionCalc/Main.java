package com.ogiraffers.exceptionCalc;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
            System.out.println("첫번째 숫자를 입력해주세요");
            double num1 = sc.nextDouble();
            System.out.println("연산자를 입력해주세요");
            char operand = sc.nextLine().charAt(0);
            System.out.println("두번째 숫자를 입력해주세요");
            double num2 = sc.nextDouble();
            if(operand == '+') {
                System.out.println(num1+"+"+num2+"="+(num1+num2));
            } else if (operand == '-') {
                System.out.println(num1+"-"+num2+"="+(num1-num2));
            } else if (operand == '/') {
                System.out.println(num1+"/"+num2+"="+(num1/num2));
            } else if (operand == '*') {
                System.out.println(num1+"*"+num2+"="+(num1*num2));
            }
        }
    }

