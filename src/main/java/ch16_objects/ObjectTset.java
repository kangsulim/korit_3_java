package ch16_objects;
/*

 */
public class ObjectTset {
    // 필드 선언
    private String name;
    private String address;

    public ObjectTset() {
    }

    public ObjectTset(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

    public String displayInfo2() {

        return "이름 : " + name + "\n주소 : " + address;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }



    // 아래가 2개의 element를 반환하는 기존의 toString() 메서드의 동작
    //
//    @Override
//    public String toString() {
//        return "ObjectTset{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
