package _04_ExceptionEx;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요!: ");
        try{
            int size = scan.nextInt();
            
            //size가 0보다 클 수 있도록 설정
            if(size <= 0) {
                // throw문을 통해서 예외를 생성
                throw new IllegalArgumentException("배열의 크기는 1 이상이여야 합니다.");
            }
            // 배열길이 만들기
            int[] arr = new int[size]; // 입력받은 숫자만큼 배열 생성 // [0,0,0,0]
            
            //  배열의 요소를 size == (arr.length)의 개수만큼 입력
            for(int i = 0; i < size; i++){
                System.out.print("정수 " + (i+1) + " >> ");
                arr[i] = scan.nextInt();
            } // [1,2,2,3,4,5,5,...] 입력해준것으로 배열이 쭉 채워짐

            // 밑에 findeDuplicates 함수 호출
            ArrayList<Integer> duplicates = findDuplicates(arr);

            // 중복된 요소가 없다면 [] 빈배열이다
            if(duplicates.isEmpty()){
                System.out.println("중복된 요소가 없어요.");
            }else{
                System.out.println("중복 요소: " + duplicates);
            }

        }catch(InputMismatchException e){
            System.out.println("입력 형식이 맞지 않습니다.");
        }catch (IllegalArgumentException e){
            System.out.println(e.toString());
        }finally {
            scan.close();
        }
    }//main

    public static ArrayList<Integer> findDuplicates(int[] arr){
        // arr = [1,2,3,4,5]
        ArrayList<Integer> duplicates = new ArrayList<>();

        // 중복된 요소를 찾아서 duplicates 배열에 넣기 : duplicates.add (중복된 요소)
        /*
            [1,2,3,4,5]
            1 vs / 2,2,3,5
            2 vs. 2,3,5
            2 vs 3, 5
            3 vs 5
         */
        
        // 이중 for문 사용
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    // 중복된 요소가 있는것 && duplicates 에 없는 요소라면
                    duplicates.add(arr[i]); // [2]
                }
            }
        }
        return duplicates; // [2]만 담겨져 있는 ArrayList
    }
}// class
