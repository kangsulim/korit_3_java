package ch07_loops;
/*
    중첩 while문
    while(){
        while(){

        }
    }
 */
public class Loop02 {
    public static void main(String[] args) {
//        int day = 1;
//
//        // 1일차 1교시입니다. ~ 1일차 3교시입니다. / 5일차 3교시입니다.
//
//        while (day <6) {
//            int lesson = 1;
//            while (lesson < 4){
//                System.out.println(day + "일차 " + lesson + "교시입니다.");
//                lesson++;
//            }
//            day++;
//        }

        int num = 1;
        int dan2 = 2;


        while (dan2 < 10) {
            System.out.print(dan2 + "단\t\t\t");
            dan2++;
        }
        System.out.println();

        while (num < 10) {
            int dan = 2;



            while (dan < 10) {

                System.out.print(dan + " X " + num + " = " + (dan * num) + "\t");
                dan ++;
            }
            System.out.println();
            num++;
        }
    }
}
