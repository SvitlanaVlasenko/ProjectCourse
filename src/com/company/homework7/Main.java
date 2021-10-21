package com.company.homework7;
//import org.apache.commons.lang3.ArrayUtils;

public class Main {
    public static void main(String[] args) {
            Participant[] participants = getParticipants();
            Barrier[] barriers = getBarriers();
            String[] together = new String[participants.length + barriers.length];
            //String[] result = new String[together];
            System.arraycopy(participants, 0, together, 0, participants.length);
            System.arraycopy(barriers, 0, together, participants.length, barriers.length);


    }
        private static Barrier[] getBarriers () {
            Barrier[] barriers = {new Treadmill(), new Wall()};
            return barriers;
        }

        private static Participant[] getParticipants () {
            Participant[] participants = {new Cat(), new Robot(), new People()};
            return participants;
        }

    }



