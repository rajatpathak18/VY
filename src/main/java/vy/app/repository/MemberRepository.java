package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vy.app.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
