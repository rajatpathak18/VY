package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vy.app.model.Designation;
import vy.app.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
