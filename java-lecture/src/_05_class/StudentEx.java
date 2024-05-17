package _05_class;
// Student 클래스 사용
public class StudentEx {
    public static void main(String[] args) {
        Student s1 = new Student("jade", 1);
        /* JavaScript 라면?
            s1 = {
                name: "jade",
                grade: 1,
                ... 하위 메소드들
              }
         */
        System.out.println(s1); // _05_class.Student@2f4d3709 
        // 재정의 Student {name = "jade", grade=1}
        System.out.println(s1.toString()); // _05_class.Student@2f4d3709 
        // 재정의 Student {name = "jade", grade=1}

        // 반환값 없이 출력만 해주는 메소드
        s1.goToSchool();  // 학교에 갑니다.
        s1.study("Java"); // Java공부중..

        // 반환값 있는 메소드
        System.out.println(s1.getGrade()); // 1
        System.out.println(s1.getTestResult(100)); // jade학생의 점수는: 100


        // 다른 인스턴스 만들기
        Student s2 = new Student("Tom",2);
        System.out.println(s2);
        System.out.println("s2 인스턴스의 이름" + s2.name); // s2 인스턴스의 이름Tom
        System.out.println("s2 인스턴스의 학년" + s2.grade); // s2 인스턴스의 학년2

    }//main
}//class
