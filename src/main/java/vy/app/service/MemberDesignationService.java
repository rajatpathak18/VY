package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vy.app.Exception.APIException;
import vy.app.Exception.Exceptions;
import vy.app.model.MemberDesignation;
import vy.app.model.MemberDesignationID;
import vy.app.repository.DesignationRepository;
import vy.app.repository.MemberDesignationRepository;
import vy.app.repository.MemberRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MemberDesignationService {
    @Autowired
    private MemberDesignationRepository memberDesignationRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private DesignationRepository designationRepository;

    @Transactional
    public MemberDesignation createMemberDesignation(MemberDesignation memberDesignation) throws Exception {
        if (memberDesignationRepository.existsById(memberDesignation.getMemberDesignationID())) {
            throw Exceptions.MemberDesignationAlreadyExists;
        }
        if (!designationRepository.existsById(memberDesignation.getMemberDesignationID().getDesignationID())) {
            throw Exceptions.DesignationIDDoesNotExistException;
        }
        if (!memberRepository.existsById(memberDesignation.getMemberDesignationID().getMemberID())) {
            throw Exceptions.MemberDoesNotExistException;
        }
        memberDesignation.setDesignation(designationRepository.findById(memberDesignation.getMemberDesignationID().getDesignationID()).get());
        memberDesignation.setMember(memberRepository.findById(memberDesignation.getMemberDesignationID().getMemberID()).get());
        return memberDesignationRepository.save(memberDesignation);
    }

    public List<MemberDesignation> getMemberDesignations() {
        return memberDesignationRepository.findAll();
    }

    public MemberDesignation getMemberDesignation(MemberDesignationID id) throws Exception {
        if (!memberDesignationRepository.existsById(id)) {
            throw Exceptions.MemberDesignationDoesNotExist;
        }
        Optional<MemberDesignation> memberDesignationOptional = memberDesignationRepository.findById(id);
        return memberDesignationOptional.get();
    }

    @Transactional
    public MemberDesignation updateMemberDesignation(MemberDesignationID id, MemberDesignation memberDesignation) throws Exception {
        if (!memberDesignationRepository.existsById(id)) {
            throw Exceptions.MemberDesignationDoesNotExist;
        }
        memberDesignation.setMemberDesignationID(id);
        memberDesignationRepository.save(memberDesignation);
        return memberDesignationRepository.findById(id).get();
    }

    @Transactional
    public void deleteMemberDesignation(MemberDesignationID id) throws Exception {
        if (!memberDesignationRepository.existsById(id)) {
            throw Exceptions.MemberDesignationDoesNotExist;
        }
        memberDesignationRepository.deleteById(id);
    }
}
