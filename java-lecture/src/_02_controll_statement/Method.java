package _02_controll_statement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        hello();
        // 반환값 있는 메서드 사용
        System.out.println(sum(5,10));
        System.out.println(conneict("안녕","하세요"));

        int number = 5; // primitive type
        int[] numbers = {10, 20}; // reference(레퍼런스) type
        int[] numbers2 = {10, 20, 30}; // reference type

        // === call by value ====
        System.out.println("=== call by value ===");
        System.out.println("원래 number 확인: " + number);
        System.out.println("함수의 리턴값 확인: " + multi_10(number)); //위에 primitive type으로 선언한 number변수 인자에 포함
        System.out.println("함수를 거치고 난 후 number: " + number);

        // === call by address ===
        System.out.println("=== call by address ===");
        // 함수의 return값 , 배열을 return 즉 "주소"값을 확인
        System.out.println(numbers); // [I@5b6f7412
        System.out.println(multi_10_2(numbers)); // [I@5b6f7412
        // 실행 후 결과 확인
        System.out.println("원래 numbers2 확인: " + Arrays.toString(numbers2)); // 원래 numbers2 확인: [10, 20, 30]
        System.out.println("함수의 리턴값: " + Arrays.toString(multi_10_2(numbers))); // 함수의 리턴값: [1000, 2000]
        System.out.println("함수를 거치고 난 후 numbers2: " + Arrays.toString(numbers2)); // 함수를 거치고 난 후 numbers2: [10, 20, 30]
    }//main

    // 1) 반환값이 없는 메서드
    public static void hello()  { //void = 반환값이 없음
        System.out.println("hello");
    }

    // 2) 반환값이 있는 메서드
    public  static int sum(int x, int y){
        // 함수의 리턴타입과 실제 리턴해주는 타입이 일치해야함
        return x + y; // int값을 리턴해줌
    }

    public static String conneict(String a, String b){
        return a + b;
    }
    
    // call by value vs. call by address
    /*
        call by value
        - primitive 타입을 함수의 인자로 전달
        - 실제 값을 함수로 전달하는 것, 원래의 값은 변경되지 않음
     */
    /*
        call by address
        - reference(레퍼런스)타입을 함수의 인자로 전달
        - 변수가 저장되어 있는 "주소"를 전달
        - 함수 내부에서 전달된 뱐수를 변경한다면 실제 변수도 변경됨
        - 같은 "주소"를 참조하고 있음
     */

    public static int multi_10(int x){
        // call by value
        x = x * 10;
        return x;
    }

    public static int[] multi_10_2(int[] numbers){
        // call by address
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * 10;
        }
        return numbers;
    }
}//class
