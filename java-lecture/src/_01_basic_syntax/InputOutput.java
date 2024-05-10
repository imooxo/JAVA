package _01_basic_syntax;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.print("안녕하세요? \n"); // \n 개행문자
        System.out.println("안녕하세요? \n"); // \n 개행문자
        System.out.print("반갑습니다.. \t"); // \t tap
        System.out.print("잘부탁드립니다.");
        System.out.println();

        // 입력
        System.out.println("공백으로 구분하여 이름/나이/키/결혼여부를 입력해주세요");
        Scanner scan = new Scanner(System.in);  // Alt + shift + 방향키 // 줄 옮기기
        String name = scan.next(); // ctrl + d // 줄 복사
        int age = scan.nextInt();
        double height = scan.nextDouble();
        boolean isSingle = scan.nextBoolean();
        scan.close();

        System.out.println("===== 입력 결과 출력 =====");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("결혼?: " + isSingle);

    }//main
}//class
