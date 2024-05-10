package _01_basic_syntax;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = scan.nextInt();
        scan.close();
        if ( 0 < age && age < 8) {
            System.out.println("유아");
        }else if(7 < age && age <14){
            System.out.println("초등학생");
        }else if(13 < age && age < 17) {
            System.out.println("중학생");
        }else if(16 < age && age < 20){
            System.out.println("고등학생");
        }else if(age > 20){
            System.out.println("성인");
        }
    }// main
} //class
