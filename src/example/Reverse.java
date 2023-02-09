package example;

import java.util.HashMap;
import java.util.Scanner;
public class Reverse {
    private static final HashMap<Character, Integer> changeOnNum = new HashMap<>() {{
        put('a', 1);
        put('e', 5);
        put('i', 9);
        put('o', 15);
        put('u', 21);
        put('y', 25);

        put('A', 1);
        put('E', 5);
        put('I', 9);
        put('O', 15);
        put('U', 21);
        put('Y', 25);

        put('а', 1);
        put('е', 6);
        put('ё', 7);
        put('и', 10);
        put('о', 16);
        put('у', 21);
        put('ы', 29);
        put('э', 31);
        put('ю', 32);
        put('я', 33);

        put('А', 1);
        put('Е', 6);
        put('Ё', 7);
        put('И', 10);
        put('О', 16);
        put('У', 21);
        put('Ы', 29);
        put('Э', 31);
        put('Ю', 32);
        put('Я', 33);
    }};

    public static String transformString(String start) {
        if (start.length() <= 2) {
            return start;
        }

        StringBuilder result = new StringBuilder();
        for (int i = start.length() - 1; i >= 0; i--) {
            char c = start.charAt(i);
            if (changeOnNum.containsKey(c)) {
                result.append(changeOnNum.get(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public void output(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для замены.");
        String end = scanner.nextLine();
        System.out.println("Ваше слово - " + end);
        System.out.println("Новое слово - " + transformString( end));
    }
}

