package com.giuseppe;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // keys = employees names - Strings
        // values = employees Ids - Integer
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 9);
        empIds.put("Jerry", 256);

        //Map does not guarantee a certain order, it just stores values
        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("George"));

        System.out.println(empIds.containsValue(10));

        System.out.println(empIds.putIfAbsent("John", 222));
        System.out.println(empIds);

        empIds.putIfAbsent("Steve", 222);
        System.out.println(empIds);

        empIds.remove("Jerry");
        System.out.println(empIds);

    }
}
