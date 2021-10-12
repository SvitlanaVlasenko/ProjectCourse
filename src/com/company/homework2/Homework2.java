package com.company.homework2;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones());
        /**You're given strings jewels representing the types of stones that are jewels,
         and stones representing the stones you have.
         Each character in stones is a type of stone you have.
         You want to know how many of the stones you have are also jewels.*/

    }

    public static int numJewelsInStones() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int jewel = jewels.length(), stone = stones.length(), count = 0;
        char[] jewela = jewels.toCharArray(), stonea = stones.toCharArray();
        for (int i = 0; i < jewel; i++) {
            for (int j = 0; j < stone; j++) {
                if (jewela[i] == stonea[j])
                    count++;
            }
        }
        return count;

    }
}


