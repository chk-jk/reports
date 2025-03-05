package com.ogiraffers.section01.fiveIntSort;
import java.util.Arrays;
import java.util.Scanner;

public class fiveIntSort {
    public static void main(String[] args) {
        // 5개의 정수를 입력받은 후 오름차순 정렬하기
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i=0; i<arr.length; i++) { //정수 입력 받은 후 출력
            System.out.print((i+1)+"번 정수를 입력해주세요 : ");
            arr[i] = sc.nextInt();
            if(i == arr.length-1){
                System.out.print("입력받은 정수들은 {");
                for (int j=0; j< arr.length; j++) {
                    System.out.print(arr[j]);

                    if(!(j == arr.length-1)){
                        System.out.print(", ");
                    }else{
                        System.out.print("} 입니다.");
                    }
                }
            }
        }
        System.out.println("정렬을 실행합니다.");
        Arrays.sort(arr); // array 클래스의 sort 메소드 사용
        System.out.print("오름차 순으로 정렬되었습니다 {");
        for (int i=0; i< arr.length; i++) { // 정렬 후 출력
            System.out.print(arr[i]);
            if(!(i == arr.length-1)){
                System.out.print(", ");
            }else{
                System.out.print("}");
            }
        }
    }
}
