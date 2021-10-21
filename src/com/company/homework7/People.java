package com.company.homework7;

public class People extends Participant {
    @Override
    public void barrier() {
        peoplerun();
        peoplejump();
    }

    public void peoplerun() {
        System.out.println("People run....");
    }

    public void peoplejump() {
        System.out.println("People jump....");
    }


}
