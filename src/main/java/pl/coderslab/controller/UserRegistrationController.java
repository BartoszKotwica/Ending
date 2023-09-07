package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.entity.User;
import pl.coderslab.repositories.UserRepository;



@Controller
public class UserRegistrationController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping("/register")
    public String processRegistration(@RequestParam("first_name") String firstName,
                                      @RequestParam("last_name") String lastName,
                                      @RequestParam("user_name") String userName,
                                      @RequestParam("email") String email,
                                      @RequestParam("password") String password,
                                      Model model) {

        User user = new User();
        user.setFirst_name(firstName);
        user.setLast_name(lastName);
        user.setUser_name(userName);
        user.setEmail(email);
        user.setPassword(password);

        UserRepository.save(user);

        return "registrationSuccess";
    }
}
