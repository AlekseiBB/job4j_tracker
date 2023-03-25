package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("The Bus is on move");
    }

    @Override
    public void passengers(int numPassengers) {
        System.out.println("Number of passengers on the bus: " + numPassengers);
    }

    @Override
    public double refuel(double fuelAmount) {
        double price = fuelAmount * 7.5;
        System.out.println("Quantity of filled fuel - " + fuelAmount + "price = " + price);
        return price;
    }
}
