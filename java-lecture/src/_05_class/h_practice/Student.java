package _05_class.h_practice;

public abstract class Student {
    String name;
    String school;
    int age;
    int number;

    public Student(String name, String school, int age, int number) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.number = number;
    }

    abstract void todo();

    void chart() {
        System.out.println("====== " + name + " 학생의 정보 ======");
        System.out.println("학교: " + school);
        System.out.println("나이: " + age);
        System.out.println("학번: " + number);
        todo();
        System.out.println();
    }
}//class

class Kim extends Student {
    public Kim(String name, String school, int age, int number) {
        super(name, school, age, number);
    }

    @Override
    public void todo() {
        System.out.println("점심은 김가네 김밥");
    }
}

class Baek extends Student {
    public Baek(String name, String school, int age, int number) {
        super(name, school, age, number);
    }

    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자");
    }
}
