package com.ogiraffers.section01.square;

import java.util.Scanner;

public class square01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("직사각형의 가로 길이를 입력해주세요 : ");
        double width = sc.nextDouble();
        System.out.print("직사각형의 세로 길이를 입력해주세요 : ");
        double length = sc.nextDouble();
        double extent = length*width;

        System.out.println("직사각형의 넓이는 : " + extent + "입니다.");
    }
}
