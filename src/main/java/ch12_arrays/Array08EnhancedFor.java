package ch12_arrays;
/*
    향상된 for 문

    일반 for 문과의 차이점 :
        일반 for 문의 경우 인덱스 넘버(주소지)를 명확하게 알고 있어야 하지만
        일일이 element 의 숫자를 세는 것이 번거롭기 때문에
        arr01.length 와 같은 방식으로 int 값을 추출해서 대입했습니다.

        그런데 잘 생각해보면 for (int i = 0; ...)을 할 때의 int i는
        for 문 내부에서 선언됩니다.

        이를 응용하여 배열 내의 element 를 변수게 대입하는 방식으로
        인덱스 넘버(주소지)의 사용 없이 동작하는 for 문이 있는데,
        이를 향상된 for 문이라고 합니다.

    제약 :
        읽기만 되고 쓰기가 안 됨.

    형식 :
       for (자료형 변수명 : 반복가능객체(배열) ) {
            코드
       }
 */

public class Array08EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = new int[200];

        // 1~200 대입
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // 일반 for 문 형태로 1~200 출력하기
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 향상된 for 문 형태로 1~200 출력하기
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 향상된 for 문으로 String 배열 출력하기
        String[] names =
                {"강수림", "기준성", "김미진", "김준식", "문성진",
                "심민호", "양지은", "유지현", "윤현지", "이동규",
                "이예성", "이정화", "전남용", "채수원", "한영진"};

        for (String name : names) {
            System.out.print(name + " ");
        }


    }
}
