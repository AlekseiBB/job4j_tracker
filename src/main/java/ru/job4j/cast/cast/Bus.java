package ru.job4j.cast.cast;

public class Bus implements Vehicle {
    @Override
    public String move() {
        System.out.print("The Bus is moving on the road. ");
        return null;
    }

    @Override
    public double averageSpeed() {
        System.out.println("Average speed Bus =  90 kilometers/hour");
        return 0;
    }
}
