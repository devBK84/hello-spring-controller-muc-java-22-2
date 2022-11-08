package de.neuefische.hellospringcontrollermucjava222.models;
/*
Erstelle eine Klasse Car mit den folgenden Eigenschaften:

- Name des Herrstellers,
- Anzahl der Reifen,
- hat eine TÜV Plakette
 */
public class Car {

    private String brand;
    private int onlyFourTyres;

    private boolean tuev;

    public Car() {
    }

    public Car(String brand, int onlyFourTyres, boolean tuev) {
        this.brand = brand;
        this.onlyFourTyres = onlyFourTyres;
        this.tuev = tuev;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getOnlyFourTyres() {
        return onlyFourTyres;
    }

    public void setOnlyFourTyres(int onlyFourTyres) {
        this.onlyFourTyres = onlyFourTyres;
    }

    public boolean isTuev() {
        return tuev;
    }

    public void setTuev(boolean tuev) {
        this.tuev = tuev;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", onlyFourTyres=" + onlyFourTyres +
                ", Tuev=" + tuev +
                '}';
    }

}
