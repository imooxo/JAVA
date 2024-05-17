package _05_class.c_final;


public class ConstEx {
    public static void main(String[] args) {
        System.out.println(Const.MAX_VALUE); // 100
        System.out.println(Const.GREETING); // Hello, World!
        //Const.MAX_VALUE = 200; // error final이기 때문에 재할당 불가능
        Const.MIN_VALUE = 10;
        System.out.println("MIN_VALUE: " + Const.MIN_VALUE); // MIN_VALUE: 10

        // final 변수 접근
        //System.out.println(Const.name); // err
        // => static이 아니기 때문에 인스턴스 생성 하고 나서 접근 가능
        Const c1 = new Const();
        System.out.println(c1.name);
        //c1.name = "final은 다른 값으로 변경이 안됨";
    }//main
}//class
