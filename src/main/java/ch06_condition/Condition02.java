package ch06_condition;
/*
    if - else문 : 조건식이 true이면 if문 내의 {}
                        false이면 else문 내의 {} 실핼

    형식 :
    if(조건식) {
        실행문1
    } else {
        실행문2
    }
 */
public class Condition02 {
    public static void main(String[] args) {
        int num = -10;

        if (num < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("음수가 아닙니다.");
        }


    }
}
