package ch07_loops;
/*
     while 반복문
     형식 :
     while(조건식) {
        코드
     }

     조건식이 참인 동안 {} 내부의 코드를 계속 실행한다.

     주의, while 내부에 있는 조건식이 특정 시점에 false가 되도록 미리 지정할 필요가 있다.

     false가 되는 시점을 지정하지 않는다면 무한히 실행됨 -> 무한 루프
 */

public class Loop01 {
    public static void main(String[] args) {
//        int i = 1;
//
//        while (i < 101) {
//            System.out.println(i);
//            i++;
//        }

        int sum = 0;
        int i = 0;

        while (i < 10) {

            sum += i + 1;
            i++;
        }
        System.out.println(sum);

        int sumOdd = 0;
        int sumEven = 0;
        int sumTotal = 0;
        i = 0;

        while (i < 101) {
            if( i % 2 == 1 ) {
                sumOdd += i;
//                System.out.println(sumOdd);
            } else {
                sumEven += i;
//                System.out.println(sumEven);
            }

            sumTotal += i;

            i++;
        }

        System.out.println(sumOdd);
        System.out.println(sumEven);
        System.out.println(sumTotal);
    }
}
