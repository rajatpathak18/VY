package vy.app.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.compress.utils.IOUtils;
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

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Log4j2
@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

//    @GetMapping(value = "/report/member/")
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<StreamingResponseBody> getMembersReport() throws Exception {
//        log.info("getMembersReport: called");
////        return reportService.memberReport();
//        return ResponseEntity
//                .ok()
//                .contentType(MediaType.APPLICATION_OCTET_STREAM)
//                .header(HttpHeaders.CONTENT_DISPOSITION, "inline;filename=\"myfilename.xlsx\"")
//                .body(reportService.memberReport()::write);
//    }

    @GetMapping(value = "/report/member/")
    @ResponseStatus(HttpStatus.OK)
    public void downloadCsv(HttpServletResponse response) throws Exception {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=customers.xlsx");
        ByteArrayInputStream stream = reportService.memberReport();
        IOUtils.copy(stream, response.getOutputStream());
    }

}
