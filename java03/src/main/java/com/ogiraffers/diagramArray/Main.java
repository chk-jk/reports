package com.ogiraffers.diagramArray;

public class Main {
    public static void main(String[] args) {
        Diagram[] diagrams = new Diagram[5];

        diagrams[0] = new Diagram("Circle", 50);
        diagrams[1] = new Diagram("Triangle", 75);
        diagrams[2] = new Diagram("Square", 90);
        diagrams[3] = new Diagram("Pentagon", 105);
        diagrams[4] = new Diagram("Hexagon", 120);

        for(int i=0; i<diagrams.length; i++){
            diagrams[i].getArea();
        }
    }
}
