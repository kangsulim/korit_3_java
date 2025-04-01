package ch19_collections;

import java.util.*;

/*
    List는 순서가 있고 중복을 피하는 반면
    Set의 경우 순서는 없고 중복을 허용하지 않기 때문에
    List -> Set / Set -> List로의 형변환이 중요
    List를 통해 전체 설문을 받고, Set을 통해 중복을 제거하는 등
    또한 Set으로 중복을 제거한 후 .get(index)로 조회도 가능
 */
public class StrSet {
    public static void main(String[] args) {
        // Set 객체
        Set<String> strSet = new HashSet<>();
        // List 객체
        List<String> strList = new ArrayList<>();

        // Set에 Element 삽입 -> .add();
        strSet.add("Java");
        strSet.add("2");
        strSet.add("java");
        strSet.add("3");
        strSet.add("Python");
        strSet.add("2");
        strSet.add("2");
        strSet.add("1");

        System.out.println(strSet); // 순서 보장 X

        // 특정 element의 추출 -> List로의 형변환이 필수적
        strList.addAll(strSet);
        // List로 바꿨으니 element 추출 밑 정렬 가능
        System.out.println("정렬 전");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        System.out.println();

        Collections.sort(strList);

        System.out.println("정렬 후");
        for (String str : strList) {
            System.out.println(str);
        }

        // 그렇다면 다시 strSet으로 옮겨도?

        strSet.addAll(strList);     // 어차피 중복이라 
        System.out.println(strSet); // 결과는 똑같다
    }
}
