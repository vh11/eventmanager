package api.api;
import toJsonConverters.userDataToJsonConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiControllerAuthentication {

    @RequestMapping(value="/Auth")
    public static String Welcome() {
        userDataToJsonConverter userDataToJsonConverter=new userDataToJsonConverter();

        return userDataToJsonConverter.convertUserDataToJson("crisan.mihai420@gmail.com","mihaicr3");
    }

}
