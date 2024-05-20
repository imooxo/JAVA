package _05_class.h_practice;

public class Animal {
    public String name;
    public String type;
    public int age;

    public void makeSound(){
        System.out.println("동물은 소리를 낸다.");
    }

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}//class
