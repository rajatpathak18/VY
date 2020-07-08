package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vy.app.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
  Optional<User> findByUsername(String username);
}
