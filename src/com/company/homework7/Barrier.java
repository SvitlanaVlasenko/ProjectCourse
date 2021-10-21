package com.company.homework7;

public abstract class Barrier extends Participant {


    @Override
    public void barrier() {
        overcome();
    }

    public abstract void overcome();
}
