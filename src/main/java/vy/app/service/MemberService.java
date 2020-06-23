package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vy.app.repository.MemberRepository;
import vy.app.model.Member;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    public Member getMember(int id) {
        Optional<vy.app.model.Member> memberOptional = memberRepository.findById(id);
        return memberOptional.get();
    }

    public Member updateMember(int id, Member member) {
        memberRepository.save(member);
        return memberRepository.findById(id).get();
    }

    public void deleteMember(int id) {
        memberRepository.deleteById(id);
    }
}
