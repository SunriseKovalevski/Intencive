package ru.aston.kovalevski_vv.task1.model;

public abstract class Ticket {
    User user;
    Integer cost;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    Integer discount;

    public Integer getDiscount() {
        return discount;
    }

    public abstract void setDiscount(Integer discount);
}
