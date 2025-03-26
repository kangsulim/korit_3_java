package ch14_abstraction.abstract_class;

public class PhoneFactory extends Factory {

    // 생성자 및 메서드
    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생성합니다." );
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
