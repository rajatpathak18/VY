package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import vy.app.Exception.Exceptions;
import vy.app.model.Designation;
import vy.app.model.MemberDesignation;
import vy.app.pojo.UpdeshSummaryDto;
import vy.app.repository.AkshayPatraRepository;
import vy.app.repository.DesignationRepository;
import vy.app.repository.MemberDesignationRepository;
import vy.app.repository.MemberRepository;
import vy.app.model.Member;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private AkshayPatraRepository akshayPatraRepository;

    @Autowired
    private DesignationRepository designationRepository;

    @Autowired
    private MemberDesignationRepository memberDesignationRepository;

    @Transactional
    public Member createMember(Member member) throws Exception {
    	//check for updeshmemberid or updeshta name
		if (member.getUpdeshtaMemberID() == null && member.getUpdeshtaName() == null) {
			throw Exceptions.UpdeshtaMemberIDOrUpdeshtaNameNotExistException;
		}
		
         // check if the updeshta member id is valid
		if (member.getUpdeshtaMemberID() != null && !memberRepository.existsById(member.getUpdeshtaMemberID())) {
			throw Exceptions.InvalidUpdeshtaMemberIDException;
		}

		if (member.getUpdeshtaName() == null) {
			member.setUpdeshtaName(createUpdeshtaName(member));
		}
        
        // check if akshay patra num is unique
        if (member.getAkshayPatra() != null) {
            if (member.getAkshayPatra().getAkshayPatraNum() != null) {
                if (akshayPatraRepository.existsByAkshayPatraNum(member.getAkshayPatra().getAkshayPatraNum())) {
                    throw Exceptions.DuplicateAkshayPatraNumException;
                }
            }
        }
        return memberRepository.save(member);
    }

	private String createUpdeshtaName(Member member) {
		Member memberDetail = memberRepository.findByMemberID(member.getUpdeshtaMemberID());
		StringBuilder sb = new StringBuilder();
		sb.append(memberDetail.getFirstName());
		if (memberDetail.getMiddleName() != null)
			sb.append(" ").append(memberDetail.getMiddleName());
		if (memberDetail.getLastName() != null)
			sb.append(" ").append(memberDetail.getLastName());

		return sb.toString();
	}

    public Page<Member> getMembers(Specification<Member> spec, Pageable pageable) {
        return memberRepository.findAll(spec, pageable);
    }

    public List<Member> getMembers(Specification<Member> spec) {
        return memberRepository.findAll(spec);
    }

    public List<Member> getUpdeshtaMemberList() {
        List<Member> members = new ArrayList<>();
        return memberRepository.findByMemberDesignations_Designation_DesignationName("updeshta");
    }

    public Member getMember(Long id) throws Exception {
        if (!memberRepository.existsById(id)) {
            throw Exceptions.MemberDoesNotExistException;
        }
        return memberRepository.findById(id).get();
    }

    @Transactional
    public Member updateMember(Long id, Member member) throws Exception {
        if (!memberRepository.existsById(id)) {
            throw Exceptions.MemberDoesNotExistException;
        }
        Member memberFromDB = memberRepository.findById(id).get();
        member.setMemberID(id);
        member.setCreatedAt(memberFromDB.getCreatedAt());
        return memberRepository.save(member);
    }

    @Transactional
    public void deleteMember(Long id) throws Exception {
        if (!memberRepository.existsById(id)) {
            throw Exceptions.MemberDoesNotExistException;
        }
        memberRepository.deleteById(id);
    }

    @Transactional
    public List<UpdeshSummaryDto> getUpdeshSummary(Long updeshtaMemberID, String associatedAfter, String associatedBefore) throws Exception{
        List<Object[]> objects;

        if (updeshtaMemberID != null){
            objects = memberRepository.getUpdeshSummaryByAssociatedSinceAndUpdeshtamemberID(updeshtaMemberID, new SimpleDateFormat("yyyy-MM-dd").parse(associatedAfter), new SimpleDateFormat("yyyy-MM-dd").parse(associatedBefore));
        } else {
            objects = memberRepository.getUpdeshSummaryByAssociatedSince(new SimpleDateFormat("yyyy-MM-dd").parse(associatedAfter), new SimpleDateFormat("yyyy-MM-dd").parse(associatedBefore));
        }

        List<UpdeshSummaryDto> updeshSummaryDtos = new ArrayList<>();
        for (Object[] obj: objects){
            UpdeshSummaryDto updeshSummaryDto = new UpdeshSummaryDto((Long)obj[0], (String)obj[1], (String)obj[2], (String)obj[3], (String)obj[4], (String)obj[5], (String)obj[6], (Long)obj[7]);
            updeshSummaryDtos.add(updeshSummaryDto);
        }
        return updeshSummaryDtos;
    }
}
