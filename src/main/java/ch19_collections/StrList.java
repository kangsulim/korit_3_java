package ch19_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        int[] intArray = new int[3];    // 인덱스 넘버 고정시키기

        // 배열에 값 넣기
        intArray[0] = 1;

        // List에 값 넣기 -> 특정 메서드(.add())를 통함
        strList.add("Java");
        strList.add("C");
        strList.add("python");
        strList.add("JavaScript");
        strList.add("Kotlin");

        // 출력
        System.out.println(intArray);   // 배열의 주소값이 출력된다
        System.out.println(Arrays.toString(intArray));
        System.out.println(strList);    // toString()이 정의되어 있다

        // 특정 element 검색 -> contains() 메서드 사용
        String searchElem1 = "python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(searchElem1 + " 포함 여부 : " + contains1);

        String searchElem2 = "py";
        boolean contains2 = strList.contains(searchElem2);  // contains() return 타입 : boolean
        System.out.println(searchElem2 + " 포함 여부 : " + contains2);
        // String 에서의 .contains() 메서드의 경우 "내부 스트링 데이터"에서 한 문자씩
        // 다 걸러서 확인이 가능하지만 List의 경우는 element의 full word를 기준으로 검색한다

//        String email = "a@test.com"; -> String에서의 .contains() 예시
        // boolean result = email.contains("@");
//        System.out.println("@ 포함 여부 : " + result);

        // 특정 element의 삭제 -> remove()
        String removeElem = "Kotlin";
        boolean removed = strList.remove(removeElem);   // remove() return 타입 : boolean
        System.out.println(removeElem + " 삭제 여부 : " + removed);

        // 마찬가지로 .remove()도 element 전체가 일치하는 지 확인하고 삭제하기 때문에
        // element 일부 데이터만 가지고는 전체 요소를 삭제할 수 없다

        String removeElem2 = "py";
        boolean removed2 = strList.remove(removeElem2);
        System.out.println(removed2 + " 삭제 여부 : " + removed2);
        System.out.println(strList);

        // List 정렬 -> Collections.sort(strList)
        Collections.sort(strList);
        System.out.println("정렬된 List : " + strList);

        // 역순 정렬 Collections.reverseOrder()
        Collections.sort(strList, Collections.reverseOrder());
        System.out.println("역순 정렬 List : " + strList);

        // List의 특정 element 출력
        System.out.println(strList.get(0)+ " 언어");

        // 전체 element 출력
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i) + " 언어");
        }
        
        for (String str : strList) {
            System.out.println(str + " 언어");
        }
    }

}
