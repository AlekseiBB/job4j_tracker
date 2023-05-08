package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Find.get(data, 0);
        System.out.println(rsl);
        String rsl1 = Find.get(data, 1);
        System.out.println(rsl1);
        String rsl2 = Find.get(data, 2);
        System.out.println(rsl2);
    }
}
