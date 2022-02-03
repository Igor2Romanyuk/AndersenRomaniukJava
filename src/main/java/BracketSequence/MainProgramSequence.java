package BracketSequence;

import java.util.Scanner;

public class MainProgramSequence {
    public static void main(String[] args) {
        System.out.println("Введите скобочную последвательность");

        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        BracketSequence.print(data);
    }
}
