package ru.javabegin.fastjava2.objects;


public class Phone {

    private int ram;
    private String name;
    private String type;

    public Phone() {
    }

    public Phone(int ram, String name, String type) {
        this.setRam(ram);
        this.setName(name);
        this.setType(type);
    }  // Constructor


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



