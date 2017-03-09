package ru.javabegin.fastjava2;

import com.sun.org.apache.xpath.internal.SourceTree;
import ru.javabegin.fastjava2.objects.Car;

import java.net.SocketPermission;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Toyota");

        System.out.println("car.getName() = " + car.getName());

    }
}

