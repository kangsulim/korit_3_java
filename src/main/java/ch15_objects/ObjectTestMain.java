package ch15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        String strExample1 = "강수림";
        String strExample2 = new String("강수림");

        boolean result1 = strExample1 == strExample2;   // 주소 비교
        System.out.println(result1);    // false : 주소가 달라서

        boolean result2 = strExample1.equals(strExample2);  // 값 비교
        System.out.println(result2);    // true : 값이 같아서
        System.out.println();

        // allArgsConstructor
        ObjectTset objectTset = new ObjectTset("강수림", "부산 진구");

        objectTset.displayInfo();
        System.out.println();

        // 기본 생성자
        ObjectTset objectTset2 = new ObjectTset();

        objectTset2.setName("강수림");
        objectTset2.setAddress("부산 진구");

        System.out.println(objectTset2.displayInfo2());
        System.out.println();

        System.out.println(objectTset2);
        System.out.println();

        Teacher teacher1 = new Teacher("강", "고등학교");

        System.out.println(teacher1);
    }
}
