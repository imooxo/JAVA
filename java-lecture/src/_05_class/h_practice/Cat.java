package _05_class.h_practice;

public class Cat extends Animal{
    public Cat(String name, String type, int age){
        super(name, type, age);
    }

    @Override
    public void makeSound(){
        System.out.println("미야옹");
    }

}//class
