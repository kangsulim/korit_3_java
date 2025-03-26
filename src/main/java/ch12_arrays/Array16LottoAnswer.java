package ch12_arrays;

import java.util.Arrays;

public class Array16LottoAnswer {
    public static void main(String[] args) {
        int round = 5; // 로또 번호 생성 횟수
        int[][] lottoNumbers = new int[round][6]; // 열 크기를 지정하지 않는 2차원 배열

        for (int i = 0; i < round; i++) {
            int temp;
            boolean duplicate;

            for (int j = 0; j < lottoNumbers[i].length; j++) {
                duplicate = false;
                temp = (int) (Math.random() * 45) + 1;

                for (int k = 0; k < j; k++) {
                    if (lottoNumbers[i][k] == temp) {
                        duplicate = true; // 중복 발생
                        break;
                    }
                }

                if (!duplicate) {
                    lottoNumbers[i][j] = temp;
                } else {
                    j--;
                }
            }

            Arrays.sort(lottoNumbers[i]); // 정렬
        }

        // 결과 출력
        for (int i = 0; i < round; i++) {
            System.out.println("Round " + (i + 1) + ": " + Arrays.toString(lottoNumbers[i]));
        }
    }
}
