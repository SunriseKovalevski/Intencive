package ru.aston.kovalevski_vv.task1.model;

public class International extends  Ticket{
    public International(Integer id, User user, int cost) {
        super(id, user, cost);
        setDiscount();
    }

    @Override
    public void setDiscount() {
        if (getCost() >= 5000) {
            setCost((int) (getCost() * 0.95));
        }
    }

    @Override
    public int compareTo(Ticket o) {
        return this.getUser().getSurname().compareTo(o.getUser().getSurname());
    }

    @Override
    public String toString() {
        return "Ticket:   " + this.getId() +
                " Name:    " + this.getUser().getName() +
                " Surname: " + this.getUser().getSurname() +
                " Cost:    " + this.getCost();
    }
}