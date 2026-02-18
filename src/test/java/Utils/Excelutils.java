package Utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelutils {

    public static Map<String, String> getTestdata(String TestcaseID){
        Map<String, String> data = new HashMap<>();
        try {
            FileInputStream FileIN = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestData/TestDatasheet.xlsx");
            Workbook workbook = new XSSFWorkbook(FileIN);
            Sheet sheet = workbook.getSheet("Sheet1");
             Row Headerrow = sheet.getRow(0);
             DataFormatter formatter = new DataFormatter();
             for (int i = 1; i<=sheet.getLastRowNum(); i++){
                 Row currentrow = sheet.getRow(i);
                 String CurrentTCID = formatter.formatCellValue(currentrow.getCell(0));
                 if(CurrentTCID.equalsIgnoreCase(TestcaseID)){
                     for (int j=0; j<currentrow.getLastCellNum(); j++){
                         String key = Headerrow.getCell(j).getStringCellValue();
                         String value = formatter.formatCellValue(currentrow.getCell(j));
                         data.put(key,value);
                     }
                     break;
                 }

            }
             workbook.close();
             FileIN.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }
}
