package com.niktos.newtry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        double height = in.nextDouble();
        System.out.print("Can he swim: ");
        boolean canHeSwim = in.nextBoolean();
        String answer;
        if (canHeSwim) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        System.out.printf("Name: %s Age: %d Height: %.2f Can he swim: %s", name, age, height, answer);
        in.close();
    }
}
