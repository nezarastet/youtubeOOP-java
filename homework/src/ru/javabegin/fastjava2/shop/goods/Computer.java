package ru.javabegin.fastjava2.shop.goods;


import ru.javabegin.fastjava2.shop.Department;

public class Computer {
    private String name;
    private int Ram;
    private Department departmentOne;

    public void switchOn(){

    }

    public void switchOff(){

    }

    public void loadRam(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public Department getDepartment() {
        return departmentOne;
    }

    public void setDepartment(Department department) {
        this.departmentOne = department;
    }
}
