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
		if (member.getUpdeshtaMemberID() != null) {
		    try {
                Member updeshtaMember = memberRepository.findById(member.getUpdeshtaMemberID()).get();
                if (isUpdeshta(updeshtaMember)){
                    throw Exceptions.InvalidUpdeshtaMemberIDException;
                }
            }catch (Exception e){
                throw Exceptions.InvalidUpdeshtaMemberIDException;
            }
		}

        if (member.getUpdeshtaMemberID() != null ){
            member.setUpdeshtaName(getMemberNameFromMemberID(member.getUpdeshtaMemberID()));
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

	private String getMemberNameFromMemberID(Long memberID) {
		Member memberDetail = memberRepository.findById(memberID).get();
		StringBuilder sb = new StringBuilder();
		sb.append(memberDetail.getFirstName());
		if (memberDetail.getMiddleName() != null)
			sb.append(" ").append(memberDetail.getMiddleName());
		if (memberDetail.getLastName() != null)
			sb.append(" ").append(memberDetail.getLastName());

		return sb.toString();
	}

	// TODO : Check if updeshta member is really updeshta
	private boolean isUpdeshta(Member member){
        for (MemberDesignation md : member.getMemberDesignations()){
            if (md.getDesignation().getDesignationName().equals("Updeshta")){
                return true;
            }
        }
        return false;
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

        if (member.getUpdeshtaMemberID() == null && member.getUpdeshtaName() == null) {
            throw Exceptions.UpdeshtaMemberIDOrUpdeshtaNameNotExistException;
        }

        // check if the updeshta member id is valid
        if (member.getUpdeshtaMemberID() != null) {
            try {
                Member updeshtaMember = memberRepository.findById(member.getUpdeshtaMemberID()).get();
                if (isUpdeshta(updeshtaMember)){
                    throw Exceptions.InvalidUpdeshtaMemberIDException;
                }
            }catch (Exception e){
                throw Exceptions.InvalidUpdeshtaMemberIDException;
            }
        }

        // TODO:Akshay Patra validation, insertions and updation

        if (memberFromDB.getAddress() != null) {
            memberFromDB.getAddress().setAddressLine1(member.getAddress().getAddressLine1());
            memberFromDB.getAddress().setAddressLine2(member.getAddress().getAddressLine2());
            memberFromDB.getAddress().setCity(member.getAddress().getCity());
            memberFromDB.getAddress().setState(member.getAddress().getState());
            memberFromDB.getAddress().setPostalCode(member.getAddress().getPostalCode());
            memberFromDB.getAddress().setCountry(member.getAddress().getCountry());
            memberFromDB.getAddress().setLandmark(member.getAddress().getLandmark());
            memberFromDB.getAddress().setAlternateAddressLine1(member.getAddress().getAlternateAddressLine1());
            memberFromDB.getAddress().setAlternateAddressLine2(member.getAddress().getAlternateAddressLine2());
            memberFromDB.getAddress().setAlternateCity(member.getAddress().getAlternateCity());
            memberFromDB.getAddress().setAlternateState(member.getAddress().getAlternateState());
            memberFromDB.getAddress().setAlternateCountry(member.getAddress().getAlternateCountry());
            memberFromDB.getAddress().setAlternatePostalCode(member.getAddress().getAlternatePostalCode());
            memberFromDB.getAddress().setAlternateLandmark(member.getAddress().getAlternateLandmark());
        } else {
            memberFromDB.setAddress(member.getAddress());
        }

        if (memberFromDB.getEmail() != null) {
            memberFromDB.getEmail().setEmailAddress1(member.getEmail().getEmailAddress1());
            memberFromDB.getEmail().setEmailAddress2(member.getEmail().getEmailAddress2());
        } else {
            memberFromDB.setEmail(member.getEmail());
        }

        memberFromDB.setFirstName(member.getFirstName());
        memberFromDB.setMiddleName(member.getMiddleName());
        memberFromDB.setLastName(member.getLastName());
        memberFromDB.setDateOfBirth(member.getDateOfBirth());
        memberFromDB.setGender(member.getGender());
        memberFromDB.setMotherName(member.getMotherName());
        memberFromDB.setFatherName(member.getFatherName());
        memberFromDB.setPrimaryPhoneNumber(member.getPrimaryPhoneNumber());
        memberFromDB.setAlternatePhoneNumber(member.getAlternatePhoneNumber());
        memberFromDB.setNationality(member.getNationality());

        if (memberFromDB.getMemberPhoto() != null){
            memberFromDB.getMemberPhoto().setFileAsBase64(member.getMemberPhoto().getFileAsBase64());
            memberFromDB.getMemberPhoto().setType(member.getMemberPhoto().getType());
        } else {
            memberFromDB.setMemberPhoto(member.getMemberPhoto());
        }

        memberFromDB.setAssociatedSince(member.getAssociatedSince());

        if (memberFromDB.getAkshayPatra() != null) {
            memberFromDB.getAkshayPatra().setAkshayPatraNum(member.getAkshayPatra().getAkshayPatraNum());
            memberFromDB.getAkshayPatra().setPatraAllocationDate(member.getAkshayPatra().getPatraAllocationDate());
        } else {
            memberFromDB.setAkshayPatra(member.getAkshayPatra());
        }

        memberFromDB.setProfession(member.getProfession());
        memberFromDB.setPracticeLevel(member.getPracticeLevel());
        memberFromDB.setSendEmail(member.isSendEmail());
        memberFromDB.setCallFlag(member.isCallFlag());
        memberFromDB.setSms(member.isSms());
        memberFromDB.setPatrikaSubscribed(member.isPatrikaSubscribed());
        memberFromDB.setHasSwarved(member.isHasSwarved());

        if (member.getUpdeshtaMemberID() != null ){
            memberFromDB.setUpdeshtaMemberID(member.getUpdeshtaMemberID());
            memberFromDB.setUpdeshtaName(getMemberNameFromMemberID(member.getUpdeshtaMemberID()));
        } else if (member.getUpdeshtaName() != null){
            memberFromDB.setUpdeshtaName(memberFromDB.getUpdeshtaName());
        }
        memberFromDB.setUpdeshVenue(member.getUpdeshVenue());
        memberFromDB.setCreateSource(member.getCreateSource());
        memberFromDB.setUpdateSource(member.getUpdateSource());
        return memberRepository.save(memberFromDB);
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
