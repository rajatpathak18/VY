package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vy.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
