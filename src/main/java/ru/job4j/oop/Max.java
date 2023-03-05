package ru.job4j.oop;

public class Max {

    public static int max(int first, int second) {
        return second > first ? second : first;
    }

    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static int max(int first, int second, int third, int four) {
        if (first == max(first, second, third) && first > four)
            return first;
        else {
            if (second == max(first, second, third) && second > four)
                return second;
            else {
                if (third == max(first, second, third) && third > four)
                    return third;
                else
                    return four;
            }
        }
    }
}
