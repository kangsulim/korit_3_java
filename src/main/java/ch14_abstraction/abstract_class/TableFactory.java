package ch14_abstraction.abstract_class;

public class TableFactory extends Factory {
    public TableFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생성합니다." );
    }

    @Override
    public void manage() {
        System.out.println("가구 공장을 관리합니다.");
    }
}
