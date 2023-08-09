package api.api;

import api.api.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Controller
public class AuthApi {
//    @Autowired
//    AuthenticationManager authManager;
//    @Autowired
//    JwtTokenUtil jwtUtil;
//
//    @PostMapping("/auth/login")
//    public ResponseEntity<?> login(@RequestBody @Valid AuthRequest request) {
//
//        try {
//            Authentication authentication = authManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(
//                            request.getEmail(), request.getPassword())
//            );
//
//            User user = (User) authentication.getPrincipal();
//            String accessToken = jwtUtil.generateAccessToken(user);
//            AuthResponse response = new AuthResponse(user.getEmail(), accessToken);
//
//            return ResponseEntity.ok().body(response);
//
//        } catch (BadCredentialsException ex) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//    }



    ///////////////////////////// IN CASE OF NEEDING THIS, UNCOMMENT EVERYTHING BENEATH
//@Autowired
//private JwtTokenUtil tokenProvider;
//
//    @PostMapping("/auth/login")
//    public String login(@RequestBody User user, Model model) {
//        if (true) {
////            User user=new User();
////            user.setEmail(email);
////            user.setPassword(password);
//            String token = tokenProvider.generateAccessToken(user);
//            model.addAttribute("token", token);
//            System.out.println(token);
//            return "index";
//        } else {
//            model.addAttribute("error", "Invalid email or password");
//            return "login";
//        }
//    }
}
