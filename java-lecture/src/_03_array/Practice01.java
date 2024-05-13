package _03_array;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요");
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = scan.nextInt();;
        }int number = 0;
        for(int j : arr){
            number += j;
        }
        System.out.println("평균은 " + (double)number/5);
        scan.close();
    }//main
}//class
