package ru.aston.kovalevski_vv.task1.model;

public class Commuter extends Ticket{

    public Commuter(Integer id, User user, Integer cost) {
        super(id, user, cost);
        setDiscount();

    }

    @Override
    public void setDiscount() {
        if (getCost() >= 1000) {
            setCost((int) (getCost() * 0.9));
        }
    }

    @Override
    public int compareTo(Ticket o) {
        return this.getUser().getSurname().compareTo(o.getUser().getSurname());
    }
}