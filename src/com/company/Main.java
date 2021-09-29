package com.company;

public class Main {

    public static void main(String[] args) {
        // 2) Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
        //- если число кратно 3 то вместо него вывести Hello
        //- если число кратно 5 то вместо него вывести World
        //- если число кратно и 3 и 5 то вместо него вывести HelloWorld
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println("Hello");
                if (i % 5 == 0)
                    System.out.println("Word");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("HelloWorld");
            } else {
                System.out.println(i);
            }
        }

        //3) Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно). Вывести среднее арифметическое.
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 21));
            System.out.println(array[i]);
        }

        //4) Написать метод который вернет String в которой будут в одну строку числа от 1 до 30. Каждое число при этом взять в круглые скобки ()

    }

}
