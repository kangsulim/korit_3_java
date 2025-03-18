package ch06_condition;
/*
    삼항 연산자
        정의 : 조건식을 평가하여 boolean 값을 반환함

       형식 :
       조건식 ? 표현식1 : 표현식2

       조건식 : 참/거짓 판별 가능
       표현식1 : 참일 때 실행
       표현식2 : 거짓일 때 실행
 */
public class Condition09 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int max = (a>b) ? a : b;

        System.out.println("더 큰 숫자는 " + max + "입니다.");

        int max2;

        if (a > b) {
            max2 = a;
        } else {
            max2 = b;
        }

        System.out.println("더 큰 숫자는 " + max2 + "입니다.");
    }
}
