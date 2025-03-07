package ru.job4j.io;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Rett {
    public static void main(String[] args) {
        List<String> list = IntStream.rangeClosed(1, 5)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}