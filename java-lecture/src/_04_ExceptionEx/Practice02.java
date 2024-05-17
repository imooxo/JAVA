package _04_ExceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int sum = 0;
            System.out.println("배열의 크기를 입력하세요");
            int number = scan.nextInt();
            int[] arr = new int[number];
            for(int i = 0; i<arr.length; i++){
                System.out.println("배열의 요소를 입력하세요 " + (i+1));
                arr[i] = scan.nextInt();
                sum += arr[i];
            }
            double avg = (double) sum / arr.length;
            System.out.println("배열 요소 평균 값은 %.2f " + avg );
        }catch (InputMismatchException e){
            System.out.println("입력 형식 예외 발생: " + e.getMessage());
            System.out.println("입력 형식 예외 발생: " + e.toString());

        }
    }//main
}//class
