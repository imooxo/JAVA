package _05_class.f_abstract;

public class Circle extends Shape{

    public Circle(String color){
        super(color);
    }

    @Override
    void draw(){
        System.out.println("원 그리기");
    }
}//class
