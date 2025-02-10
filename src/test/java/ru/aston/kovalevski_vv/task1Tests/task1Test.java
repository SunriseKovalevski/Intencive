package ru.aston.kovalevski_vv.task1Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.aston.kovalevski_vv.task1.TicketsList;
import ru.aston.kovalevski_vv.task1.model.Commuter;
import ru.aston.kovalevski_vv.task1.model.International;
import ru.aston.kovalevski_vv.task1.model.User;

public class task1Test {

    protected TicketsList ticketsList = new TicketsList();

    @BeforeEach
    public void setUp() {
        User user1 = new User(10, "Ivan", "Ivanovich");
        User user2 = new User(50, "Petr", "Petrovich");
        User user3 = new User(70, "Fedr", "Fedorovich");
        User user4 = new User(55, "Igor", "Igorievich");
        User user5 = new User(40, "Egor", "Egorovich");

        Commuter ticket1 = new Commuter(10001, user1,10);
        Commuter ticket2 = new Commuter(10002, user2,1200);
        Commuter ticket3 = new Commuter(10003, user3,100);

        International ticket4 = new International(10004, user4,2200);
        International ticket5 = new International(10005, user5,5200);

        ticketsList.getTicketList().add(ticket1);
        ticketsList.getTicketList().add(ticket2);
        ticketsList.getTicketList().add(ticket3);
        ticketsList.getTicketList().add(ticket4);
        ticketsList.getTicketList().add(ticket5);
    }

    @Test
    public void totalCostTest() {
        System.out.println(ticketsList.getTotalCost());
    }

    @Test
    public void printSortedListTest() {
        ticketsList.printTicketList();
        ticketsList.printSortedBySurname();
    }
}