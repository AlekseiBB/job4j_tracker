package ru.job4j.tracker;


import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedTest {

    @Test
    public void whenSortItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("first"),
                new Item("second"),
                new Item("third"),
                new Item("fourth")
        );
        List<Item> expected = Arrays.asList(
                new Item("first"),
                new Item("fourth"),
                new Item("second"),
                new Item("third")
        );
        Collections.sort(items, new ItemAscByName());
        assertEquals(expected, items);
    }

    @Test
    public void whenSortItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("first"),
                new Item("second"),
                new Item("third"),
                new Item("fourth")
        );

        List<Item> expected = Arrays.asList(
                new Item("third"),
                new Item("second"),
                new Item("fourth"),
                new Item("first")
        );
        Collections.sort(items, new ItemDescByName());
        assertEquals(expected, items);
    }
}