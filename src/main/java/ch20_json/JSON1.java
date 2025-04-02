package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        // 속성(키-값 쌍)을 추가하는 메서드 : addProperty() 메서드 사용
        
        jsonObject.addProperty("username", 1);
        jsonObject.addProperty("password", 1234);
        jsonObject.addProperty("email", "c@test.com");
        jsonObject.addProperty("name", "김일");

        System.out.println(jsonObject);
        // {"username":1,"password":1234,"email":"c@test.com","name":"김일"}
        /*
            Map과의 차이점
            1. Map에서는 key 부분에 ""가 없었고,
                JSON에서는 모든 key가 String 자료형처럼 보이도록 ""가 있다.

            2. Map에서는 key1=value1의 형태로 작성되었고,
                JSON에서는 "key1":value1의 형태로 작성되어있다.
         */
        
        jsonObject.addProperty("job", "student");
        System.out.println(jsonObject);
        
        // 콘솔의 출력이 한 줄로 보임(가독성이 떨어진다)
        // pretty print 사용하여 가독성 개선

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // jsonObject를 pretty printing이 적용된 JSON 문자열 형태로 반환
        String json = gson.toJson(jsonObject);  // `jsonObject`와 `json`은 다르다

        System.out.println(json);
    }
    
}
