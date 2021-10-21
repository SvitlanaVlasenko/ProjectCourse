package com.company.homework7;

public class People extends Barrier {
    @Override
    public void overcome() {
        peoplerun();
        peoplejump();
    }

    private void peoplerun() {
        System.out.println("People run....");
    }

    private void peoplejump() {
        System.out.println("People jump....");
    }


}
