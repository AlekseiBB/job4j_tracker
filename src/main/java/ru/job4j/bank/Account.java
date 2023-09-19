package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс Account представляет банковский счет с реквизитом и балансом.
 * * @author Aleksei
 *  * @version 1.0
 */
public class Account {

    /**
     * закрытое поле requisite учетной записи
     */
    private String requisite;

    /**
     * закрытое поле balance  баланс счета
     */
    private double balance;

    /**
     * конструктор класса Account. Используются для создания объектов класса
     * значения этих полей в соответствии с переданными значениями.
     * @param requisite
     * @param balance
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * @return Метод возвращает значение поля requisite
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод
     * @param requisite используется для установки/изменения значения поля requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * @return Метод возвращает значение поля balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод
     * @param balance используется для установки/изменения значения поля balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }


    /**
     * Метод hashCode() переопределен для генерации уникального значения (хэш-кода)
     * на основе значения поля requisite (реквизиты).
     * @return принимает значение requisite и возвращает хэш-код на основе этого значения
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
