package _02_controll_statement;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int a = scan.nextInt();
        scan.close();

        for(int i = 1; i <= a; i++){
            System.out.print(i + " ");
        }
    }//main
}//class
