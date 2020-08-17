package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import vy.app.model.Member;

import java.util.List;

public interface MemberRepository extends PagingAndSortingRepository<Member, Long>, JpaSpecificationExecutor<Member> {
    //SELECT * from vy_member as m where m.last_name like '%singh%' or m.first_name LIKE '%singh%' or m.middle_name LIKE '%singh%'
//    @Query("select m from Member m where m.firstName like concat('%', lower(?1), '%') or m.middleName like concat('%', lower(?1), '%') or m.lastName like concat('%', lower(?1), '%')")
//    List<Member> getByName(String name);
    List<Member> findByMemberDesignations_Designation_DesignationName(String designationName);
}
