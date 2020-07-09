package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vy.app.model.Designation;
import vy.app.model.User;

public interface DesignationRepository extends JpaRepository<Designation, Long> {

}
