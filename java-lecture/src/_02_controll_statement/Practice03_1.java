package _02_controll_statement;

public class Practice03_1 {
    public static void main(String[] args) {
        System.out.println("반지름이 5인 원의 넓이: " + calc(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이: " + calc(4,7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이: " + calc(6,3,true));
    }//main

    public static double calc(double r){
        return r * r * Math.PI;
    } //반지름이 5인 원의 넓이

    public static double calc(double w, double h){
        return w * h;
    }//가로 4, 세로 7인 직사각형의 넓이

    public static double calc(double a, double b, boolean tri){
        return  a * b / 2;
    }//밑변 6, 높이 3인 삼각형의 넓이
}//class
