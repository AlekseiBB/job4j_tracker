package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax4To11Then11() {
        int first = 4;
        int second = 11;
        int result = Max.max(first, second);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax99To15Then99() {
        int first = 99;
        int second = 15;
        int result = Max.max(first, second);
        int expected = 99;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax14To121To88Then121() {
        int first = 14;
        int second = 121;
        int third = 88;
        int result = Max.max(first, second, third);
        int expected = 121;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax44To1To15Then44() {
        int first = 44;
        int second = 1;
        int third = 15;
        int result = Max.max(first, second, third);
        int expected = 44;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To18To1To35Then35() {
        int first = 7;
        int second = 18;
        int third = 1;
        int four = 35;
        int result = Max.max(first, second, third, four);
        int expected = 35;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To31To25To8Then31() {
        int first = 1;
        int second = 31;
        int third = 25;
        int four = 8;
        int result = Max.max(first, second, third, four);
        int expected = 31;
        assertThat(result).isEqualTo(expected);
    }
}
