package ch13_inheritance.product;

public class Product extends Item {
    private int
            price,
            stock;
    
    // extends 만 했을 때 오류가 생기면서 뭔가 만들라고 해서 만들었더니
    // 부모 속성으로만 이루어진 생성자 명시
//    public Product(String name, String category) {
//        super(name, category);
//    }

    // 자식 생성자로 만들면 부모, 자식 속성이 모두
    // 포함되어 있는 생성자가 만들어짐
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    // 부모 속성의 getter, setter
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }

    // 자식 속성의 getter, setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    // 지금까지 ProductMain에서 할 수 있는 것
    // 1. 객체 생성
    // 2. 부모, 자식에 대한 getter, setter

    // 고유 메서드
    public void display() {
        // 부모 클래스의 private 속성이라서 getter 사용
        System.out.println("제품명 : " + this.getName());      
        System.out.println("카테고리 : " + this.getCategory());
        // 같은 클래스 내에 있기 때문에 private 속성도 그냥 사용 가능
        System.out.println("가격 : " + price);
        System.out.println("제고 : " + stock);
    }
}
