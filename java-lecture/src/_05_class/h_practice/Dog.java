package _05_class.h_practice;

public class Dog extends Animal {
    public Dog(String name, String type, int age){
        super(name, type, age);
    }
    
    @Override
    public void makeSound(){
        System.out.println("멍멍왈왈");
    }
}//class
