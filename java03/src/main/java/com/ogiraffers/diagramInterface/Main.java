package com.ogiraffers.diagramInterface;

public class Main {
    public static void main(String[] args) {
//        도형 인터페이스를 작성하고, 도형의 면적을 계산하는 메서드를 선언합니다.
//        도형 인터페이스를 구현한 구체적인 도형 클래스(원, 사각형, 삼각형 등)를 작성합니다.
//        도형 인터페이스를 구현한 클래스의 객체를 생성하고, 면적을 계산하여 출력합니다.
//        결과물로 도형 인터페이스를 구현한 클래스를 생성하고, 면적을 계산하여 출력하는 스크린샷을 제출합니다.

        // 객체 생성
        Diagram circle = new Circle(15);
        Diagram triangle = new Triangle(9,7);
        Diagram square = new Square(8,5);

        //출력
        System.out.println("원의 면적은 : " + circle.getArea() + "입니다.");
        System.out.println("삼각형의 면적은 : " + triangle.getArea() + "입니다.");
        System.out.println("사각형의 면적은 : " + square.getArea() + "입니다.");
    }
}
