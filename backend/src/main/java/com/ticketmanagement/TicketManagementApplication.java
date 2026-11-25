package com.ticketmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketManagementApplication {

    public static void main(String[] args) {
        System.out.println("Ticket Management Application : Branch Release Master");
        SpringApplication.run(TicketManagementApplication.class, args);
    }
}
