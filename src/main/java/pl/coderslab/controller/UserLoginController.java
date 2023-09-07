package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.entity.User;
import pl.coderslab.dao.UserDao;
import pl.coderslab.repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserLoginController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
    @PostMapping("/login")
    public String processLogin(@RequestParam("user_name") String userName,
                               @RequestParam("password") String password,
                               Model model) {
        User user = (User) userRepository.findUserByUser_name(userName);
        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("user", user);
            return "welcome";
        } else {
            model.addAttribute("error", "Nieprawidłowe dane logowania.");
            return "login";
        }
    }
}
