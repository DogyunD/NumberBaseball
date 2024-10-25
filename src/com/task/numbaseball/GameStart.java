package com.task.numbaseball;

import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputnum1;
        int inputnum2;
        int inputnum3;

        System.out.println("첫번째 숫자를 입력하세요: ");
        inputnum1 = sc.nextInt();

        System.out.println("두번째 숫자를 입력하세요: ");
        inputnum2 = sc.nextInt();

        System.out.println("세번째 숫자를 입력하세요: ");
        inputnum3 = sc.nextInt();
    }
}
