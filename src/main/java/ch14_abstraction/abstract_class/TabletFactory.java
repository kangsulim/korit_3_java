package ch14_abstraction.abstract_class;
/*
    1. Factory 상속
    2. TabletFactory 의 고유 메서드인 upgrade(String model) 메서드를 call2() 유형으로 작성
        Main 에서 실행 ("아이패트 프로 13인치 8세대" 로)
    3. Main 에서
        tabletfactory1 객체
        애플 태블릿 공장
    4. 구글 태블릿 공장으로 수정
        현재 공장은 구글 태블릿 공장으로 변경되었습니다. <- 출력하기
    5. 객체명.produce("구글 태블릿") 호출
    6. 객체명.manage() 호출
    7. 객체명.upgrade("구글 태블릿 10인치 2세대") 호출

 */
public class TabletFactory extends Factory {
    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 태블릿을 생성합니다." );
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }

    public void upgrade(String model) {
        System.out.println(model + "(으)로 업그레이드 합니다.");
    }
}
