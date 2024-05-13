package _02_controll_statement;

public class Method {
    public static void main(String[] args) {
        hello();
        // 반환값 있는 메서드 사용
        System.out.println(sum(5,10));
        System.out.println(conneict("안녕","하세요"));
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

    public static int multi_10(int x){
        x = x * 10;
        return x;
    }

    public static int[] multi_10_2(int[] numbers){
        // [1,2,3]
        // return [10,20,30]
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * 10;
        }
        return numbers;
    }
}//class
