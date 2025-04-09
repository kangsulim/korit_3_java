package ch16_bean;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class UserEntityLombok {
    private int userid;
    private int password;
    private String email;
    private String name;

    @Override
    public String toString() {
        return  "userid : " + userid +
                "\npassword : " + password +
                "\nemail : " + email +
                "\nname : " + name;
    }
}
