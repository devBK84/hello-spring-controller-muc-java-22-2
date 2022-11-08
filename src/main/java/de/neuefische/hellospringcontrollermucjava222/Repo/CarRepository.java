package de.neuefische.hellospringcontrollermucjava222.Repo;

import de.neuefische.hellospringcontrollermucjava222.models.Car;

import java.util.List;

/*
Erstelle eine Klasse CarRepository mit einer Liste von Cars und den Methoden:

addCar(Car car), die das Auto zu der Liste hinzufügt.
getCars(), gibt die ganze Liste an Autos zurück.
 */
public class CarRepository {

    private CarRepository carRepository;

    public final List<Car> cars;

    public CarRepository(List<Car> Cars) {
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


