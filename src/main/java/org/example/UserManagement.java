package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserManagement {
    public static void main(String[] args) {
        // Создаем список логинов
        List<String> logins = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

        // Создаем строку с первыми буквами логинов
        String firstLetters = logins.stream()
                .map(login -> String.valueOf(login.charAt(0)))
                .collect(Collectors.joining());
        System.out.println("Первые буквы логинов: " + firstLetters);

        // Создаем список id
        List<Integer> ids = Arrays.asList(101, 102, 103, 104, 105);

        // Создаем строку с текстом и id через запятую
        String idsText = "Id пользователей (" + ids.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")) + ")";
        System.out.println(idsText);

        // Создаем список id2 и добавляем в него несколько id из списка id
        List<Integer> ids2 = new ArrayList<>(Arrays.asList(102, 104));

        // Создаем строку с текстом и id через запятую, которые есть в ids2
        String ids2Text = "Id пользователей (" + ids.stream()
                .filter(ids2::contains)
                .map(String::valueOf)
                .collect(Collectors.joining(", ")) + ")";
        System.out.println(ids2Text);
    }
}
