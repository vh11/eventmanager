package api.api.Repository;


import api.api.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Long countById(Integer id);

    Optional<User> findByEmail(String email);

    User findUserByEmail(String email);
}
