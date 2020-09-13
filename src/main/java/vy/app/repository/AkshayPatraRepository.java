package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vy.app.model.AkshayPatra;
import vy.app.model.Designation;

public interface AkshayPatraRepository extends JpaRepository<AkshayPatra, Long> {
    @Query("SELECT CASE WHEN COUNT(ap) > 0 THEN true ELSE false END FROM AkshayPatra ap WHERE ap.akshayPatraNum = :akshayPatraNum")
    boolean existsByAkshayPatraNum(@Param("akshayPatraNum") String akshayPatraNum);
}
