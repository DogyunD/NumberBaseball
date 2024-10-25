package com.task.numbaseball;

import java.util.HashSet;
import java.util.Random;

public class Baseball {
    public static void main(String[] args) {
        Random number = new Random();
        HashSet<Integer> answer = new HashSet<>();

        while(answer.size() < 3) {
            answer.add(number.nextInt(9)+1);
        }

        System.out.println(answer);
    }
}
