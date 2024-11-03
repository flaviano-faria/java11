package com.java11.service;

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
}
