package _02_controll_statement;

import java.util.ArrayList;
import java.util.List;

public class Loop {
    public static void main(String[] args) {
        //반복문
        // 1) 기본 for문
        System.out.println("=== for문 ===");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // 2) 기본 while문
        System.out.println("=== while문 ===");
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        // 3) Do - while문
        // => 적어도 한번은 실행되는 반복문
        System.out.println("=== do-while문 ===");
        int j = 1;
        do{
            System.out.println(j); // 일단 do를 실행함
            j++;
        }while(j <= 10); // 조건 검사를 나중에 함
        
        // 배열과 for문 작성
        // 1) for ~ each 문
        String[] arr = {"A", "B", "C"}; // string 타입의 배열
        // 배열에 돌아가는 반목문
        // for(변수 선업 : 배열) { 실행문 }
        for(String str:arr){
            System.out.println("str: " + str);
        }

        // 2) ArrayList
        List<String> list = new ArrayList<String>(); // 리스트 중에 array list
        list.add("Apple"); // ArrayList에 추가하는법: add() 사용
        list.add("Banana");
        list.add("Cherry"); // list = ["A","B","C"]
        for(String str: list){
            System.out.println("list str: " + str);
        }

        // 3) foreach with Lamda
        // (익명함수! () -> {} )
        list.forEach(data-> System.out.println("data: " + data));
    }//main
}//class
