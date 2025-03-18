package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        /*
            형변환

            1) upcasting : 더 큰 용량의 자료형으로 변환시키는 것
         */

        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅 방법 #1
        // 형변환을 하기 위해서는 '(바꿀데이터타입)변수명'으로 작성
        System.out.println("변형 : " + (int)cast1);

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);
        System.out.println();
        
        // 업캐스팅 방법 #2
        char cast3 = 'b';
        // 새로운 변수를 선언하여 대입
        int casr4 = cast3;

        // 2) downcasting : 더 적은 용량의 자료형으로 변환시키는 것
        int cast5 = 99;
        int cast6 = 100;
        // 지시 사항 : 다운캐스팅 하는 방법을 업캐스팅 방법 1,2를 사용하여 char로 바꾸기

        System.out.println("변형 : " + (char)cast5);
        char cast7 = (char)cast6;
        System.out.println("변형 : " + cast7);

        /*
            upcasting의 경우에는 암시적(implicit) 형변환
            sowncasting의 경우에는 명시적(explicit) 형변환
         */
    }
}
