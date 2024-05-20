package _05_class.h_practice;

public class Car extends Vehicle{
    private boolean convertible;

    public Car(String brand, String model, int year, boolean convertible) {
        super(brand, model, year);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void parking(){
        System.out.println("주차했습니다.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "convertible=" + convertible +
                '}';
    }
}//class
