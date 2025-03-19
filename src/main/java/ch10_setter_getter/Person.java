package ch10_setter_getter;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        if (age <= 0 || age >= 200) {
            System.out.println("불가능한 나이 입력입니다.");
            return;
        }
        this.age = age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Setter의 명칭 : set + 필드명
    // 구조 : call2() 유형

    public void setName(String name) {
        if (name.length() > 4) {
            System.out.println("불가능한 이름 입력입니다.");
            return;
        }
        System.out.println();
        System.out.println("이름이 수정되었습니다.");
        System.out.println("변경 전 이름 : " + this.name);

        this.name = name;

        System.out.println("변경 후 이름 : " + name);
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 200) {
            System.out.println("불가능한 나이 입력입니다.\n");
            return;
        }
        System.out.println("\n나이가 수정되었습니다.");
        System.out.println("변경 전 나이 : " + this.age);

        this.age = age;
        System.out.println("변경 후 나이 : " + age);
    }

    // Getter 명칭 : get + 필드명
    // 구조 : call3
    // 조회만 하기 때문에 매개변수를 필요로 하지 않음
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
