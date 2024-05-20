package _05_class.f_abstract;

public class Square extends Shape{
    private String type; // 필드 / 정사각형, 직사격형, 마름모,.. 사각형의 종류

    public Square(String type, String color){
        super(color);
    // type의 setter를 통해서 type 값 초기화
        this.type = type;
    }

    @Override
    void draw(){
        System.out.println(type + "그리기!");
    }

    // type getter, setter
    public String getType(){
        return type;
    }

    public void setType(){
        this.type = type;
    }

    // square 만의 추가 메소드 생성
    void showType(){
        System.out.printf("사각형의 종류는 %s 입니다! %n", type);
    }

}//class
