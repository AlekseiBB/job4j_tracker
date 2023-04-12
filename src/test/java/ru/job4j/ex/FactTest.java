package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                   new Fact().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }

    @Test
    public void whenNumber4IsFactorial24() {
        int n = 4;
        int result = new Fact().calc(n);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumber7IsFactorial5040() {
        int n = 7;
        int result = new Fact().calc(n);
        int expected = 5040;
        assertThat(result).isEqualTo(expected);
    }
}
