package Controllers;

import api.api.excepton.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import api.api.Service.*;
import api.api.Model.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class userController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) throws UserNotFoundException {
        return ResponseEntity.ok(userService.get(id));
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User updatedUser) throws UserNotFoundException {
        User user = userService.get(id)
                ;
        user.setEmail(updatedUser.getEmail());
        user.setPassword(updatedUser.getPassword());
        user.setUsername(updatedUser.getUsername());
        userService.update(id, user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Integer id) throws UserNotFoundException {
        User user = userService.get(id)
                ;
        userService.delete(id)
        ;
        return ResponseEntity.ok(user);
    }
}