package ch12_arrays;

import java.util.Arrays;

/*
    1차 배열을 기준으로
    1~45까지 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 임의의 6개 int 값 대입하기
    단, 중복 허용 X
 */
public class Array15LottoGame {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int round = 5;  // 게임 횟수
        int set = 255;

        for (int k = 0; k < round; k++) {

            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = (int)(Math.random() * 45) + 1;
                if (i > 0) {
                    for (int j = 0; j < i ; j++) {
                        if (lotto[i] == lotto[j])
                            i--;
                    }
                }
            }

            System.out.println("제" + set + "회 LOTTO 추첨을 시작합니다!!!!");

            for (int i = 0; i < lotto.length; i++) {
                for (int j = 0; j < 2; j++) {
                    try {
                        System.out.println("두구두구두구두구");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("오류 오류. 게임을 종료합니다.");
                    }
                }
                System.out.println((i + 1) + "번째 번호는 " + lotto[i] + "입니다.");
            }

            System.out.println("제 255회 LOTTO 당첨 번호");
            Arrays.sort(lotto);
            System.out.println(Arrays.toString(lotto));
            System.out.println("응모해주신 여러분 감사합니다.\n");
            set++;
        }
    }
}
