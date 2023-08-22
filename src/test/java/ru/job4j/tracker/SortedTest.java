package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortedTest {

    @Test
    public void whenSortAscByName() {
        /*оставил для примера  [first, second, third, fourth]
           [first, fourth, second, third]*/
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
}
