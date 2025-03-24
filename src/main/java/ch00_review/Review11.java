package ch00_review;

class User {
    public String name;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

public class Review11 {
    public static void main(String[] args) {
        User user1 = new User();

        // name 필드와 password 필드에 각각 다른 방법으로 데이터 입력하기
        // 접근 지정자의 차이 private / public

        // 1. name 필드에 직접 값 대임 : public
        user1.name = "user1";

        System.out.println(user1.name);

        // 2. password 필드에 setter를 통해 값 대입 : private
        user1.setPassword("1q2w3e4r");

        System.out.println(user1.getPassword());
    }
}
