package com.oti.web;

import com.oti.server.Server;

public class Web {

    public static void main(String[] args) {
        Server server = new Server();
        System.out.println(server.getMessage());
    }
}
