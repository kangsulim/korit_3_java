package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();

        user1.setUserid(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("강수림");

        // .toString() 메서드를 제정의 하면, 객체명 그 자체로 toString()을 호출하는 메서드가 된다
        System.out.println(user1);
        System.out.println();

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUserid(2);
        user2.setPassword(1357);
        user2.setEmail("b@test.com");
        user2.setName("김이");

        System.out.println(user2.getUserid());
        System.out.println(user2.getPassword());
        System.out.println(user2.getEmail());
        System.out.println(user2.getName());
        System.out.println();

        System.out.println(user2);
    }
}
