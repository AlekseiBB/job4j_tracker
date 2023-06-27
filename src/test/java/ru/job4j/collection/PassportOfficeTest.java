package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenAddDuplicatePassport() {
        Citizen citizen = new Citizen("12fra5", "Arseni Lukin");
        PassportOffice office = new PassportOffice();
        boolean firstAdd = office.add(citizen);
        assertThat(firstAdd).isTrue();

        Citizen citizenDuplicate = new Citizen("12fra5", "Dupl Arseni Lukin");
        boolean secondAdd = office.add(citizenDuplicate);
        assertThat(secondAdd).isFalse();
    }
}
