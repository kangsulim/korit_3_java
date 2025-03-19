package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
                                                //  this.age = 0 | age = 0
                                                //  this.age = -10 | age = -10
        Person person1 = new Person(-10);   // 값은 들어가지 않았지만 객체는 생성됨
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
//        person1.name = "강수림";
//        System.out.println(person1.name);
//        System.out.println(person1.age);
//
//        person1.age = 10; // private 적용 후에 오류 발생

        // 메서드 호출

        person1.setName("안근수");
        person1.setAge(38);             // this.age = -10 | age = 38

        System.out.println();           // age는 person1 객체의 값, this.age는 getAge() 메서드의 값+

        System.out.println(person1.getName());
        System.out.println();
        
        person1.setName("레오나르도디카프리오");
        person1.setName("강수림");
        
    }
}
