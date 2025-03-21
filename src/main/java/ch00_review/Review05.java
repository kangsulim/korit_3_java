package ch00_review;
/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶어둔 것
        유형 call1()~call4() 매개변수 o,x / return o, x

    형식 :
        (접근지정자) 리턴타입 메서드명(매개변수1, 매개변수2, ... , 매개변수n) {
            메서드에 순서대로 들어갈 코드
        }
    정의 예시
        public void writeScheduke(String date, String content) {
            System.out.println(date + "일의 스케줄은 다음과 같습니다.");
            System.out.println(content);
        }
    호출 예시 :
        같은 클래스 내에 정의된 메서드라면

        writeSchedule("20250321", "메서드/오버로딩/클래스 복습");
 */
class IsSeven {
    int num;
    
    IsSeven() {
    }

    public void showSeven(int num) {

        if (num % 7 == 0) {
            System.out.println(num + "은 7의 배수입니다.");
        } else {
            System.out.println(num + "은 7의 배수가 아닙니다.");
        }
        System.out.println();
    }
}
public class Review05 {
    // 메서드 정의

    // call2() 유형
    public void writeSchedule(String date1, String content) {
        System.out.println(date1 + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
        System.out.println();
    }
    // 오버로딩 예시
    public void writeSchedule(int date2, String content) {
        System.out.println(date2 + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
        System.out.println();
    }

    // call2() 유형으로 작성
    // int 숫자 하나를 매개변수로 받아
    // 그 숫자가 7의 배수인지 확인하는 메서드 작성
    public void isSeven(int num) {
        String result = "";
        
        if (num % 7 == 0) {
            result = "은 7의 배수입니다.";
        } else {
            result = "은 7의 배수가 아닙니다.";
        }
        System.out.println(num + result);
        System.out.println();
    }

    // 매개변수로 limitNum 을 받아 1부터 limitNum 까지 출력하는 메서드
    void printLimitNumber (int limitNum) {
        for (int i = 0; i < limitNum; i++) {
            System.out.print(i+1 + "\t");
        }
    }
    // 위 메서드를 참조하여 만든 짝수 출력기
    void printEvenNumber (int limitNum) {
        for (int i = 0; i < limitNum; i++) {
            int addedI = i + 1;
            if (addedI % 2 == 0)
            System.out.print((addedI) + "\t");
        }
    }

    /*
        첫 번째 매개변수 limitNum, 두 번째 매개변수 나누는 값
     */
    void printSpecificNums (int limitNum, int dividingNum) {
        for (int i = 0; i < limitNum; i++) {
            int addedI = i + 1;
            if (addedI % dividingNum == 0)
                System.out.print((addedI) + "\t");
        }
        System.out.println();

        for (int i = 0; i < limitNum; i += dividingNum) {
            if (i > 0)
                System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        Review05 review05 = new Review05();
        // 메서드 호출
//        review05.writeSchedule("20250321", "메서드/오버로딩/클래스 복습");
//        review05.writeSchedule(20250321, "메서드/오버로딩/클래스 복습");

//        // 과제 메서드 호출 방식
//        review05.isSeven(77);
//        review05.isSeven(454789);

//        // 다른 클래스를 선언하고 객체를 생성
//        IsSeven isSeven = new IsSeven();
//        isSeven.showSeven(77);
//        isSeven.showSeven(454789);

//        review05.printLimitNumber(10);
//        System.out.println();

//        review05.printEvenNumber(10);
//        System.out.println();

        review05.printSpecificNums(98, 3);
    }
}
