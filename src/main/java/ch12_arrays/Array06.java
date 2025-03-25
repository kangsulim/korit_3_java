package ch12_arrays;

public class Array06 {
    // 총합
    private int calcSum(int[] scores) {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        return sum;
    }

    // 평균
    private double calcAvg(int[] scores) {
        double avg = 0;
        avg = (double) calcSum(scores) / scores.length;

        return avg;
    }

    // 등급
    private void countGrade(int[] scores) {

        // #1
        int cntA = 0, cntB = 0, cntC = 0,
            cntD = 0, cntF = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                cntA++;
            } else if (scores[i] >= 80) {
                cntB++;
            } else if (scores[i] >= 70) {
                cntC++;
            } else if (scores[i] >= 60) {
                cntD++;
            } else {
                cntF++;
            }
        }

        System.out.println("A 학생 수 : " + cntA);
        System.out.println("B 학생 수 : " + cntB);
        System.out.println("C 학생 수 : " + cntC);
        System.out.println("D 학생 수 : " + cntD);
        System.out.println("F 학생 수 : " + cntF);

//        //#2
//        int[] grades = {0,0,0,0,0};
//
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] >= 90) {
//                grades[0]++;
//            } else if (scores[i] >= 80) {
//                grades[1]++;
//            } else if (scores[i] >= 70) {
//                grades[2]++;
//            } else if (scores[i] >= 60) {
//                grades[3]++;
//            } else {
//                grades[4]++;
//            }
//        }
//
//        System.out.println("A 학생 수 : " + grades[0]);
//        System.out.println("B 학생 수 : " + grades[1]);
//        System.out.println("C 학생 수 : " + grades[2]);
//        System.out.println("D 학생 수 : " + grades[3]);
//        System.out.println("F 학생 수 : " + grades[4]);
    }

    public void printTotalInfo(int[] scores) {
        // 전부 다 보여줘
        int sum = calcSum(scores);
        double avg = calcAvg(scores);

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

        countGrade(scores);
    }


    public static void main(String[] args) {
        // Array06 클래스 호출
        Array06 array06 = new Array06();
        // 점수 데이터
        int[] scores = {100, 97, 55, 24, 49, 60, 20, 77, 89};
        int sum = 0;
        double avg = 0;

//        sum = array06.calcSum(scores);
//        avg = array06.calcAvg(scores);
//
//        System.out.println("총합 : " + sum + "점");
//        System.out.println("평균 : " + avg + "점");
//
//        array06.countGrade(scores);

        array06.printTotalInfo(scores);
    }
}
