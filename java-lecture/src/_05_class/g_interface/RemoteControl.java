package _05_class.g_interface;

public interface RemoteControl {
    // interface는 추상 메소들르 포함해야 한다.

    // interface에서 추상 메소드 선언시 abstract 키워드 생략해되된다.
    // (추상 클래스에서는 생략 불가)
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    // 상수 필드
    // java 인터페이스에 선언된 필드는 기본적으로 [static final] 특성을 가진다.
    // 상수 외의 필드 선언 불가
    int MAX_VOLUME = 10; // static final을 붙이지 않아도 컴파일러가 자동으로 추가함

    static final int MIN_VALUE = 10;

    
}//interface
