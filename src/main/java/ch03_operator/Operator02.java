package ch03_operator;
/*
    논리 연산자

    true(1) / false(0)
    boolean : true / false

    AND(&&) : 곱 연산자
    OR(||) : 합 연산자
    NOT(!) : 값을 역전시키는 연산자 (true <-> false)
 */
public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        System.out.println("--- && 연산자 ---");

        boolean result1 = flag1 && flag1;
        System.out.println(result1);        // true

        boolean result2 = flag1 && flag2;
        System.out.println(result2);        // false

        boolean result3 = flag2 && flag2;
        System.out.println(result3);        // false

        System.out.println("--- || 연산자 ---");

        boolean result4 = flag1 || flag1;
        System.out.println(result4);        // true
        boolean result5 = flag1 || flag2;
        System.out.println(result5);        // true
        boolean result6 = flag2 || flag2;
        System.out.println(result6);        // false

        System.out.println();

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println(result7);

        boolean result8 = 10 % 3 == 0;
        System.out.println(result8);        // 조건식
    }
}
