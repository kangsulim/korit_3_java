package ch18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
@AllArgsConstructor
public class AnimalData<T> {
    private T animal;

    // AnimalData 필드인 animal에 Animal 클래스의 상속을 받은
    // Tiger / Human 객체를 필드에 대입

    // 특정 클래스라면 (Animal 상속받은) 객체 정보 출력
    public void printData() {
        ((Animal)animal).move();

        if (animal.getClass() == Human.class) {
            System.out.println(animal.getClass());
            ((Human)animal).read(); // 현재 필드인 animal의 클래스를 조사하여
            // (.getClass()를 통해) 그것이 Human 클래스라면 Human 고유 메서드 실행
        } else if (animal.getClass() == Tiger.class) {
            System.out.println(animal.getClass());
            ((Tiger)animal).hunt();
        } else {

        }
    }
}
