package vy.app.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import vy.app.model.Member;
import vy.app.repository.MemberRepository;

@Service
public class ReportService {
    @Autowired
    private MemberService memberService;

    public ByteArrayInputStream memberReport(Specification<Member> spec) throws Exception{
        // get list of members from member service
        List<Member> members = memberService.getMembers(spec);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try(Workbook workbook = new XSSFWorkbook()){
            Sheet sheet = workbook.createSheet("Members");

            Row row = sheet.createRow(0);
            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
            headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            // Creating header
            Cell cell = row.createCell(0);
            cell.setCellValue("S.No.");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(1);
            cell.setCellValue("Member Id");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(2);
            cell.setCellValue("National Identifier");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(3);
            cell.setCellValue("Name");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(4);
            cell.setCellValue("Father Name");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(5);
            cell.setCellValue("Mother Name");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(6);
            cell.setCellValue("Date of Birth");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(7);
            cell.setCellValue("Gender");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(8);
            cell.setCellValue("Address");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(9);
            cell.setCellValue("City");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(10);
            cell.setCellValue("State");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(11);
            cell.setCellValue("Pincode");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(12);
            cell.setCellValue("Contact no.");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(13);
            cell.setCellValue("Country");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(14);
            cell.setCellValue("Nationality");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(15);
            cell.setCellValue("Email-Id");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(16);
            cell.setCellValue("Member photo Path");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(17);
            cell.setCellValue("Id photo path");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(18);
            cell.setCellValue("ID Type");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(19);
            cell.setCellValue("Associated Since");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(20);
            cell.setCellValue("Profession");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(21);
            cell.setCellValue("Updestha");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(22);
            cell.setCellValue("Practicing Level");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(23);
            cell.setCellValue("Designation");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(24);
            cell.setCellValue("Has Akshay Patra?");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(25);
            cell.setCellValue("Akshay Patra No.");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(26);
            cell.setCellValue("Patrika Subscribed?");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(27);
            cell.setCellValue("Akshay Patra Allocation Date");
            cell.setCellStyle(headerCellStyle);

            // Creating data rows for each customer
            int rowNum=0, colNum = 27;
            for(Member m : members) {
                Row dataRow = sheet.createRow(++rowNum);
                dataRow.createCell(0).setCellValue(rowNum);
                dataRow.createCell(1).setCellValue(m.getMemberID());
                dataRow.createCell(2).setCellValue("NA");
                if (m.getMiddleName() != null){
                    dataRow.createCell(3).setCellValue((m.getFirstName() + " " + m.getMiddleName() + (m.getMiddleName().isEmpty()?"":" ") + m.getLastName()).trim());
                }else{
                    dataRow.createCell(3).setCellValue((m.getFirstName() + " " + m.getLastName()).trim());
                }
                dataRow.createCell(4).setCellValue(m.getFatherName());
                dataRow.createCell(5).setCellValue(m.getMotherName());
                dataRow.createCell(6).setCellValue((m.getDateOfBirth()!=null)?dateFormat.format(m.getDateOfBirth()):"NA");
                dataRow.createCell(7).setCellValue(m.getGender());
				dataRow.createCell(8).setCellValue((m.getAddress() != null) ? (m.getAddress().getAddressLine1()
						+ (m.getAddress().getAddressLine2() != null ? " " + m.getAddress().getAddressLine2() : ""))
						: "");
                dataRow.createCell(9).setCellValue((m.getAddress()!=null)?m.getAddress().getCity():"");
                dataRow.createCell(10).setCellValue((m.getAddress()!=null)?m.getAddress().getState():"");
                dataRow.createCell(11).setCellValue((m.getAddress()!=null)?m.getAddress().getPostalCode():"");
                dataRow.createCell(12).setCellValue((m.getAddress()!=null)?m.getPrimaryPhoneNumber():"");
                dataRow.createCell(13).setCellValue((m.getAddress()!=null)?m.getAddress().getCountry():"");
                dataRow.createCell(14).setCellValue("NA");
                dataRow.createCell(15).setCellValue((m.getEmail()!=null)?m.getEmail().getEmailAddress1():"");
                dataRow.createCell(16).setCellValue("NA");
                dataRow.createCell(17).setCellValue("NA");
                dataRow.createCell(18).setCellValue("NA");
                dataRow.createCell(19).setCellValue((m.getAssociatedSince()!=null)?dateFormat.format(m.getAssociatedSince()):"NA");
                dataRow.createCell(20).setCellValue(m.getProfession());
                dataRow.createCell(21).setCellValue(m.getUpdeshtaName());
                dataRow.createCell(22).setCellValue(m.getPracticeLevel());
                dataRow.createCell(23).setCellValue("NA");
                dataRow.createCell(24).setCellValue((m.getAkshayPatra()==null)?"No":"Yes");
                dataRow.createCell(25).setCellValue((m.getAkshayPatra()!=null)?m.getAkshayPatra().getAkshayPatraNum():"");
                dataRow.createCell(26).setCellValue((m.isPatrikaSubscribed())?"Yes":"No");
                dataRow.createCell(27).setCellValue((m.getAkshayPatra()!=null)?m.getAkshayPatra().getPatraAllocationDate().toString():"");
            }

            // Making size of column auto resize to fit with data
            for (int i=0; i<=colNum; i++){
                sheet.autoSizeColumn(i);
            }

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            workbook.write(outputStream);
            return new ByteArrayInputStream(outputStream.toByteArray());
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}