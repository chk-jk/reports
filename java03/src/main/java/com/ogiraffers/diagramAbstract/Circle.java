package com.ogiraffers.diagramAbstract;

public class Circle extends AbstractDiagram {
    private double radius;

    public Circle(double radius) {
        super("원");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
