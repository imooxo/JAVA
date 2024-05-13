package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
    // ArrayList
        Scanner scan = new Scanner(System.in);
        List<String> text = new ArrayList<>();
        while(true){
            System.out.println("문자를 입력해주세요.");
            String texts = scan.nextLine();
            if(texts.equals("exit")){
                scan.close();
                break;
            }
            text.add(texts);
        }
        for(String list : text) {
            System.out.println(list);
        }
    }// main
}//class
