package api.api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiControllerRegister{

    @RequestMapping(value="/Register")
    public static String Welcome() {
        return "Register";
    }

}
