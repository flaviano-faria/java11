package com.java11.service;

import java.time.Clock;
import java.util.List;
import java.util.function.Consumer;

public class Service {

    public void getListItems(){
        List<String> list = List.of("10", "11", "12");

        // Using 'var' in lambda expression
        Consumer<String> consumer = (var item) -> {
            System.out.println(item);
        };

        list.forEach(consumer);
    }

    public void listToArray(){
        List<String> list = List.of("List", "to", "Array");
        String[] listAray = list.toArray(new String[0]);

        for (String item : listAray) {
            System.out.println(item);
        }
    }

    public void stripString(String value){
        System.out.println(value.strip());
    }

    public void trimString(String value){
        System.out.println(value.trim());
    }

    public void stripLeadingString(String value){
        System.out.println(value.stripLeading());
    }

    public void stripTailingString(String value){
        System.out.println(value.stripTrailing());
    }

    public void isBlankString(String value){
        System.out.println(value.isBlank());
    }

    public void repeatString(String value, int numberOfRepeats){
        System.out.println(value.repeat(numberOfRepeats));
    }

    public void linesString(String value){
        value.lines().forEach(s -> System.out.println(s));
    }
}
