package Algorithms;

public class Algorithms {
    public static void print(String data) {
        if (!data.contains(" ") && data.matches(".*\\d.*")) {
            printing(Integer.parseInt(data));
        } else {
            if (data.contains(" ") && data.matches(".*\\d.*")) {
                printing(Utils.convertingStringToIntArray(data));
            } else {
                printing(data);
            }
        }
    }

    private static void printing(int number) {
        if (number > Config.CONDITION_OF_THE_FIRST_CASE) {
            System.out.println("Привет");
        }
    }

    private static void printing(String name) {
        name.toLowerCase();
        if (name.equals(Config.CONDITION_OF_THE_SECOND_CASE.toLowerCase())) {
            System.out.println("Привет, " + Utils.settingTheCapitalLetter(name));
        } else {
            System.out.println("Нет такого имени");
        }
    }

    private static void printing(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % Config.CONDITION_OF_THE_THIRD_CASE == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
