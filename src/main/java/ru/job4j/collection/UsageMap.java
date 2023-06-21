package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> usageMap = new HashMap<>();
        usageMap.put("alekseiB@yandex.ru", "Aleksei B");
        usageMap.put("sergeev@yandex.ru", "Sergei");
        usageMap.put("kyshkow@yandex.ru", "Alex");
        for (String key : usageMap.keySet()) {
            String value = usageMap.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
