package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    public String surname;
    public static final String NEWVALUE = "";

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int c, int g, int h) {
    }

    String name;

    Broken() {
    }
}
