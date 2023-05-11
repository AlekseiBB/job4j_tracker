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
                int engineCount = "A380".equals(this.name) ? 4 : COUNT_ENGINE;
        System.out.println("Количество двигателей: " + engineCount);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
