package _05_class.a_access_modifier.pack1;

public class B {
    // A 클래스와 같은 pack1에 있음
    public static void main(String[] args) {
        A instanceA = new A();
        instanceA.printA(); // pack1's A class

    }//main
}//class
