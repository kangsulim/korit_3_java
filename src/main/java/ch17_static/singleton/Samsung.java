package ch17_static.singleton;

import lombok.Getter;
public class Samsung {
    // 정적 변수
    private static Samsung instance;    // 최초로 생성된 Samsung 클래스의 객체를 대입할 정적 변수
    // 멤버 변수
    @Getter
    private String company;
    private int serialNumber;

    private Samsung() {
        company = getClass().getSimpleName();
        serialNumber = 20250000;
    }

    public static Samsung getInstance() {
        if (instance == null) {         // 최초의 호출 시에만 새로운 객체를 생성하도록 하는 조건문
            instance = new Samsung();
        }
        return instance;    // 결국 항상 같은 객체를 리턴함
    }

    // 시리얼 넘버를 또 하나의 메서드로 만들어서 관리함
    public String creatrSerialNumber(String model) {    
        return model + "_" + ++serialNumber;
    }
}