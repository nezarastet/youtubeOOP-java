package ru.javabegin.fastjava2;

import ru.javabegin.fastjava2.objects.*;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone(1024, "Samsung", "GSM");
        phone1.setName("Nokia");
        System.out.println("phone1.getName() = " + phone1.getName());


    }

}
