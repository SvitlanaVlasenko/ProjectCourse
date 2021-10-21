package com.company.homework7;

public class Robot extends Participant {
    @Override
    public void barrier() {
        robotrun();
        robotjump();
    }

    public void robotrun() {
        System.out.println("Robot run....");
    }

    public void robotjump() {
        System.out.println("Robot jump....");
    }


}
