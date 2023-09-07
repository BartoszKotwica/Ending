package pl.coderslab.dao;
import pl.coderslab.entity.Payment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PaymentDAO {
    private Connection connection;

    public PaymentDAO() {
        this.connection = connection;
    }

    private static List<Payment> payments = new ArrayList<>();

    public List<Payment> getAllPayments() {
        return payments;
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }
}


