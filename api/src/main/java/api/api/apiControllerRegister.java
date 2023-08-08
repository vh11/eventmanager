package api.api;
import api.api.Model.User;
import api.api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Date;
import java.time.LocalDate;

@Controller
public class apiControllerRegister{

    @Autowired
    UserRepository repo;

    @GetMapping(value="/auth/register")
    public String getRegisterPAge(Model model) {
        model.addAttribute("user", new User());
        return "/auth/register";
    }

    @PostMapping("/process_register")
    public String processRegistration(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        LocalDate localDate = LocalDate.now();
        user.setCreation_date(Date.valueOf(localDate));
        repo.save(user);

        return "login";
    }

}