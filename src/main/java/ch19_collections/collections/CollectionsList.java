package ch19_collections.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {
        // 선언
        List<String> list = new ArrayList<>();

        // 갑 넣기
        list.add("Java");
        list.add("Python");
        list.add("C++");   // 순서대로 들어감 (인덱스 유지)

        // 값 삭제하기
        list.remove("Python");     // 값으로 삭제
        list.remove(1);

        // 값 수정하기
        list.set(0, "JavaScript"); // 0번째 요소를 수정

        // 값 확인하기
        String value = list.get(0);    // 인덱스로 접근
        boolean exists = list.contains("Java"); // 포함 여부 확인

        System.out.println(value);
        System.out.println(exists);

    }
}
