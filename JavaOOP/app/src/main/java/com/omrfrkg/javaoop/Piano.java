package com.omrfrkg.javaoop;

public class Piano implements Instrument,HouseDecor{

    String brand;
    boolean digital;

    @Override
    public void info() {
        System.out.println("Method override.");
    }
}
