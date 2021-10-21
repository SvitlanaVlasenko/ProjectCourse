package com.company.homework7;

public class Robot extends Barrier {
    @Override
    public void overcome() {
        robotrun();
        robotjump();
    }

    private void robotrun() {
        System.out.println("Robot run....");
    }

    private void robotjump() {
        System.out.println("Robot jump....");
    }


}
