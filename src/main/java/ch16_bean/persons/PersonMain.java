package ch16_bean.persons;

public class PersonMain {
    public static void main(String[] args) {
        // final 때문에 name 필드가 필수적인 argument가 되었다
        Person person1 = new Person("김일", 20);
        Person person2 = new Person("김이");

        person2.setAge(20);

        System.out.println(person1);
        System.out.println(person2);

        PersonLombok person3 = new PersonLombok("김삼");
        PersonLombok person4 = new PersonLombok("김사", 20);

        person3.setAge(17);

        System.out.println(person3);
        System.out.println(person4);
        
        // person1,2와 person3,4를 출력해봤을 때 내용이 다르게 나온다
        /*
            Person{name='김일', age=20}
            Person{name='김이', age=20}
            PersonLombok(name=김삼, age=17)
            PersonLombok(name=김사, age=20)
         */
        // -> intellij(혹은 Java)와 Lombok의 toString() 재정의 default 방식의 차이가 있을 것이다.

//        PersonLombok person5 = new PersonLombok();  // name 필드의 @NonNull 때문에 오류 발생한다
        
        // PersonLombok의 toString() 메서드를 수정하여
        // 이름 : 
        // 나이 : 
        // 출력하기


    }
}
