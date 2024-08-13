package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
private String name;
    private int age;
    private String title;
 */
public class Main {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("Большакова", 50, List.of("Математика", "Алгебра", "Геометрия", "Информатика", "Экономика"));
        Teacher teacher2=new Teacher("Полякова", 47, List.of("Окружающий мир", "Природоведение", "География", "Биология", "Физика"));
        Teacher teacher3=new Teacher("Агеева", 56, List.of("Химия", "Основы безопасности жизнедеятельности", "Труд", "Псхилогия", "Физукультура"));
        Teacher teacher4=new Teacher("Шарапин", 78, List.of("Шахматы", "Волейбол", "Настольный теннис", "Футбол", "Баскетбол"));
        Teacher teacher5=new Teacher("Морозова", 78, List.of("Русский язык", "Литература", "Английский язык", "Иностранный язык", "Родной язык"));
        Teacher teacher6=new Teacher("Токмакова", 56, List.of("История", "Естествознание", "Астрономия", "Экология", "Право"));
        Teacher teacher7=new Teacher("Лаврова", 50, List.of("Музыка", "ИЗО", "Искусство", "Мировая художественная культура", "Краеведение"));

        Lesson lesson1=new Lesson("алгебра", 800);
        Lesson lesson2=new Lesson("английский язык", 900);
        Lesson lesson3=new Lesson("астрономия", 800);
        Lesson lesson4=new Lesson("баскетбол", 600);
        Lesson lesson5=new Lesson("биология", 800);
        Lesson lesson6=new Lesson("волейбол", 700);
        Lesson lesson7=new Lesson("география", 600);
        Lesson lesson8=new Lesson("геометрия", 800);
        Lesson lesson9=new Lesson("естествознание", 500);
        Lesson lesson10=new Lesson("изо", 600);
        Lesson lesson11=new Lesson("иностранный язык", 900);
        Lesson lesson12=new Lesson("информатика", 1200);
        Lesson lesson13=new Lesson("искусство", 500);
        Lesson lesson14=new Lesson("история", 800);
        Lesson lesson15=new Lesson("краеведение", 500);
        Lesson lesson16=new Lesson("литература", 900);
        Lesson lesson17=new Lesson("математика", 1000);
        Lesson lesson18=new Lesson("мировая художественная культура", 800);
        Lesson lesson19=new Lesson("музыка", 500);
        Lesson lesson20=new Lesson("настольный теннис", 600);
        Lesson lesson21=new Lesson("окружающий мир", 800);
        Lesson lesson22=new Lesson("основы безопасности жизнедеятельности", 500);
        Lesson lesson23=new Lesson("право", 800);
        Lesson lesson24=new Lesson("природоведение", 600);
        Lesson lesson25=new Lesson("псхилогия", 800);
        Lesson lesson26=new Lesson("родной язык", 800);
        Lesson lesson27=new Lesson("русский язык", 800);
        Lesson lesson28=new Lesson("труд", 950);
        Lesson lesson29=new Lesson("физика", 800);
        Lesson lesson30=new Lesson("физукультура", 800);
        Lesson lesson31=new Lesson("футбол", 800);
        Lesson lesson32=new Lesson("химия", 800);
        Lesson lesson33=new Lesson("шахматы", 800);
        Lesson lesson34=new Lesson("экология", 500);
        Lesson lesson35=new Lesson("экономика", 800);

        List<Lesson> lessons = new ArrayList<>(Arrays.asList(
                lesson1, lesson2, lesson3, lesson4, lesson5, lesson6, lesson7, lesson8, lesson9, lesson10,
                lesson11, lesson12, lesson13, lesson14, lesson15, lesson16, lesson17, lesson18, lesson19, lesson20,
                lesson21, lesson22, lesson23, lesson24, lesson25, lesson26, lesson27, lesson28, lesson29, lesson30,
                lesson31, lesson32, lesson33, lesson34, lesson35));

        // Выводим отфильтрованные цены
        System.out.println(filterPriceAfterThousand(lessons));//ошибка

        List<Teacher> teachers = List.of(teacher1, teacher2, teacher3, teacher4, teacher5, teacher6, teacher7);//вывод всех предметов

        List<List<String>> list = teachers.stream().map(teacher -> teacher.getTitle())
                .toList();


        List<String> title = teachers.stream()
                .flatMap(teacher -> teacher.getTitle().stream())
                .map(e -> e.toLowerCase())//приводит к нижнему регистру весь лист и только потом формирует список
                .distinct()
                .toList();
        System.out.println(title);


        List<String> list1 = teachers.stream()
             .flatMap(user -> user.getTitle().stream())//получаем все листы юзеров
             .map(e -> e)
             .map(e -> e.toLowerCase())
                .distinct()//откидываем все дубли записей
                .sorted() // сортируем список, чтобы индексация была последовательной в алфавитном порядке
                .toList();

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Предмет " + (i + 1) + " " + list1.get(i));//выводим индексацию предметов
        }

    }
}
