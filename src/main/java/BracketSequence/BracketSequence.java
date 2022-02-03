package BracketSequence;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BracketSequence {
    private static StringBuilder stringResult = new StringBuilder();
    private static boolean result;

    private static boolean isValidBrackets(String input) {
        result = true;
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        Map<Character, Character> dataBrackets = new HashMap<>();
        dataBrackets.put(')', '(');
        dataBrackets.put('}', '{');
        dataBrackets.put(']', '[');
        dataBrackets.put('(', ')');
        dataBrackets.put('{', '}');
        dataBrackets.put('[', ']');

        Deque<Character> stack = new LinkedList<>();
        for (char c : input.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
                stringResult.append(c);
                result = stack.isEmpty();
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty()) {
                    stringResult.append(dataBrackets.get(c));
                    stringResult.append(c);
                } else {
                    stringResult.append(dataBrackets.get(stack.peek()));
                }
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    result = false;
                }
            }
        }

        for (Character character : stack) {
            stringResult.append(dataBrackets.get(stack.pop()));
        }
        return result;
    }

    public static void print(String data) {
        if (isValidBrackets(data)) {
            System.out.println("Последовательность правильная");
        } else {
            System.out.println("Последовательность не правильная");
            System.out.println("Исправленная последовательность: " + stringResult);
        }
    }
}
