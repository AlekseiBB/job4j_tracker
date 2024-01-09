package ru.job4j.search;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void testFindWhenNoResults() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Ivan", "Petrov", "1234567", "Moscow"));
        phones.add(new Person("Sergey", "Ivanov", "7654321", "Saint-Petersburg"));
        phones.add(new Person("Maria", "Sidorova", "9876543", "Novosibirsk"));
        var result = phones.find("77777");
        assertTrue(result.isEmpty());
        var result1 = phones.find("Novikov");
        assertTrue(result1.isEmpty());
    }
}
