package Algorithms;

public class Utils {
    public static String settingTheCapitalLetter(String name) {
        String result = "";
        result = result + name.substring(0, 1).toUpperCase() + name.substring(1);
        return result;
    }

    public static int[] convertingStringToIntArray(String string) {
        String[] array = string.split(" ");
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Integer.parseInt(array[i]);
        }
        return result;
    }
}
