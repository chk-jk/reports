package com.ogiraffers.diagramAbstract;

public abstract class AbstractDiagram implements Diagram {

    protected String name;
    public AbstractDiagram(String name) {
        this.name = name;
    }

    public void showArea() {
        System.out.println(name + "의 면적은 : " +getArea()+ " 입니다.");
    }


}
