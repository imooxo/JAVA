import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // public : 접근 제한자
        // stati: JVM이 main 함수를 곧바로 실행하도록
        // void : 함수의 리턴 타입
        // main : 함수의 이름
        System.out.println("Hello and welcome!");
        System.out.println(args.length); // sout
        System.out.println(Arrays.toString(args));
    }
}