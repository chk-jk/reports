package com.ogiraffers.squareClass;

public class Main {
    public static void main(String[] args) {
        // 직사각형의 길이와 너비를 저장하는 멤버 변수를 가진 직사각형 클래스를 작성합니다.
        // 직사각형의 넓이와 둘레를 계산하는 메서드를 구현합니다. 직사각형 객체를 생성하고 넓이와 둘레를 계산하여 출력합니다.
        // 결과물로 직사각형 객체를 생성하고 넓이와 둘레를 계산하여 출력하는 스크린샷을 제출합니다.

        squareClass square1 = new squareClass();

        square1.setHeight(500);
        square1.setWidth(300);
        System.out.println("가로 : "+square1.getWidth()+" 세로 : "+square1.getHeight()+"의 직사각형이 생성되었습니다.");
        System.out.println("직사각형의 넓이는 "+square1.getArea()+"이며, 둘레는 "+square1.getPerimeter()+"입니다.");

    }

}
