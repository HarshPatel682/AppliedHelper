package com.example.patel.appliedhelper;

public class Company {
    private int id;
    private String name;
    private String date_applied;
    private String status;

    public Company(int id, String name, String date_applied, String status) {
        this.id = id;
        this.name = name;
        this.date_applied = date_applied;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_applied() {
        return date_applied;
    }

    public void setDate_applied(String date_applied) {
        this.date_applied = date_applied;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
