package com.java11.exec;

import com.java11.service.Service;
import com.java11.service.http.HttpClientService;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        service.getListItems();
        HttpClientService clientService = new HttpClientService();
        clientService.sendHttpRequest();

        service.listToArray();
        service.stripString("   a 1 4 6 7");

        service.trimString("    3 5 6 7   ");
        service.stripLeadingString("    3 5 6 7   ");

        service.stripTailingString("    3 5 6 7   ");

        service.isBlankString("");

        service.repeatString("abc", 10);

        service.linesString("test\ntest2");
    }
}