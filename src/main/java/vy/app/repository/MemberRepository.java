package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import vy.app.model.Member;

import java.util.Date;
import java.util.List;

public interface MemberRepository extends PagingAndSortingRepository<Member, Long>, JpaSpecificationExecutor<Member> {
    //SELECT * from vy_member as m where m.last_name like '%singh%' or m.first_name LIKE '%singh%' or m.middle_name LIKE '%singh%'
//    @Query("select m from Member m where m.firstName like concat('%', lower(?1), '%') or m.middleName like concat('%', lower(?1), '%') or m.lastName like concat('%', lower(?1), '%')")
//    List<Member> getByName(String name);
    List<Member> findByMemberDesignations_Designation_DesignationName(String designationName);

    Member findByMemberID(Long updeshtaMemberID);


    @Query("select m.updeshtaMemberID, u.firstName, u.middleName, u.lastName, count(m.memberID) from Member m inner join Member u on m.updeshtaMemberID=u.memberID where m.associatedSince between ?1 and ?2 group by m.updeshtaMemberID, u.firstName, u.middleName, u.lastName")
    List<Object[]> getUpdeshSummaryByAssociatedSince(Date start, Date end);

    @Query("select m.updeshtaMemberID, u.firstName, u.middleName, u.lastName, count(m.memberID) from Member m inner join Member u on m.updeshtaMemberID=u.memberID where m.updeshtaMemberID=?1 AND m.associatedSince between ?2 and ?3 group by m.updeshtaMemberID, u.firstName, u.middleName, u.lastName")
    List<Object[]> getUpdeshSummaryByAssociatedSinceAndUpdeshtamemberID(Long updeshtaMemberID, Date start, Date end);

//    List<Object[]> findByAssociatedSinceBetweenAndUpdeshtaID(Date start, Date end);
}
