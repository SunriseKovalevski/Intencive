package ru.aston.kovalevski_vv.task1.model;

public abstract class Ticket {
    private User user;
    private Integer cost;
    private Integer discount;

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

    public Integer getDiscount() {
        return discount;
    }

    public abstract void setDiscount(Integer discount);
}