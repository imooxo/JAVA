package _04_ExceptionEx;

// - Error : 시스템에 비정상적인 상황
// - 코드에 의해서 수습할 수 없는 상황
// - OutOfMemoryError, ThreadDeath,

import java.util.InputMismatchException;
import java.util.Scanner;

/*
*   일반 예외(Exception, checked Exception)
*   실행 예외(Runtime Exception / unchecked Exception)
*   1) 일반 예외
*       => 확인시점: 컴파일 시점, 명시적으로 예외처리 반드시 해야함
*       => IOException, FileNotFoundException
*   2) 싫행 예외
*       => 확인시점: 런타임 시점, 예외처리를 강제되지 않지만 프로그램의 정상적인 작동을 위해 예외처리를 해주는게 좋다.
*       => NullPointerException, InputMismatchException
* */
public class ExceptionEx {

    public  static  String divide(int x, int y){
        return x + "/" + y + "=" + (x/y);
    }
    public static  int getLength(String str){
        return str.length();
    }

    public static int getValueByIdx(int[] arr, int idx){
        return arr[idx];
    }
    public static void main(String[] args) {
        System.out.println(divide(6,2)); // 6/2=3
        //System.out.println(divide(6,0)); // error

        // ########## case 1. 0으로 나누기 (ArithmeticException)
        try{
            System.out.println("나누기 연산 시작");
            System.out.println(divide(6,0));
        }catch (ArithmeticException error){ 
            // catch의 error부분에는 어떤 에러인지도 명시

            // 방법1) e.getMessage(): 예외가 발생한 이유만 보여줌
            System.out.println("나누기 중 예외 발생" + error.getMessage()); // 나누기 중 예외 발생/ by zero

            // 방법2) e.toString(): 예외 종류를 리턴
            System.out.println("나누기 중 예외 발생" + error.toString()); // 나누기 중 예외 발생java.lang.ArithmeticException: / by zero
        }finally {
            System.out.println("나누기 연산 종료!");
        }

        // ########## case 2. null에 접근 (NullPointerException)
        try{
            System.out.println(getLength("hello"));
            System.out.println(getLength(null));
        }catch (NullPointerException e){
            System.out.println("단어 길이 연산 중 예외 발생: " + e.getMessage()); // Cannot invoke "String.length()" because "str" is null
            System.out.println("단어 길이 연산 중 예외 발생: " + e.toString()); // java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        }

        // ########## case 3. index 값으로 배열 접근 시 범위에 없는 값으로 접근 (ArrayIndexOutOfBoundsException)
        int[] numbers = {10, 20, 30, 40, 50};
        try{
            System.out.println(getValueByIdx(numbers, 2)); // 30
            System.out.println(getValueByIdx(numbers, numbers.length));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱싱 중 예외 발생" + e.getMessage()); // Index 5 out of bounds for length 5
            System.out.println("배열 인덱싱 중 예외 발생" + e.toString()); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }

        // ########## case 4. 입력 형식 예외 (InputMismatchException)
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("정수를 하나 입력해주세요..");
            int number = scan.nextInt(); // 정수만 입력 받을 수 있다
            System.out.println("입력한 정수: "+number);
        }catch (InputMismatchException e){ // 문자열 입력 시
            System.out.println("입력 형식 예외 발생: " + e.getMessage()); // null
            System.out.println("입력 형식 예외 발생: " + e.toString()); // java.util.InputMismatchException
        }

    }// main
}//class


/*
    try{} catch(예외 이름 error) {} finally{}
     1. catch 여러개 이어서 쓰기 가능합니다.
        - try{} catch(예외 이름1 error){} catch(예외이름2 error){} finally{}
     2. cathch문 하나에 에러 여러개 받는 것 가능
        - catch(예외1, 예외2 error)
            = 예외처리 구문이 비슷할 때
            = 두 예외가 상속관계에 있지 않을 때
 */