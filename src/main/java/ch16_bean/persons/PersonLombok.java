package ch16_bean.persons;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor    // PersonMain에 있는 person3에서 충돌이 발생해서 다시 활성화 함
//@Setter
//@Getter
//@ToString
public class PersonLombok {
//    @NonNull                    // 필드 레벨의 애너테이션
//    private String name;
    private final String name;  // Null 값을 받을 수 없다
    private int age;

    // private final String name을 작성했을 때
    // Lombok을 통해 해결하였다

    // RequiredArgsConstructor는 필드의 final을 감지해서
    // 그 필드가 포함되어 있는 매개별수 생성자를 자동으로 만듭니다.

    // 주석 처리된 애너테이션들의 총합 애너테이션이 @Data이다


    // 내가 원하는 대로 출력하기 위해서, 결국 toString() 메서드를 재정의 해야한다
    @Override
    public String toString() {
        return  "이름 : " + name + '\n' +
                "나이 : " + age;
    }
}
