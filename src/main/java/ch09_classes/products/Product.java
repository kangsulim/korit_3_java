package ch09_classes.products;

public class Product {

    int productNum;
    String productName;

    Product() {
        System.out.println("productNum " + productNum);
        System.out.println("productName " + productName);
    }

    Product(int productNum) {
        this.productNum = productNum;

        System.out.println("productNum " + productNum);
        System.out.println("productName " + productName);
    }

    Product(String productName) {
        this.productName = productName;

        System.out.println("productNum " + productNum);
        System.out.println("productName " + productName);
    }

    Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;

        System.out.println("productNum " + productNum);
        System.out.println("productName " + productName);
    }

    void showInfo() {
        System.out.println("시리얼 넘버 : " + productNum);
        System.out.println("제품 타이틀 : " + productName);

    }
}
