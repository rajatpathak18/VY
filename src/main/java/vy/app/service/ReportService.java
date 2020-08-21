package vy.app.service;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vy.app.Exception.Exceptions;
import vy.app.model.Designation;
import vy.app.pojo.ReportDto;
import vy.app.repository.DesignationRepository;

import javax.transaction.Transactional;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

@Service
public class ReportService {

    public Workbook memberReport() {
        Workbook workbook = new XSSFWorkbook();
        try {

            writeFinalData(workbook, "Data");
            //writing to excel file
            OutputStream fileOut = new FileOutputStream("excel.xlsx");
            workbook.write(fileOut);
        } catch (IOException c) {
            c.printStackTrace();
//            return new ReportDto("Failed", c.getMessage(), "No file created");
        }
        System.out.println("Report Generation Success");
//        return new ReportDto("Success", "URL to the filled excel file is in the path", "filename.xlsx");
        return workbook;
    }

    private void writeFinalData(Workbook workbook, String value) {
        Sheet sheet = workbook.createSheet();
        sheet.createRow(1);
        sheet.getRow(1).createCell(1);
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(1);
        cell.setCellValue(value); //value can be any string , int etc
    }
}
