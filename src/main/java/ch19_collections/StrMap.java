package ch19_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap = new HashMap<>();

        // Map에 Key-Value 쌍 삽입 .put(키, 값);
        strMap.put("kor2025001", "강수림");
        strMap.put("kor2025002", "강수림");
        strMap.put("kor2025003", "김미진");
        strMap.put("kor2025004", "김준식");
        strMap.put("kor2025005", "문성진");
        strMap.put("kor2025006", "심민호");
        strMap.put("kor2025007", "양지은");
        strMap.put("kor2025008", "유지현");
        strMap.put("kor2025009", "윤현지");
        strMap.put("kor2025010", "이동규");
        strMap.put("kor2025011", "이예성");
        strMap.put("kor2025012", "이정화");
        strMap.put("kor2025013", "전용남");
        strMap.put("kor2025014", "채수원");
        strMap.put("kor2025015", "한영진");
        strMap.put("kor2025015", "jake");

        System.out.println(strMap);
        // Map 특징 : 하나의 key에는 하나의 value만 존재, value는 같은 것이 있을 수 있다.
        // key가 겹친다면 가장 최근 value로 덮어써짐
        
        // 특정 키의 값 조회
        System.out.println(strMap.get("kor2025001"));   // 강수림 출력 -> value만 출력됨

        // 특정 키의 값 수정 #1 put
        strMap.put("kor2025001", "김일");
        System.out.println(strMap.get("kor2025001"));

        // #2 replace()
        strMap.replace("kor2025002", "김이");
        System.out.println(strMap.get("kor2025002"));

        // 특정 키의 존재 여부 containsKey
        boolean searchKeyFlag = strMap.containsKey("kor2025123");
        System.out.println("kor2025123 존재 여부 : " + searchKeyFlag);

        // 특정 값의 존재 여부 containsValue
        boolean searchValueFlag = strMap.containsValue("김이");
        System.out.println("김이 존재 여부 : " + searchValueFlag);

        // Map의 엔트리로 Set 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();    // 비어있는 Set 생성
        Set<Map.Entry<String, String>> entrySet2 = strMap.entrySet();

        System.out.println(entrySet1);
        System.out.println(entrySet2);
        // [kor2025008=유지현, kor2025007=양지은, kor2025009=윤현지, kor2025004=김준식, kor2025015=jake, kor2025003=김미진,
        // kor2025014=채수원, kor2025006=심민호, kor2025005=문성진, kor2025011=이예성, kor2025010=이동규, kor2025002=김이, 
        // kor2025013=전용남, kor2025001=김일, kor2025012=이정화]
        // , 를 기준으로 element 구분
        // `key=value`가 하나의 set element가 된다는 점 확인
        
        List<Map.Entry<String, String>> entryList = new ArrayList<>();  // 비어있는 List 생성
        entryList.addAll(entrySet2);    // 바로 Map -> List는 불가능, Set을 경유해야함
        System.out.println(entryList);

        // Key Set 출력 -> strMap 제네릭의 첫번째 매개변수인 key에 해당하는 자료형을 넣어야 함
        Set<String> kerSet = strMap.keySet();
        System.out.println(kerSet);

        // value Set 출력 -> strMap 제네릭의 두 번째 매개변수인 value에 해당하는 자료형을 넣어햐 함
        Collection<String> values = strMap.values();
        System.out.println(values);
        // key는 중복이 불가능해서 Set
        // value는 중복이 가능해서 Set을 쓰면 중복 제거로 인해
        // 키와 값의 개수가 달라질 위험이 있어 Collection을 사용함
    }
}
