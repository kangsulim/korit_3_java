package ch20_json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // 변수 선언
        String userJson = null;
        String studentJson = null;
        String productJson = null;

        // user1 객체 생성
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        System.out.println(user1);

        // gson 만들기

        System.out.println("json 형태로 변환 : " + gson.toJson(user1));

        System.out.println("Java 객체 형태로 출력 : " + user1);
        
        // json 만들기
        System.out.println("pretty printing : " + gsonBuilder.toJson(user1));

        // userJson 대입
        userJson = gson.toJson(user1);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 2. jsonObject -> json 변화
        // jsonObject를 활용하여 객체 만들기
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("studentCode", "2025001");
        jsonObject.addProperty("studentName", "김이");
        jsonObject.addProperty("studentYear", "2");
        jsonObject.addProperty("score", "96.7");

        studentJson = gsonBuilder.toJson(jsonObject);

        System.out.println(studentJson);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 3. Map -> Json 활용
         /*
            Map을 활용하여 kwe String / value String으로 건언하고,
            객체명을 map으로 한 map을 생성하시오

            map에    productCode NT960XHA-KD72G
                    productName 상성 갤럭시북 프로 5
            라는 Extry를 입력하시오.

            gsonBuilder를 활용하여 json으로 바꾸고 productJson에 대입하고,
            sout(productJson) 출력
          */
        Map<String, String> map = new HashMap<>();

        map.put("productCode", "NT960XHA-KD72G");
        map.put("productName", "상성 갤럭시북 프로 5");

        System.out.println(map);
        System.out.println();

        productJson = gsonBuilder.toJson(map);

        System.out.println(productJson);

        // json -> 객체 / map으로 바꾸는 방법
        // user / jsonObject
        // 형식 :
        // gson.fromJson();

        // json -> map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);
        System.out.println();

        // json -> user
        // userJson을 User 클래스의 user2에 대입
        User user2 = gsonBuilder.fromJson(userJson, User.class);
        User user3 = gson.fromJson(userJson, User.class);
        
        System.out.println("User 클래스 형식 : \n" + user2);
        System.out.println("User 클래스 형식 : \n" + user3); // 어차피 toString()으로 인해 결과는 같다 (@Data)
        /*
            User 클래스 형식 :
            User(username=kim1, password=9876, email=a@test.com, name=김일, age=20)
            User 클래스 형식 :
            User(username=kim1, password=9876, email=a@test.com, name=김일, age=20)
         */
        System.out.println();

        // json -> jsonObject
        // studentJson을 jsonObject2에 대입
        JsonObject jsonObject2 = gsonBuilder.fromJson(studentJson, JsonObject.class);
        System.out.println("jsonObject 형식 : \n" + jsonObject2);
        System.out.println();
    }
}
