package _01_basic_syntax;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("----- primitive type -----");
        
        // 정수형 변수 선언
        int a = 11;
        long b = 1000000000L; // long 타입은 뒤에 'L'을 붙여야함
        short c = 30000;
        byte d = 127;
        
        // 실수형 변수 선언
        float e = 3.14F; // float 타입은 뒤에 "F"를 붙여야함
        double f = 2.7777;

        // 문자형 변수 선언
        char ch = 'A'; // "큰 따옴표X '작은 따옴표 O
        
        // 논리형 변수 선언
        boolean bool = true;

        System.out.println("정수형 변수:: "+a+" "+b+" "+c+" "+d);
        System.out.println("실수형 변수:: "+e+" "+f);
        System.out.println("문자형 변수:: "+ch);
        System.out.println("논리형 변수:: "+bool);
    }
}
