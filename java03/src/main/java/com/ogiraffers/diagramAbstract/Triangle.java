package com.ogiraffers.diagramAbstract;

public class Triangle extends AbstractDiagram{
    private double width;
    private double height;

    public Triangle(double width, double height) {
        super("삼각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height*0.5;
    }
}
