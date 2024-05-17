package _05_class;
// 패키지란? 여러 클래스를 가지고 있는 디렉토리
// 클래스를 유일하게 만들어주는 식별자
public class Student {
    // 1. 클래스의 필드(변수)
    public String name;
    public int grade;

    // 2. 클래스의 메소드
    // 2-1. 클래스의 생성자
    public Student(String name, int g){ // 인자를 받아줄 수 있고 안 받아줘도 ok
        // Student s1 = new Student("jade");
        // 생성자의 인자를 이용해서 클래스의 필드를 초기화 할 수 있음
        this.name = name;  // 클래스의 변수 초기화 / this == 자기 자신

        // this 키워드를 사용하지 않아도 초기화가 가능하지만
        // 의미를 명확하게 하기 위해서 this를 작성하는게 일반적
        grade = g;
    }

    // 2-2. 클래스의 (생성자가 아닌) 메소드
    public void goToSchool(){ //반환값 x, 매개변수 x
        System.out.println("학교에 갑니다.");
    }

    public void study(String subject){ // 반환값x, 매개변수o
        System.out.println(subject + "공부중..");
    }

    public int getGrade(){ // 반환값o, 매개변수x
        return this.grade;
    }

    public  String getTestResult(int score){
        return this.name + "학생의 점수는: " + score;
    }

    @Override
    public String toString(){
       return "Student {name = \"" + name + "\", grade=" + grade + "}"; // 메소드 재정의
    }
}//class
