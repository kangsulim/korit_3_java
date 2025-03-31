package ch17_static.singleton;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class Factory {
    // 필드 선언
    private String factoryName;

    // 메서드 정의
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");
        String model = "갤럭시S26"; // SmartPhone 필드에 대입

        String serial;
        Samsung samsung = Samsung.getInstance(); // 클래스명.메서드명()으로 사용 가능한 싱글톤 패턴 사용
        // 사실상 처음으로 객체 생성할 때는 Samsung samsung = new Samsung();이 실행되는 것이고
        // 이후에 새로 객체를 생성하려고 할 때에는 이 때 생성된 samsung 이라는 객체를 계속 사용하는 것이다.

        samsung =samsung; // <- 이것이 아무 문제 없는 것을 보아 가능한 말임을 확인
        // 실제 결과에도 아무런 차이가 없음.
        /*
            1공장에서 스마트폰을 생산합니다.
            SmartPhone(company=Samsung, model=갤럭시S26, serial=갤럭시S26_20250001)
            2공장에서 스마트폰을 생산합니다.
            SmartPhone(company=Samsung, model=갤럭시S26, serial=갤럭시S26_20250002)
            3공장에서 스마트폰을 생산합니다.
            SmartPhone(company=Samsung, model=갤럭시S26, serial=갤럭시S26_20250003)
            4공장에서 스마트폰을 생산합니다.
            SmartPhone(company=Samsung, model=갤럭시S26, serial=갤럭시S26_20250004)
         */

        serial = samsung.creatrSerialNumber(model);

        // SmartPhone 객체 생성
        // samsung.getCompany()의 사용이 가능한 이유는
        // Samsung.java 에서 private String company 위에 @Getter 애너테이션을 사용했기 때문!!!
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);

        return smartPhone;
    }
}
