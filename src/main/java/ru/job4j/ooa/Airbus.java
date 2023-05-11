package ru.job4j.ooa;

final class Airbus extends Aircraft {
    final static int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
                int engineCount = this.name.equals("A380") ? 4 : COUNT_ENGINE;
        System.out.println("Количество двигателей: " + engineCount);
        /* использовать дополнительную переменную и тернарный оператор - выгода использования не ясна */
        /* if (this.name.equals("A380")) {
            System.out.println("Количество двигателей: 4");
        } else {
            System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
        } */

    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
