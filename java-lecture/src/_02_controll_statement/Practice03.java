package _02_controll_statement;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 5;
        double b = 4;
        double c = 7;
        double d = 6;
        double f = 3;

        System.out.println("반지름이 5인 원의 넓이: " + circle(a));
        System.out.println("가로" + b + "세로" + c + "직사각형의 넓이: " + quadrangle(b,c));
        System.out.println("밑변" + d + "높이" + f + "삼각형의 넓이: " + triangle(d,f));
    }//main

    public static double circle(double a){
        return a * a * Math.PI;
    }

    public static double quadrangle(double b, double c){
        return b * c;
    }
    public static double triangle(double d, double f){
        return (d * f) / 2;
    }
}//class
