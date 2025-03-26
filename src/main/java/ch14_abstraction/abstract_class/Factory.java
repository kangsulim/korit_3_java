package ch14_abstraction.abstract_class;

public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    // 메서드 정의
    public abstract void produce(String model);
    public abstract void manage();
    // 팝업을 확인하고 고침
    // 기존
    // public class Factory {
    //      public void produce();
    // }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("공장의 정보를 출력합니다.\n" +
                "공장 이름 : " + name);
    }
}
