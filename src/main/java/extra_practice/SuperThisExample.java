package extra_practice;

// 부모 클래스 (Person)
class Person {
    String name;
    int age;

    // 기본 생성자
    Person() {
        this("알 수 없음", 0); // this() 사용: 같은 클래스의 다른 생성자 호출
        System.out.println("Person의 기본 생성자 호출!");
    }

    // 매개변수가 있는 생성자
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person의 매개변수 생성자 호출! -> " + name + ", " + age);
    }
}

// 자식 클래스 (Student)
class Student extends Person {
    String univ;

    // 기본 생성자
    Student() {
        this("무명", 0, "미정");  // this() 사용: 같은 클래스의 다른 생성자 호출
        System.out.println("Student의 기본 생성자 호출!");
    }

    // 매개변수가 있는 생성자
    Student(String name, int age, String univ) {
        super(name, age); // super() 사용: 부모 클래스의 매개변수 생성자 호출
        this.univ = univ;
        System.out.println("Student의 매개변수 생성자 호출! -> " + univ);
    }
}

// 실행 클래스
public class SuperThisExample {
    public static void main(String[] args) {
        System.out.println("=== 기본 생성자로 Student 객체 생성 ===");
        Student student1 = new Student();

        System.out.println("\n=== 매개변수 생성자로 Student 객체 생성 ===");
        Student student2 = new Student("수림", 16, "부산대학교");
    }
}
