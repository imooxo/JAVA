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
        char ch = 'A'; // 한단어 시 "큰 따옴표X '작은 따옴표 O / 문자시 "큰따옴표o
        
        // 논리형 변수 선언
        boolean bool = true;

        System.out.println("정수형 변수:: "+a+" "+b+" "+c+" "+d);
        System.out.println("실수형 변수:: "+e+" "+f);
        System.out.println("문자형 변수:: "+ch);
        System.out.println("논리형 변수:: "+bool);

        System.out.println("----- reference type -----");
        // 1. primitive에 있는 자료형
        // 굳이 필요한 경우가 아니라면 primitive 형 사용
        Integer aa = 1;;
        Long bb = 10L;
        Short cc = 128;
        Byte dd = -128;
        Float ee = 1.1F;
        Double ff = 1.2;
        Character chch = 'A';
        Boolean boo = false;

        // 2. primitive에 없는 자료형
        String greeting = "Hello World!"; // 문자열
        int[] numbers = {1,2,3,4,5}; // 배열
        Person person = new Person ("jade", 22);

        System.out.print("String 변수: "+ greeting);

        // for문과 배열 함께 사용하기
        for(int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]+", ");
        }

        System.out.println("배열 변수: "+ numbers);
        System.out.println("Person 객체: "+ person.getName());
        System.out.println("Person 객체: "+ person.getAge());
    }
}

// class (나중에 배울 예정)
class Person {
    private String name;

    private int age;

    public Person(String name, int age){  // 두개의 인자 받아줌
      this.name = name;
      this.age = age;
    }

    public  String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}//class
