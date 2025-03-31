package ch17_static.singleton.products;

import ch17_static.singleton.Samsung;

public class ProductViewMain {
    public static void main(String[] args) {
//        ProductView productView1 = new ProductView(); // 생성자가 private이라 오류 발생

        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();
        System.out.println();

        // 위를 보면 복수의 객체를 만든 것 처럼 보이지만?
        // ProductView.getInstance(); 의 결과값은 동일한 instance이기 때문에
        // 셀제로는 하나의 객체일 뿐이고 counter 값만 올라간다.

        // 콘솔에서 실행시킨 결과
        // 1번 째 객체가 생성되었습니다. <- 한 줄만 출력됨

        // static 변수로 counter를 선언했다면
        // 1,2,3,4번째 객체가 생성되었습니다, 로 네 줄이 출력되던지

        // 그게 아니라 좀 생각을 해봤으면
        // 생성자 내부의 int counter가 지역변수이고 생성자가 호출될 때 마다 1로 초기화 되니
        // 1번 째 객체가 생성되었습니다.
        // 1번 째 객체가 생성되었습니다.
        // 1번 째 객체가 생성되었습니다.
        // 1번 째 객체가 생성되었습니다.
        // 로 네 줄이 출력될 거라고 생각했을 탠데...

        // 한 번만 출력되었다는 것은 생성자 호출 자체가 한 번만 있었다는 뜻!!!!!!!

        productView1.showMainView();
        productView2.showMainView();
        System.out.println();

        Samsung samsung1 = Samsung.getInstance();
        Samsung samsung2 = Samsung.getInstance();
        Samsung samsung3 = Samsung.getInstance();
        Samsung samsung4 = Samsung.getInstance();
        Samsung samsung5 = Samsung.getInstance();

        samsung1.creatrSerialNumber("갤럭시1");
        samsung2.creatrSerialNumber("갤럭시2");
        samsung3.creatrSerialNumber("갤럭시3");
        samsung4.creatrSerialNumber("갤럭시4");
    }
}
