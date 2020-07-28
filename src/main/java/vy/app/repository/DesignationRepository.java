package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vy.app.model.Designation;
import vy.app.model.User;

public interface DesignationRepository extends JpaRepository<Designation, Long> {
    @Query("SELECT CASE WHEN COUNT(d) > 0 THEN true ELSE false END FROM Designation d WHERE d.designationName = :designationName")
    boolean existsByDesignationName(@Param("designationName") String designationName);
}
