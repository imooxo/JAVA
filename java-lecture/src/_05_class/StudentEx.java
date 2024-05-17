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
    }//main
}//class
