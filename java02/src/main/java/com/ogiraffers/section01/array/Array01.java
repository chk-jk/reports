package com.ogiraffers.section01.array;

public class Array01 {
    public static void main(String[] args) {

        // 배열의 평균을 계산하고 배열 요소를 변경하는 메소드를 작성하기

        int[] arr = new int[5];

        System.out.print("현재 배열에 저장된 값은 : ");
        for (int i=0; i<arr.length; i++) { // 배열에 랜덤한 값 저장 - 인덱스 이용
            arr[i] = (int)(Math.random() * 100) + 1;
            System.out.print(arr[i]+" ");

            if(i==arr.length-1) {
                System.out.print("입니다");
                System.out.println();
            }
        }
        int avg = getAvg(arr); // 배열의 평균을 계산하는 스태틱 메서드를 통해 평균 값을 구함
        System.out.println("배열의 평균은 "+ avg +"입니다.");
        System.out.print("변경된 배열에 저장된 값은 : ");
        for (int i=0; i<arr.length; i++) { // 인덱스를 이용해 같은 주소의 배열에 랜덤하게 새 값을 저장
            arr[i] = (int)(Math.random() * 100) + 1;
            System.out.print(arr[i]+" ");

            if(i==arr.length-1) {
                System.out.print("입니다");
            }
        }
    }
    public static int getAvg(int[] array) { // 배열의 평균을 구하는 스태틱메소드

        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        int avg = sum/array.length;
        return avg;
    }
}
