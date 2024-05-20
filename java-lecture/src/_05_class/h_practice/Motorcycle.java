package _05_class.h_practice;

public class Motorcycle extends Vehicle{
    private String licenseType;

    public Motorcycle(String brand, String model, int year, String licenseType) {
        super(brand, model, year);
        this.licenseType = licenseType;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public void makeNoise(){
        System.out.println("울림통을 합니다.");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "licenseType='" + licenseType + '\'' +
                '}';
    }
}//class
