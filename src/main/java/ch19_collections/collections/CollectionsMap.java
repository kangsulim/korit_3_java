package ch19_collections.collections;


import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {
    public static void main(String[] args) {
        // 선언
        Map<String, String> map = new HashMap<>();

        // 갑 넣기
        map.put("kor2025001", "강수림");
        map.put("kor2025002", "김미진");

        // 값 삭제하기
        map.remove("kor2025001");  // key로 삭제

        // 값 수정하기
        map.put("kor2025002", "이정화");  // 기존 key에 덮어쓰기
        map.replace("kor2025002", "박하늘"); // replace도 가능

        // 값 확인하기
        String value = map.get("kor2025002");   // key로 조회
        boolean hasKey = map.containsKey("kor2025001");
        boolean hasValue = map.containsValue("강수림");

        System.out.println(value);
        System.out.println(hasKey);
        System.out.println(hasValue);
    }
}
