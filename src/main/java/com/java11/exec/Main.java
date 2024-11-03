package com.java11.exec;

import com.java11.service.Service;
import com.java11.service.http.HttpClientService;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        service.getListItems();
        HttpClientService clientService = new HttpClientService();
        clientService.sendHttpRequest();
    }
}