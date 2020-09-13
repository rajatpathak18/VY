package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vy.app.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
