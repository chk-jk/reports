package com.ogiraffers.diagramAbstract;

public class Main {
    public static void main(String[] args) {
//        도형 추상 클래스를 작성하고, 면적을 계산하는 추상 메서드를 선언합니다.
//        도형 인터페이스를 작성하고, 면적을 계산하는 메서드를 선언합니다.
//        추상 클래스와 인터페이스를 구현한 구체적인 도형 클래스(원, 사각형, 삼각형 등)를 작성합니다.
//        다양한 도형 객체를 생성하고, 각 도형의 면적을 계산하여 출력합니다.
//        결과물로 추상 클래스와 인터페이스를 이용하여 다양한 도형 객체를 생성하고 면적을 계산하여 출력하는 스크린샷을 제출합니다.

        AbstractDiagram circle = new Circle(7);
        AbstractDiagram triangle = new Triangle(3,5);
        AbstractDiagram square = new Square(7,9);

        circle.showArea();
        triangle.showArea();
        square.showArea();

    }
}
