package ch12_arrays;

public class Array07 {
    public static void main(String[] args) {
        Array06 array06 = new Array06();
        int[] mathScores = {61,72,83,94,59,84,86,72,15,49,86,53,90,94,77,68,58};

        array06.printTotalInfo(mathScores);
        // 메서드 내부에서 다른 메서드를 호출하여
        // 하나의 메서드만을 호출해도 모든 메서드를
        // 실행하도록 만들었다.
    }
}
