package _05_class.b_static;

/*
    정적(static) 멤버
    - 인스턴스를 생성할 필요 없이 바로 접근할 수 있음
    - new ClassName 을 통해서 객체를 생성할 필요가 없음
    - 정적 메소드와 정적 블록은 객체가 없어도 실행 가능하므로, 내부에 인스턴스 필드나 메소드 사용 불가능
    - this 사용 불가능
 */
public class Calculator {
    static double pi = 3.141592;
    static int plus(int x, int y){
        return x + y;
    }
    static int minus(int x, int y){
        return x - y;
    }

    static double circumference(int r){
        return 2 * r * pi;
    }
}//class
