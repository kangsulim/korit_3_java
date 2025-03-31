package ch16_bean;
/*
     정보를 담는 객체를 Entity class 라고 합니다.
     -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
     특별한 지위에 있다고 할 수 있음.
         1열         2열         3열       4열       -> 세로줄(열/Column)
     +----------------------------------------+
     |  userid  | password |   email   | name |
     ------------------------------------------
     |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
     +----------------------------------------+
*/

public class UserEntity {
    private int userid;
    private int password;
    private String email;
    private String name;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "userid : " + userid +
                "\npassword : " + password +
                "\nemail : " + email +
                "\nname : " + name;
    }
}
