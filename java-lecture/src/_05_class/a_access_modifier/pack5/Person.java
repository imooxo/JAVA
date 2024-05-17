package _05_class.a_access_modifier.pack5;

public class Person {
    //  1. 필드: age, name [private]
    private int age;
    private String name;

    //  2. 생성자: (int age, String name) [public]
    public Person(int age, String name){
        //생성될때 어떤걸 하고 싶은지? 작성
        this.age = age; // 파라미터로 들어오는 age 초기화 작업
        this.name = name;
    }

    //  3. 모든 필드에 대한 getter, setter [public]
    //  name에 대한 getter와 setter
    //  name getter
    public String getName(){
        return this.name;
    }
    // name setter
    public  void setName(String name){
        this.name = name;
    }
    // age getter와 setter
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        // 필드에 직접 접근하면 이런 예외처리는 불가능!!
        if(age < 0 ) {
            this.age = 0;
            return;
        }else{
            this.age= age;
        }
    }

}//class
