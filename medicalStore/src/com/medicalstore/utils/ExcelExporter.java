package com.medicalstore.utils;

import com.medicalstore.model.Bill;
import com.medicalstore.model.Item;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelExporter {

    public void exportToExcel(List<Bill> bills, String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Bills");

        // Create header row
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Customer");
        header.createCell(1).setCellValue("Date");
        header.createCell(2).setCellValue("Item");
        header.createCell(3).setCellValue("Qty");
        header.createCell(4).setCellValue("Price");

        int rowIdx = 1;
        for (Bill bill : bills) {
            for (Item item : bill.getItems()) {
                Row row = sheet.createRow(rowIdx++);
                row.createCell(0).setCellValue(bill.getCustomerName());
                row.createCell(1).setCellValue(bill.getDate().toString());
                row.createCell(2).setCellValue(item.getProduct().getName());
                row.createCell(3).setCellValue(item.getQuantity());
                row.createCell(4).setCellValue(item.getProduct().getPrice());
            }
        }

        try (FileOutputStream out = new FileOutputStream(filePath)) {
            workbook.write(out);
        }

        workbook.close();
    }
}
