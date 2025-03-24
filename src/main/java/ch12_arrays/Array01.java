package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
//        int[] arr1 = { 1, 2, 3, 4, 5 };
//        System.out.println(arr1);

        // 배열의 element 출력 방법
        int[] arr2 = {9,8,7,6,5};
        System.out.println(arr2[0]);
        System.out.println();

        // 기본적인 for 문
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();

        // 향상된 for 문 (배열에서 사용됨)
        for (int j : arr2) {
            System.out.print(j + "\t");
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] *= 2;
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        System.out.println();
//          향상된 for 문에서 사용되는 인덱스는 배열 그 자체를 의미하기 때문에 j를 사용할 수 없다.
//          또한 이곳에서 사용되는 인덱스는 배열의 자료형과 일치해야 한다.
//        for (int j : arr2) {
//            arr2[j] *= 2;
//            System.out.print(j + "\t");
//        }
//        System.out.println();

        // ages 라는 배열을 선언했다고 가정하면,
        // 다음 해가 되었을 때 +1씩 시켜줘야한다.
        // 배열을 사용한다면 반복문을 활용하여
        // 편리하게 해결할 수 있다.

//        arr2[0] = arr2[0] + 1;    모두 가능
//        arr2[0] += 1;
//        arr2[0]++;

        String[] strArr1 = {"안", "녕", "하", "세", "요"};

        for (int i = 0; i < strArr1.length; i++) {
            System.out.print(strArr1[i]);
        }
        System.out.println();

        for (String arr : strArr1) {
            System.out.print(arr + "/");
        }
    }
}
