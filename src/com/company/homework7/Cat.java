package com.company.homework7;

public class Cat extends Participant {

    @Override
    public void barrier() {
        catrun();
        catjump();
    }

    public void catrun() {
        System.out.println("Cat run....");
    }

    public void catjump() {
        System.out.println("Cat jump....");
    }


}
