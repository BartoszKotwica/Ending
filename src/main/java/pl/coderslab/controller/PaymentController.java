package pl.coderslab.controller;

import pl.coderslab.dao.PaymentDAO;
import pl.coderslab.entity.Payment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/payments")
public class PaymentController extends HttpServlet {

    private PaymentDAO paymentDAO = new PaymentDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Payment> payments = paymentDAO.getAllPayments();

        req.setAttribute("payments", payments);
        req.getRequestDispatcher("/payments.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int payment_insert_id = Integer.parseInt(req.getParameter("payment_insert_id"));
        double items_total_price = Double.parseDouble(req.getParameter("items_total_price"));
        String status = req.getParameter("status");
        String description = req.getParameter("description");

        Payment payment = new Payment(generatePayment_id(), payment_insert_id, items_total_price, status, description);
        payment.setPayment_id(generatePayment_id());
        payment.setPayment_insert_id(payment_insert_id);
        payment.setItems_total_price(items_total_price);
        payment.setStatus(status);
        payment.setDescription(description);

        paymentDAO.addPayment(payment);

        resp.sendRedirect(req.getContextPath() + "/paymentSuccess.jsp");
    }
    private int generatePayment_id() {
        return (int) (Math.random() * 10000);
    }
}
