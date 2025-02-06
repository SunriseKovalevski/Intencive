package ru.aston.kovalevski_vv.task1.model;

public class Commuter extends Ticket{

    public Commuter(Integer id, User user, Integer cost, Integer discount) {
        super(id, user, cost);
        setDiscount();

    }

    @Override
    public void setDiscount() {
        if (getCost() >= 1000) {
            setCost((int) (getCost() * 0.9));
        }
    }
}