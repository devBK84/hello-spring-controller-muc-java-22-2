package de.neuefische.hellospringcontrollermucjava222.Repo;

import de.neuefische.hellospringcontrollermucjava222.models.Car;

import java.util.List;

public class CarService {

    public final List<Car> cars;

    public CarService(List<Car> Cars) {
        this.cars = Cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car addcar(Car addcars) {
        boolean add = this.cars.add(addcars);
        return addcars;
    }
}
