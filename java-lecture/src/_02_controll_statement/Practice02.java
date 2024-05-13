package _02_controll_statement;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요");
        int x = scan.nextInt();;
        int y = scan.nextInt();
        scan.close();

        System.out.println("덧셈 결과: " + add(x,y));
        System.out.println("뺄셈 결과: " + sub(x,y));
        System.out.println("나눗셈 결과: " + dev(x,y));
        System.out.println("곱셉 결과: " + multi(x,y));
    }//main
    public static double add(double x, double y){
        return x + y;
    }

    public static double sub(double x, double y){
        return x - y;
    }

    public static double dev(double x, double y){
        return x / y;
    }

    public static double multi(double x, double y){
        return x + y;
    }


}//class
