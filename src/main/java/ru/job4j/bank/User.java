package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс User представляет данные пользователя, с данными паспорта и именем.
 *  * * @author Aleksei
 *  *  * @version 1.0
 */
public class User {

    /**
     * закрытое поле passport
     */
    private String passport;

    /**
     * закрытое поле username
     */
    private String username;

    /**
     * конструктор класса User. Используются для создания объектов класса
     * значения этих полей в соответствии с переданными значениями.
     * @param passport
     * @param username
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     *
     * @return Метод возвращает значение поля passport
     */
    public String getPassport() {
        return passport;
    }

    /**
     *
     * @param passport Метод используется для установки/изменения значения поля
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     *
     * @return Метод возвращает значение поля username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username Метод используется для установки/изменения значения поля
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * переопределенный метод equals().
     * используется для сравнения двух объектов типа Account на основе их полей.
     * являются ли сравниваемые объекты одним и тем же объектом или принадлежат ли они к различным классам.
     * @param o объект сравнения
     * @return возвращает результат сравнения объектов
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод hashCode() переопределен для генерации уникального значения (хэш-кода)
     * на основе значения поля requisite (passport).
     * @return принимает значение passport и возвращает хэш-код на основе этого значения
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
