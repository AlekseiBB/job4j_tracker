package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student1 st = freshman;
        Object obj = freshman;
    }
}
/* Вопрос: 3. Ответьте на вопрос к какому типу приведения это относится?
* Ответ: Такое приведение типов называется повышающим (up casting).
*/