package ch12_arrays;

public class Array10 {
    public static void main(String[] args) {
        String[] persons =
                {"강수림", "기준성", "김미진", "김준식", "문성진",
                "심민호", "양지은", "유지현", "윤현지", "이동규",
                "이예성", "이정화", "전남용", "채수원", "한영진"};

        System.out.println("[ 일반 for 문으로 작성 ]");
        for (int i = 0; i < persons.length; i++) {
            System.out.println((i + 1) + "번 : " + persons[i] + " 님");
        }

        System.out.println("[ 향상된 for 문으로 작성 ]");
        int j = 0;
        for (String person : persons) {
            j++;
            System.out.println(j + "번 : " + person + " 님");
        }
    }
}
