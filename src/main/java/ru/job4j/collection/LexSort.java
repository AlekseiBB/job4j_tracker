package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String leftNumber = left.split(". ")[0].trim();
        String rightNumber = right.split(". ")[0].trim();
        return Integer.compare(Integer.parseInt(leftNumber), Integer.parseInt(rightNumber));
    }
}
