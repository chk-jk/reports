package com.ogiraffers.diagramAbstract;

public class Square extends AbstractDiagram{
    private double width;
    private double height;

    public Square(double width, double height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
