package ch17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
//        Person person1 = new Person("강수림", 26, "부산 진구");
        
        // 빌더 적용
        Person person1 = new Person.Builder()
                .name("강수림")
                .age(26)
                .address("부산 진구")
                .build();

        System.out.println(person1);
    }
}
