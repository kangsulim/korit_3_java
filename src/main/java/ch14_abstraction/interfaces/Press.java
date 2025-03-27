package ch14_abstraction.interfaces;

public interface Press {
//    String name; <- 에러 발생 : 반드시 값을 입력해줘야 함
    String NAME = "button";
    // interface 이기 때문에 변수 앞에 접근 지정자를 명시하지 않았지만
    /*
        public final 이 적용되었습니다. 또한 상수이기 때문에
        대문자로 작성하는 것을 관례적으로 용인합니다.
        일반 클래스의 경우처럼 String name;이 불가
        -> 필수적으로 초기화

        그래서 아래의 예시는 작성 시 오류가 발생합니다

        String name;
        public Press();
        void pipOut(){
            System.out.println("일반 메서드는 안 됨");
        }
     */

    // 작성 가능한 것
    void onPressed();

    // interface 인 Up.java / Down.java 생성
    // void 형채인 onUp() / onDown() 메서드
}

