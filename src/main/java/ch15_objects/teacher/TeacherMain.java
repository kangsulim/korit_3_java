package ch15_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("강수림", "고등학교");
        Teacher teacher2 = new Teacher("강수림", "고등학교");

        boolean result1 = teacher1.equals(teacher2);    // .equals() 속성(내용, 데이터, 주소의 값) 비교
        System.out.println(result1);

        boolean result2 = teacher1 == teacher2;         // == 속성과 주소를 비교 비교
        System.out.println(result2);

        System.out.println(teacher1);

        Class tClass = teacher1.getClass();     // Class 라는 class 가 존재 : class 정보를 보여줄 때 사용
        System.out.println(tClass);
        System.out.println(teacher1.getClass().getSimpleName());
        System.out.println(tClass.getSimpleName());
        System.out.println();

        Field[] fields = tClass.getDeclaredFields();
        System.out.println("선언된 함수");
        System.out.println(Arrays.toString(fields));
        System.out.println();

        for (int i = 0; i < fields.length; i++) {

            System.out.println("필드명 : " + fields[i].getName());
            System.out.println("패키지 + 클래스 명 : " + fields[i].getType());
            System.out.println("클래스명 : " + fields[i].getType().getSimpleName());
            System.out.println();
        }

        // 위 fields 의 element 를 출력하는 반복문을 향상된 for 문으로 작성하기

        for (Field field : fields) {
            System.out.println("필드명 : " + field.getName());
            System.out.println("패키지 + 클래스 명 : " + field.getType());
            System.out.println("클래스명 : " + field.getType().getSimpleName());
            System.out.println();
        }
        System.out.println();

        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println("메서드 명 : " + methods[i].getName());
            System.out.println("리턴 타임 명 : " + methods[i].getReturnType());
        }
        System.out.println();

        // 향상된 for 문
        for (Method method : methods) {
            System.out.println("메서드 명 : " + method.getName());
            System.out.println("리턴 타입 명 : " + method.getReturnType());
        }

        ch15_objects.Teacher teacher3 = new ch15_objects.Teacher("강수림", "고등학교");


//        System.out.println(teacher3 instanceof Teacher);    // 오류 발생
        // teacher3의 경우 다른 경로의 Teacher 클래스의 인스턴스이기 때문에 오류가 발생하는 것






        // String 상에서 new String("안녕하세요")와 "안녕하세요"는 false
        // 그런데 누가 String 을 new String()으로 쓰겠나?

//        String[] strArray = {"안녕하세요", "안녕하세요"};
//        boolean result3 = strArray[0].equals(strArray[1]);
//        System.out.println(result3);    // true
//
//        boolean result4 = strArray[0] == strArray[1];
//        System.out.println(result4);    // true
//
//        String[] strArray2 = {"안녕하세요", "안녕하세요"};
//        boolean result5 = strArray[0].equals(strArray2[0]);
//        System.out.println(result5);    // true
//
//        boolean result6 = strArray[0] == strArray2[1];
//        System.out.println(result6);    // true

    }
}
