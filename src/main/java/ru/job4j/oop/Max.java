package ru.job4j.oop;

public class Max {

    public static int max(int first, int second) {
        return second > first ? second : first;
    }

    public static int max(int first, int second, int third) {
        int result = third;
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int four) {
        return max(first, max(second, third, four));
    }
}
