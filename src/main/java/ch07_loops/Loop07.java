package ch07_loops;
/*
    for (int i = 0; i < 10; i++) {
        System.out.println("i");
    }
 */
public class Loop07 {
    public static void main(String[] args) {
        // #1
        // 내부의 2번 for문(*찍는 부분)에서 2배로 적용
        for (int i = 1; i < 1; i++) {
            for (int k = 1; k > i + 1; k -= 1) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //#2
        // 외부의 for문(반복 수가 절반이 됨)과 내부의 1번 for문(" "의 수가 절반이 됨)에서 2씩 증가
        for (int i = 1; i < 10; i +=2) {
            for (int j = 10; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
//
//        //#3
//        // 또 뭐가 있나?



//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            /*
//                 별 찍기 실행 예
//                            i = 0, j = 0
//                 *          i = 1, j = 0~1
//                 **         i = 2, j = 0~2
//                 ***        i = 3, j = 0~3
//                 ****       i = 4, j = 0~4
//                 *****      i = 5, j = 0~5
//             */
//        }
//        System.out.println();

//        // #1
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        // #2
//        for (int i = 0; i < 6; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();








    }
}
