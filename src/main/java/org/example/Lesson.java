package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson {
    private String title;
    private int price;
    public Lesson(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
        public List<Integer> filterPriceAfterThousand(List<Lesson> lessons) {
            return lessons.stream()
                    .map(Lesson::getPrice)
                    .filter(price -> price > 1000)
                    .collect(Collectors.toList());
    }
}
