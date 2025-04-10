package exam.maplist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();

        Map<String, Object> person1 = new HashMap<>();
        person1.put("name", "홍길동");
        person1.put("rating", "VIP");
        person1.put("age", "30");

        Map<String, Object> person2 = new HashMap<>();
        person2.put("name", "김기영");
        person2.put("rating", "Gold");
        person2.put("age", "35");

        customers.add(person1);
        customers.add(person2);

        for (Map<String, Object> customer : customers) {
            System.out.println("name=" + customer.get("name"));
            System.out.println("rating=" + customer.get("rating"));
            System.out.println("age=" + customer.get("age"));
        }
    }
}
