package com.ogiraffers.diagramArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Diagram[] diagrams = new Diagram[5];

        diagrams[0] = new Diagram("Circle", 50);
        diagrams[1] = new Diagram("Triangle", 75);
        diagrams[2] = new Diagram("Square", 90);
        diagrams[3] = new Diagram("Pentagon", 105);
        diagrams[4] = new Diagram("Hexagon", 120);

        Arrays.stream(diagrams).forEach(Diagram::getArea);
        // 스트림을 이용한 향상된 포-이치 문
    }
}
