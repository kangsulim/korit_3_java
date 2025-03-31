package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        // 정적 메서드의 호출
        System.out.println(Product.getCount());

        // 객체 생성
        Product product1 =new Product();

        System.out.println(Product.getCount());         // 정적 메서드, 대문자로 시작
        System.out.println(product1.getInstanceCount());// 일반 메서드, 소문자로 시작

        Product product2 = new Product();

        System.out.println(Product.getCount());         // 정적 메서드, 대문자로 시작
        System.out.println("product2 : " + product2.getInstanceCount());// 일반 메서드, 소문자로 시작
        System.out.println("product1 : " + product1.getInstanceCount());// 일반 메서드, 소문자로 시작

        // 롬복을 사용하지 않은 getTitle() 호출
        System.out.println(Product.getTitle());         // 클래스명.메서드명()으로 static method 호출
        // ch08_method 에서는 왜 call1()으로 호출할 수 있었나요???
        // >>> 그 때 call1()~call4()는 main 에 선언된 method 였거든요 ^^7
    }
}
