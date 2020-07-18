package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import vy.app.model.MemberDesignation;
import vy.app.repository.DesignationRepository;
import vy.app.repository.MemberDesignationRepository;
import vy.app.repository.MemberRepository;
import vy.app.model.Member;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private DesignationRepository designationRepository;

    @Autowired
    private MemberDesignationRepository memberDesignationRepository;

    @Transactional
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public Page<Member> getMembers(Specification<Member> spec, Pageable pageable) {
        return memberRepository.findAll(spec, pageable);
    }


    public Member getMember(Long id) {
        Optional<vy.app.model.Member> memberOptional = memberRepository.findById(id);
        return memberOptional.get();
    }

    @Transactional
    public Member updateMember(Long id, Member member) {
        member.setMemberID(id);
        memberRepository.save(member);
        return memberRepository.findById(id).get();
    }

    @Transactional
    public Member createMemberDesignation(Long memberID, Member member) {
        Member existingMember = memberRepository.findById(memberID).get();
        existingMember.setMemberDesignations(member.getMemberDesignations());
        return memberRepository.save(existingMember);
    }


    @Transactional
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
