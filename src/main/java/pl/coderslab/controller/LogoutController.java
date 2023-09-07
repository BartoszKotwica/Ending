package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class LogoutController {



    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        // Pobierz obiekt sesji, jeśli istnieje
        HttpSession session = request.getSession(false);
        if (session != null) {
            // Usuń sesję (wylogowanie użytkownika)
            session.invalidate();
        }
        // Przekierowanie na stronę wylogowania
        return "logout";
    }
}
