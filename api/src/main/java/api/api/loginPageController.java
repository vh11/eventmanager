package api.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginPageController {

    @GetMapping(value = "/Login")
    public String ShowLoginPage()
    {
        return "login_page";
    }
}
