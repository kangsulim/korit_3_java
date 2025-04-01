package ch17_static.builders;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;
    private String address;

    // 생성자를 일일이 정의하는 것은 코드 낭비,
    // 그래서 나온 것이 빌더 패턴이다!!!

    private Person(Builder builder) {   // argument 대입이 아니라
        // builder 객체의 속성을 그대로 Person 생 성자에 대입하여
        // Person 객체를 생성하겠다는 뜻!
        // private 접근지정자가 있기 때문에 builder 를 통해서만 객체 생성 가능
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }
    // 객체를 생성하는 main 단계에서
    // 일반 생성자가 아니라 Builder 를 통해 Person 객체를 생성하기 위해 static.
    // 그리고 public
    public static class Builder {
        private String name;
        private int age;
        private String address;

        // 아래 코드는 method
        // 대부분의 경우 method는 동사로 이름짓는 반면
        // Builder pattern은 대입될 필드의 이름과 동일한 메서드명으로 작성한다.
        // 즉, Builder.name("강수림"); 와 같은 식으로 작성되며,
        // 이 Person 객체는 name에 "강수림"이라는 속성값을 갖게 된다
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        // Builder.name("강수림").age(26); <- 이거 하려고 Builder Pattern 쓰는 거!!(체이닝 메서드)
        // 필드명과 속성값이 `나란히 입력되`는 점에서 가독성이 높다
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        // 여기까지는 필드에 속성을 집어넣는 메서드

        public Person build() {
            return new Person(this);
        }
    }
}
