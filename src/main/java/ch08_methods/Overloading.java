package ch08_methods;
/*
    method overloading
        매개변수의 형태가 다르면 동일한 메서드 명을 가지고 정의할 수 있다.

        즉, 메서드명은 같고, parameter에 들어가는 자료형 및 변수명을 달리 사용이 가능함.

        overloading의 장점 :
            동일한 기능을 메서드를 정의할 때 메서드명이 필요한데,
            예를 들어 String 자료형끼리 연결해주는 메서드와
            int 끼리 합 연산을 하는 메서드를 나누었을 때,
            그리고 double끼리 합연산을 하는 메서드를 나누었을 때,
            add,
            plus,
            connect 등의 메서드를 정의했다면
            다음 연산자 +가 들어가는 메서드명은 또 뭘로 해야할까요?
 */
public class Overloading {
    // 메서드 정의
    // call1
    public static void add() {
        System.out.println("add()");
    }
    //call2
    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s);
    }

    // call2
    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println("a + b = " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("add(int a, int b, int c)");
        System.out.println("a + b + c = " + (a + b + c));
    }

    public static void add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println(s + " / " + a);
    }

    public static void add(int a, String s) {
        System.out.println("add(int a, String s)");
        System.out.println(a + " / " + s);
    }

    public static void main(String[] args) {
        add();

        add("yeah");

        add(17, 96);

        add(5, 6 ,34);

        add("high", 5);

        add(5, "high");
    }
}
