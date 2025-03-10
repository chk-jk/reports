package com.ogiraffers.squareClass;

public class squareClass {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double Area;
        Area = this.width*this.height;
        return Area;
    }
    public double getPerimeter() {
        double perimeter;
        perimeter = (this.width+this.height)*2;
        return perimeter;
    }


}
