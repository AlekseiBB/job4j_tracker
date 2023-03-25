package ru.job4j.cast.cast;

public class Plane implements Vehicle {
    @Override
    public String move() {
        System.out.print("The Plane flies in the air. ");
        return null;
    }

    @Override
    public double averageSpeed() {
        System.out.println("Average speed Plane = 1000 kilometers/hour");
        return 0;
    }
}
