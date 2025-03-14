package com.ogiraffers.lambdaCalc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 연산자에 따른 람다 함수 매핑
        Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();
        operations.put("+", (a, b) -> a + b);
        operations.put("-", (a, b) -> a - b);
        operations.put("*", (a, b) -> a * b);
        operations.put("/", (a, b) -> b != 0 ? a / b : null);
        // 삼항식을 통해 간단하게 divide by zero 구현

        try {// 사용자 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = Double.parseDouble(scanner.next());

            System.out.print("연산자(+,-,*,/)를 입력하세요: ");
            String operator = scanner.next();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = Double.parseDouble(scanner.next());

            // 연산 수행 및 결과 출력
            BiFunction<Double, Double, Double> operation = operations.get(operator);
            if (operation != null) {
                Double result = operation.apply(num1, num2);
                if (result != null) {
                    System.out.println("결과: " + result);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
            } else {
                System.out.println("유효하지 않은 연산자입니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("유효한 숫자를 입력하세요.");
        } finally {
            scanner.close();
        }
    }
}