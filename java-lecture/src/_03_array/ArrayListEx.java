package _03_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* js 에서 제공하는 여러개의 데이터를 담아두는 자료 구조 : array, object
* java에서는 객체를 효율적으로 추가, 삭제, 검색할 수 있는 interface & class java.util. ~~ 에 포함되어 있음
* == collection
* */
/*
    Java의 Collection
    - List
        - ArrayList
        - Vector
        - LinkedList
    - set
        - HashSet
        - TreeSet
    - Map
        - HashMap
        - HashTable
        - TreeMap
        - Properties..
 */
// ArrayList
// - List collection에서 가장 많이 사용되는 컬렉션
// - 표준 배열보다 조금 느림, 많은 조작이 필요할 경우 유용
// - 표준 배열과 다르게 배열의 크기를 미리 지정하지 않아도 됨
//    - 표준 배열은 정적 할당, ArrayList는 동적 할당
public class ArrayListEx {
    public static void main(String[] args) {
        //List<E> numbers = new ArrayList<>(); // E에 지정된 타입의 객체만 저장 가능
        //List<E> numbers = new ArrayList<E>(); // E에 지정된 타입의 객체만 저장 가능
        //List numbers = new ArrayList(); // 모든 타입의 객체 저장 가능
        // 1) ArrayList 생성하기
        List<Integer> numbers = new ArrayList<>();
        System.out.println(numbers); // [] 빈배열 // Arrays.toString 사용하지 않아도 돼요
        System.out.println(Arrays.toString(numbers.toArray())); // [] 빈배열


        // isEmpty() 사용해보기 > true or false
        System.out.println("isEmpty? " + numbers.isEmpty()); // true


        // 2) 요소 추가: add() 이용
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers); // [10, 20, 30, 40, 50]
        System.out.println("isEmpty? " + numbers.isEmpty()); // false
        System.out.println("contains 사용: " + numbers.contains(10)); // true
        System.out.println("contains 사용: " + numbers.contains(11)); // false
        
        
        // 3) 요소 접근
        //System.out.println(numbers[0]); // 이렇게 접근하면 x
        System.out.println("0번째 index 확인" + numbers.get(0)); // 10

        
        // 4) index로 요소 수정
        // numbers[1] = 77; // error
        // numbers.set(index번호, 바꿀 값)
        numbers.set(1, 77);
        System.out.println("요소 변경 후: " + numbers); // [10, 77, 30, 40, 50]


        // 5) 요소 삽입 (맨 뒤가 아니고 중간에 요소 삽입)
        //numbers.add(인덱스, 삽입할 값);
        numbers.add(1, 7);
        System.out.println(numbers); // [10, 7, 77, 30, 40, 50]

        
        // 6) ArrayList 끼리 연결: arrayList1.addAll(arrList1)
        List<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(100, 99, 98));
        System.out.println("numbers2: " + numbers2);
        numbers.addAll(numbers2);  // 실제 numbers가 변경됨
        System.out.println("numbers: " + numbers);
        System.out.println("numbers2: " + numbers2);

        // 7) 요소의 위치 찾기 indexOf(value): 리턴값은 value에 대한 index 번호
        System.out.println(numbers.indexOf(10)); // 0
        System.out.println(numbers.indexOf((100))); // 6
        System.out.println(numbers.indexOf(11)); // 요소가 없을때 -1
        
        // 8) 요소 삭제 .remove(index 번호) // 해당 인덱스에 대해 지움
        System.out.println("삭제 전: " + numbers); //[10, 7, 77, 30, 40, 50, 100, 99, 98]
        numbers.remove(2); // 2번 index의 요소 삭제
        System.out.println("삭제 후: " + numbers); // 77이 삭제됨 [10, 7, 30, 40, 50, 100, 99, 98]


        // 9) 리스트의 크기 확인
        //System.out.println(numbers.length); // length는 사용하면 안됌
        System.out.println("numbers ArrayList의 크기: " + numbers.size()); // 8


        // 10) 모든 요소 출력: for~ each 문 사용해서 (numbers)
        for(Integer n: numbers){
            System.out.print(n + " ");
        } // 10 7 30 40 50 100 99 98
        System.out.println();

        for(int n: numbers){
            System.out.print(n + " ");
        } // 10 7 30 40 50 100 99 98
        System.out.println();

        // 11)  모든 요소 삭제 clear()
        numbers.clear();
        System.out.println("after clear: " + numbers);

        // 12) Student 타입의 arraylist 생성
        List<Student> students = new ArrayList<>();
        Student std1 = new Student("aaa", 10); // 인스턴스 생성
        students.add(std1);


    }//main
}//class

class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // getter: 인스턴스의 속성값 가져오기
    public String getName(){
        return  name;
    }
    public int getAge(){
        return age;
    }


    // setter: 인스턴스의 속성값 설정
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // toString() 메소드
    @Override
    public String toString(){
        return "Student { name: " + name + "age: " + age + "}";
    }

}//class Student