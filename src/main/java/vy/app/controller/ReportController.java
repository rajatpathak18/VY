package vy.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import vy.app.pojo.MemberDetailsDto;
import vy.app.pojo.ReportDto;
import vy.app.service.ReportService;

@Log4j2
@RestController
public class ReportController {

    @Autowired
    ReportService reportService;

    @GetMapping(value = "/report/member/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<StreamingResponseBody> getMembersReport() throws Exception {
        log.info("getMembersReport: called");
//        return reportService.memberReport();
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline;filename=\"myfilename.xlsx\"")
                .body(reportService.memberReport()::write);
    }

}
