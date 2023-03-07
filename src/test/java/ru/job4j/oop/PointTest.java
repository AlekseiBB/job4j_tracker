package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PointTest {
    @Test
    public void thenTwoPointWhen() {
        Point first = new Point(4, 1);
        Point second = new Point(2, 8);
        double result = 7.280109889280518;
        double expect = first.distance(second);
        assertEquals(expect, 7.28, 0.01);
    }

    @Test
    public void thenThreePointWhen() {
        Point first = new Point(2, 1, 4);
        Point second = new Point(3, 2, 1);
        double result = 3.3166247903554;
        double expect = first.distance3d(second);
        assertEquals(expect, 3.31, 0.01);
    }
}
