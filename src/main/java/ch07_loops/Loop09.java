package ch07_loops;
/*
        *
       **
      ***
     ****
    *****
 */
public class Loop09 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 6; j > i; j --) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 6; i > 0; i--) {
            for (int j = 1; j < i; j ++) {
                System.out.print(" ");
            }
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }







    }
}
