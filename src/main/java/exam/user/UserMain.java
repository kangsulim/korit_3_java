package exam.user;

class User {
    private String username;
    private String password;
    private String name;
    private String email;

    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "[사용자 정보]" +
                "\nusername: " + username +
                "\npassword: " + password +
                "\nname: " + name +
                "\nemail: " + email;
    }
}

public class UserMain {
    public static void main(String[] args) {
        User user = new User("junil", "1234", "김준일", "junil@gmail.cpm");
        System.out.println(user);
    }
}
