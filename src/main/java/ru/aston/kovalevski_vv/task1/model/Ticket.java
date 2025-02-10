package ru.aston.kovalevski_vv.task1.model;

public abstract class Ticket implements Comparable<Ticket>{

    private Integer id;
    private User user;
    private Integer cost;
    private Integer discount;

    public Ticket(Integer id, User user, Integer cost) {
        this.id = id;
        this.user = user;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public abstract void setDiscount();
}