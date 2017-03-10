package ru.javabegin.training.fastjava2.objects;


public class Tayota {

    private String name;
    private double volume;


    public Tayota(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public Tayota(String name) {
        this.name = name;
    }

    public Tayota(double volume) {
        this.volume = volume;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
