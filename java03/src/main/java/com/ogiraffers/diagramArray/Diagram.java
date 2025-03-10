package com.ogiraffers.diagramArray;

public class Diagram {
    private String dName;
    private double area;

    public Diagram(String dName, double area) {
        this.dName = dName;
        this.area = area;
    }
    public void getArea() {

        System.out.println("도형의 이름은 "+dName+"이고, 면적은 : "+area+"입니다.");
    }

}
