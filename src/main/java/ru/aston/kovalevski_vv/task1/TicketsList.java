package ru.aston.kovalevski_vv.task1;

import ru.aston.kovalevski_vv.task1.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketsList {

    private ArrayList<Ticket> ticketList = new ArrayList<>();

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(ArrayList<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public void printTicketList() {
        ticketList.forEach(System.out::println);
    }

    public Integer getTotalCost() {
        Integer totalCost = 0;
        for (Ticket ticket : ticketList) {
            totalCost += ticket.getCost();
        }
        return totalCost;
    }
}
