package pl.coderslab.entity;

import java.math.BigDecimal;

public class Payment {
    private int payment_id;
    private int payment_insert_id;
    private double items_total_price;
    private String status;
    private String description;
    public Payment(int payment_id, int payment_insert_id, double items_total_price, String status, String description) {
        this.payment_id = payment_id;
        this.payment_insert_id = payment_insert_id;
        this.items_total_price = items_total_price;
        this.status = status;
        this.description = description;
    }
    public int getPayment_id() {
        return payment_id;
    }
    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }
    public int getPayment_insert_id() {
        return payment_insert_id;
    }
    public void setPayment_insert_id(int payment_insert_id) {
        this.payment_insert_id = payment_insert_id;
    }
    public double getItems_total_price() {
        return items_total_price;
    }
    public void setItems_total_price(double items_total_price) {
        this.items_total_price = items_total_price;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
