package ru.aston.kovalevski_vv.task1;

import ru.aston.kovalevski_vv.task1.model.Ticket;

import java.util.ArrayList;
import java.util.Collections;

public class TicketsList {

    private ArrayList<Ticket> ticketList = new ArrayList<>();

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(ArrayList<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public void printTicketList() {
        if (ticketList != null && !ticketList.isEmpty())
            ticketList.forEach(System.out::println);
    }

    public Integer getTotalCost() {
        Integer totalCost = 0;
        if (ticketList != null) {
            for (Ticket ticket : ticketList) {
                totalCost += ticket.getCost();
            }
        }
            return totalCost;
    }

    public void printSortedBySurname() {
        if (ticketList != null) {
            Collections.sort(ticketList);
            ticketList.forEach(System.out::println);
        }
    }
}
