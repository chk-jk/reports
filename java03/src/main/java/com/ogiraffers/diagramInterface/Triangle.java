package com.ogiraffers.diagramInterface;

public class Triangle implements Diagram{
    private double width;
    private double height;

    public Triangle(double width, double height) {

        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width*height*0.5;
    }
}
