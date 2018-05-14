package kotlinFromJava;

import java.util.*;

public class JavaCollections {
    public void listEx() {
        List<String> list = Arrays.asList("test", "ddddddddd", "abc", "ab", "fsdfsdf");
        List<String> resultList = new ArrayList<>();

        for(String item : list) {
            if(item.length() < 5) {
                resultList.add(item.toUpperCase());
            }
        }
        System.out.println("JAVA");
        resultList.sort((o1, o2) -> 0);
        Collections.reverse(resultList);
        for(String item : resultList) {
            System.out.println(item);
        }
    }

    public void mapEx() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Carl", 30);
        map.put("John", 20);

        Integer userAge = map.get("Carl");
        if(userAge != null) {
            System.out.println(userAge);
        } else {
            System.out.println("Can not find user");
        }

        for(Map.Entry<String, Integer> mapEntry : map.entrySet()) {
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
    }
}
