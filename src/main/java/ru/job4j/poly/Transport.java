package ru.job4j.poly;

public interface Transport {
    int move();

    int passengers(int numPassengers);

    double refuel(double fuelAmount);
}
