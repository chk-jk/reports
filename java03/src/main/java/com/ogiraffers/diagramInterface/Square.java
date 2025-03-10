package com.ogiraffers.diagramInterface;

public class Square implements Diagram {
    private double width;
    private double height;

    public Square (double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width*height;
    }
}
