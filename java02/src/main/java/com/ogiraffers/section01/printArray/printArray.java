package com.ogiraffers.section01.printArray;

public class printArray {
    public static void main(String[] args) {
        // 1부터 10까지 숫자 배열 출력하기
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.print("배열을 출력합니다. {");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(arr[i]<arr.length){
                System.out.print(", ");
            }else {
                System.out.print("}");
            }
        }
    }
}
