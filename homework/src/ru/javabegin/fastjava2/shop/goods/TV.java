package ru.javabegin.fastjava2.shop.goods;


import ru.javabegin.fastjava2.shop.Department;

public class TV {
    private String brand;
    private String model;
    private Department department;

    public void switchOn(){

    }

    public void switchOff(){

    }

    public void showChanel(int chanelID){

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
