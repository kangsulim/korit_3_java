package ch07_loops;

public class Loop03 {
    public static void main(String[] args) {
        int i = 0;

        // #1 10의 자리수, 1의 자리수로 루프
        while (i < 10) {
            int j = 0;
            while (j < 10) {
                System.out.print("" + (i * 10 + j + 1) + "\t");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        // #2 10번 출력할 때 마다 개행
        i = 1;

        while (i < 100) {
            int j = 0;
            while (j < 10){
                System.out.print("" + i + "\t");
                j++;
                i++;
            }
            System.out.println();
        }
        System.out.println();

        // #3 10번 출력할 때 마다 개행
        i = 1;
        while (i < 101){
            System.out.print("" + i + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
