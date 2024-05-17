package _05_class.d_practice;

import java.util.Scanner;

public class Circle {
    private final double radius;
    static double PI = Math.PI;

    public Circle(double r){
        this.radius = r;
    }

    public double getRadius(){
        return this.radius;
    }

    public double calculatorArea(){
        return radius*radius*PI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 반지름을 입력하세요: ");
        int r = sc.nextInt();
        Circle c1 = new Circle(r);
        System.out.println("원의 반지름: " + c1.getRadius());
        System.out.println("원의 넓이: " + c1.calculatorArea());
    }
}//class
