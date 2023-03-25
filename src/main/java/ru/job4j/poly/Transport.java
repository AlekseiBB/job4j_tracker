package ru.job4j.poly;

public interface Transport {
    void move();

    void passengers(int numPassengers);

    double refuel(double fuelAmount);
}
