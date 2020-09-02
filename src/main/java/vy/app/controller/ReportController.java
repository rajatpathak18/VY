package vy.app.controller;

import lombok.extern.log4j.Log4j2;
import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Conjunction;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Or;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.apache.commons.compress.utils.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import vy.app.model.Member;
import vy.app.pojo.MemberDetailsDto;
import vy.app.pojo.ReportDto;
import vy.app.service.ReportService;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Log4j2
@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping(value = "/report/member/")
    @ResponseStatus(HttpStatus.OK)
    public void downloadCsv(
            @Join(path = "memberDesignations", alias = "md")
            @Conjunction({
                    @Or(@Spec(path = "memberID", params = "memberID", spec = Equal.class)),
                    @Or(@Spec(path = "firstName", params = "firstName", spec = LikeIgnoreCase.class)),
                    @Or(@Spec(path = "middleName", params = "middleName", spec = LikeIgnoreCase.class)),
                    @Or(@Spec(path = "lastName", params = "lastName", spec = LikeIgnoreCase.class)),
                    @Or(@Spec(path = "email.emailAddress1", params = "email", spec = LikeIgnoreCase.class)),
                    @Or({@Spec(path = "address.country", params = "country", spec = LikeIgnoreCase.class),
                            @Spec(path = "address.alternateCountry", params = "country", spec = LikeIgnoreCase.class)}),
                    @Or({@Spec(path = "address.state", params = "state", spec = LikeIgnoreCase.class),
                            @Spec(path = "address.alternateState", params = "state", spec = LikeIgnoreCase.class)}),
                    @Or({@Spec(path = "address.city", params = "city", spec = LikeIgnoreCase.class),
                            @Spec(path = "address.alternateCity", params = "city", spec = LikeIgnoreCase.class)}),
                    @Or(@Spec(path = "md.designation.designationName", params = "designation", spec = LikeIgnoreCase.class)),
                    @Or(@Spec(path = "updeshtaMemberID", params = "updeshtaMemberID", spec = Equal.class)),
                    @Or(@Spec(path = "associatedSince", params = {"associatedAfter", "associatedBefore"}, spec = Between.class)),
                    @Or({@Spec(path = "primaryPhoneNumber", params = "phNumber", spec = Like.class),
                            @Spec(path = "alternatePhoneNumber", params = "phNumber", spec = Like.class)})
            }) Specification<Member> spec, HttpServletResponse response) throws Exception {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=customers.xlsx");
        ByteArrayInputStream stream = reportService.memberReport(spec);
        IOUtils.copy(stream, response.getOutputStream());
    }

}
