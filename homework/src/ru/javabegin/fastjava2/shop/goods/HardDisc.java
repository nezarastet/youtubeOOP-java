package ru.javabegin.fastjava2.shop.goods;


import ru.javabegin.fastjava2.shop.Department;

public class HardDisc {
    private int ramValue;
    private String name;
    private Department department;

    public void format(){

    }

    public void copy (int folderID) {

    }

    public void delete (int folderID){

    }


    public int getRamValue() {
        return ramValue;
    }

    public void setRamValue(int ramValue) {
        this.ramValue = ramValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
