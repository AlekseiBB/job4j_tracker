package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("значение переменной = " + active);
        System.out.println("значение переменной = " + status);
        System.out.println("значение переменной = " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error2 = new Error();
        error2.printInfo();
        Error error = new Error(true, 55, "output");
        error.printInfo();
    }
}
