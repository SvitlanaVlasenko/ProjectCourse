package com.company.homework7;

public class Cat extends Barrier {

    @Override
    public void overcome() {
        catrun();
        catjump();
    }

    private void catrun() {
        System.out.println("Cat run....");
    }

    private void catjump() {
        System.out.println("Cat jump....");
    }


}
