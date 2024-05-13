package _03_array;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        // 배열 선언
        /*
            1. 타입[] 변수이름;  <= 관례적으로 이 방법을 더 많이 사용
            2. 타입 변수이름[];
         */
        int[] arr1;
        int arr2[];

        String[] temp = null; // referent(레퍼런스/참조형)타입, null로 초기화 할 수 있음.
        System.out.println(temp); // null
        //System.out.println(temp[0]); // error

        int[] intArray = {10,22,25,44,55};
        System.out.println("intArray 의 0번 인덱스" + intArray[0]); //// 10
        System.out.println("intArray: " + intArray); // [I@5b6f7412
        //1번 인덱스 값 22을 20으로 변경
        intArray[1] = 20;
        System.out.println("intArray: " + Arrays.toString(intArray)); // [10, 20, 25, 44, 55] 실제로 변경 완료


        char[] charArray;
        // charArray = {'A','a'}; // error 선언 시 초기화를 하지 않으면 compile 에러가 남
        charArray = new char[]{'A','a','2',88}; // 숫자는 정수를 의미하는게 아니라 아스키 코드의 문자를 의미
        System.out.println(charArray[2]); // 2
        System.out.println(charArray[3]); // x  88이 아닌 아스키 코드의 문자 "X" 가 나옴


        double[] doubleArray = new double[3];
        System.out.println(Arrays.toString(doubleArray)); // [0.0, 0.0, 0.0]
        doubleArray[0] = 0.1;
        doubleArray[1] = 0.5;
        doubleArray[2] = 0.7;
        //doubleArray[3] = 0.8; 배열값을 초기에 [3]으로 세칸(0,1,2)의 값을 넣어서 [3]즉 네칸(0,1,2,3)의 값을 넣으면 error
        System.out.println("변경 후: " + Arrays.toString(doubleArray)); // [0.1, 0.5, 0.7]


        // 다차원 배열
        // 배열 생성과 초기화 (2 x 3)
        int[][] matrix = {{1,2,3}, {4,5,6}};
        System.out.println("이차원 배열1: " + matrix[0][0]); // 1

        // 배열 생성과 초기화 (3 x 2)
        int[][] matrix2 = new int[3][2]; // [[0,0], [0,0], [0.0] ]
        System.out.println("이차원 배열2: " + matrix2[0][0]); // 0
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;
        // 이중 for문을 이용해서 배열의 모든 요소를 출력(확인) (matrix2만 확인)
        System.out.println("matrix2의 length " + matrix2.length); // 3
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j <matrix2[i].length; j++){
                System.out.println("matrix2[i][j]: " + matrix2[i][j]);
            }
        }

        // 객체를 참조하는 배열
        String[] langs = new String[3];
        System.out.println(Arrays.toString(langs)); // [null, null, null]
        langs[0] = "java";
        langs[1] = "java";
        langs[2] = new String("java");
        System.out.println(Arrays.toString(langs)); // [java, java, java]

        System.out.println(langs[0] == langs[1]); // 두 요소 모두 리터럴 방식, true
        System.out.println(langs[0] == langs[2]); // 리터널 방식과 객체 방식 비교, false
        System.out.println(langs[0].equals(langs[2])); // true

    }//main
}//class
