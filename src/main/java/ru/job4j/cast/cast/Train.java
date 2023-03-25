package ru.job4j.cast.cast;

public class Train implements Vehicle {
    @Override
    public String move() {
        System.out.print("The Train is moving on the railroad. ");
        return null;
    }

    @Override
    public double averageSpeed() {
        System.out.println("Average speed Train =  120 kilometers/hour");
        return 0;
    }
}
