package com.java11.service;

import java.util.List;

public class ListToArray {

    public static void main(String[] args) {
        List<String> list = List.of("List", "to", "Array");
        String[] listAray = list.toArray(new String[0]);

        for (String item : listAray) {
            System.out.println(item);
        }
    }
}
