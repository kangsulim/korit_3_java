package ch16_bean.persons;

public class Person {
    //필드 선언 + final 사용
    private final String name;
    private int age;

    // 초기화 하지 않은 final 변수를 사용하려면 모든 생성자에서 final 변수가 포함되어야 한다.
    
    // 필수적인 필드를 포함한 RequiredArgsConstructor 생성
    public Person(String name) {
        this.name = name;
    }

    // AllArgsConstructor 생성
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter / setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // toString()
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
