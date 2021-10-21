package com.company.homework7;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = getParticipants();
        for (int i = 0; i < participants.length; i++) {
            participants[i].print();
        }


    }


    public static Participant[] getParticipants() {
        Participant[] participants = {new Cat(), new Robot(), new People()};
        return participants;
    }
}
