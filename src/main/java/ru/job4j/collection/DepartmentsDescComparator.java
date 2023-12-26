package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] split1 = o1.split("/");
        String[] split2 = o2.split("/");
        int result = split2[0].compareTo(split1[0]);
        if (result == 0) {
            for (int i = 1; i < Math.min(split1.length, split2.length); i++) {
                result = split1[i].compareTo(split2[i]);
                if (result != 0) {
                    return result;
                }
            }
            result = Integer.compare(split1.length, split2.length);
        }
        return result;
    }
}
