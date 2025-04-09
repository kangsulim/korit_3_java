package ch19_collections.collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSet {
    public static void main(String[] args) {
        // 선언
        Set<String> set = new HashSet<>();

        // 갑 넣기
        set.add("Java");
        set.add("Python");
        set.add("Java");   // 중복은 무시됨

        // 값 삭제하기
        set.remove("Python");

        // 값 수정하기
        if (set.contains("Java")) {
            set.remove("Java");
            set.add("JavaScript");
        }

        // 값 확인하기
        boolean exists = set.contains("Java");

        System.out.println(exists);
    }
}
