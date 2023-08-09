package api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class TestController {
    @Autowired
    private JwtTokenUtil tokenProvider;
    @Autowired
    JwtTokenFilter tokenValidator;
    @GetMapping("/index"    )
    public String index(@RequestHeader(value = "Authorization") String token, Model model) {
        if (token != null && tokenProvider.validateAccessToken(token)) {
            model.addAttribute("user", tokenProvider.getSubject(token));
            return "index";
        } else {
            return "redirect:/login";
        }
    }
}