package com.company.homework7;

public abstract class Participant {

    public void print() {
        System.out.print("Participant ");
        barrier();
    }

    public abstract void barrier();
}

