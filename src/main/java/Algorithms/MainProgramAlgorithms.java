package Algorithms;

import java.util.Scanner;

public class MainProgramAlgorithms {
    public static void main(String[] args) {
        System.out.println("Введите либо число, либо имя, либо числовую последовательность через пробел");

        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        Algorithms.print(data);
    }
}
