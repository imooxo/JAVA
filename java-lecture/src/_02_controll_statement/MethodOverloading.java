package _02_controll_statement;
    /*
        메소드 오버로딩 (MethodOverLoding)
        - 하나의 클래스에서 동이랗 ㄴ이름의 메서드를 여러개 정의할 수 있음.
        - 함수의 이름은 같지만 매개변수의 타입, 개수, 순서, 리턴타입 등을 가 다르게 해야지 선언(적용)이 가능
        - 함수의 동작이 유사할 때 사용
     */
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading ol = new MethodOverloading(); //인스턴스, 타입이 MethodOverloading
        // static이 아닌 메서드를 사용하기 위해서는 인스턴스를 생성하고 사용해야 함
        // 클래스를 만들고 객체를 선언한게 인스턴스임
        System.out.println("정수 두개 덧셈: " + ol.add(1,2)); // 정수 두개 덧셈: 3
        System.out.println("실수 두개 덧셈: " + ol.add(1.1,2.3)); // 실수 두개 덧셈: 3.4
        System.out.println("정수 세개 덧셈: " + ol.add(1,2, 3)); // 정수 세개 덧셈: 6
        System.out.println("실수 세개 덧셈: " + ol.add(1.1,2.1,3.3)); // 실수 세개 덧셈: 6.5

        System.out.println("실수 세개 덧셈?: " + ol.add(1.1,2.2,4.4)); // 기댓값:7.7
        // 실제결과: 7.700000000000001 (부동 소수의 한계)

        System.out.println("===== 참고: printf 사용 =====");
        System.out.printf("%d 곱하기 %d = %d", 10,3,10*3); // 10 곱하기 3 = 30
        System.out.println(10 + "곱하기" + 3 + " = " + (3 * 10)); // 10곱하기3=30
    }//main

    public int add(int a, int b){ // retunr 타입이 int임
        return a + b;
    }

    public double add(double a, double b){ // retunr 타입이 double임
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b, double c){
        return a + b + c;
    }
}// class
