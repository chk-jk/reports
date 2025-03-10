package com.ogiraffers.arraySort;
import java.util.Scanner;

public class arraySort {
    public static void main(String[] args) {
        // 사용자로부터 정수 배열을 입력받습니다. 버블 정렬, 선택 정렬 등의 간단한 정렬 알고리즘을 구현하여 배열을 정렬합니다.
        // 정렬 전후의 배열 상태를 출력합니다. 결과물로 정렬 전후의 배열 상태를 보여주는 스크린샷을 제출합니다.
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이 수를 입력해주세요 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print((i+1)+"번 째 배열에 들어갈 정수를 입력해주세요 : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("현재 입력된 배열은 {");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(", ");
            }else {
                System.out.print("} 입니다.");
            }
        }
        System.out.println("배열을 정렬합니다.");
        bubbleSort(arr, n);
        System.out.print("정렬된 배열은 {");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(", ");
            }else {
                System.out.print("} 입니다.");
            }
        }
    }
    public static void bubbleSort(int[] array, int arrayLength) { // 버블정렬 메소드
        int i, j, temp;
        for(i = arrayLength-1; i>0; i--) {
            for (j = 0; j<i; j++) {
                if (array[j]>array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}