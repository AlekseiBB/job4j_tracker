package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public int move() {
        System.out.println("The Bus is on move");
        return 0;
    }

    @Override
    public int passengers(int numPassengers) {
        System.out.println("Number of passengers on the bus: " + numPassengers);
        return 0;
    }

    @Override
    public double refuel(double fuelAmount) {
        double price = fuelAmount * 7.5;
        System.out.println("Quantity of filled fuel - " + fuelAmount + "price = " + price);
        return price;
    }
}
