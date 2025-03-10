package com.ogiraffers.diagramInterface;

public class Circle implements Diagram{
    // 구현 클래스 (도형 인터페이스 구현)
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    // 면적 구하는 메서드 오버라이딩
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
