package ch17_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder()
                .name("강수림")
                .age(26)
                .address("부산 진구")
                .build();

        System.out.println(person1);
        
        person1.setName("김이");
        person1.setAge(19);
        person1.setAddress("부산광역시 부산진구");

        System.out.println(person1);

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();
        person2.setAge(89);
        person2.setAddress("경상남도 양산시");

        System.out.println(person2);

        PersonLombok person3 = PersonLombok.builder()
                .name("김삼")
                .age(21)
                .build();

        person3.setAddress("광주광역시 북구");

        System.out.println(person3);

        PersonLombok person4 = PersonLombok.builder()
                .name("김사")
                .age(39)
                .address("서울특별시 마포구로")
                .build();

        System.out.println(person4);
    }
}
