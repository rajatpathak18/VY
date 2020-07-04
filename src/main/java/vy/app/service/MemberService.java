package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vy.app.repository.MemberRepository;
import vy.app.model.Member;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    @Transactional
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> getMembers() {
//        return memberRepository.findAll();
        return memberRepository.getByName("test");
    }

    public Member getMember(int id) {
        Optional<vy.app.model.Member> memberOptional = memberRepository.findById(id);
        return memberOptional.get();
    }

    @Transactional
    public Member updateMember(int id, Member member) {
        memberRepository.save(member);
        return memberRepository.findById(id).get();
    }

    @Transactional
    public void deleteMember(int id) {
        memberRepository.deleteById(id);
    }
}
