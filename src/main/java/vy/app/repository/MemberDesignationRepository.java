package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vy.app.model.Designation;
import vy.app.model.MemberDesignation;
import vy.app.model.MemberDesignationID;

public interface MemberDesignationRepository extends JpaRepository<MemberDesignation, MemberDesignationID> {

}
