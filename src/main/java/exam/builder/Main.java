package exam.builder;

import ch17_static.builders.Person;

class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.productName = builder.productName;
        this.consumerName = builder.consumerName;
        this.price = builder.price;
        this.stock = builder.stock;
    }

    public static class Builder {
        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;

        public Builder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder ConsumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder Stock(int stock) {
            this.stock = stock;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }


    public void showOrderInfo() {
        System.out.println("주문번호: " + orderId);
        System.out.println("상품명: " + productName);
        System.out.println("구매자: " + consumerName);
        System.out.println("가격: " + price);
        System.out.println("수량: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order.Builder()
                .orderId(100)
                .productName("Samsung GalaxyBook2 Pro")
                .ConsumerName("홍길동")
                .price(1450000)
                .Stock(2)
                .build();

        order.showOrderInfo();
    }
}
