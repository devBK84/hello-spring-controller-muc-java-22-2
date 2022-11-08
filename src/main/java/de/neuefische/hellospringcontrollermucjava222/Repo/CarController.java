package de.neuefische.hellospringcontrollermucjava222.Repo;
/*
Schreibe einen Post-Entpunkt der im Body ein Car entgegen nimmt und die addCar() Methode vom CarService aufruft.
Schreibe einen Get-Endpunkt der die getCar Methode vom CarService aufruft und dann eine Liste von allen Autos zurückgibt.
 */
import de.neuefische.hellospringcontrollermucjava222.models.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/Car")
public class CarController {
public CarService carService = new  CarService(new ArrayList<>());

    @GetMapping
   public List<Car> allTheCars(){
        return carService.getCars();
    }


    @PostMapping()
    public Car saveCar (@RequestBody Car getCars){
        return getCars;
    }
}
