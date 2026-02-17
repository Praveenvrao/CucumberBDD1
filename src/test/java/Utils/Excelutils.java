package Utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelutils {

    public static Map<String, String> getTestdata(String TestcaseID){
        Map<String, String> data = new HashMap<>();
        try {
            FileInputStream FileIN = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx");
            Workbook workbook = new XSSFWorkbook(FileIN);
            Sheet sheet = workbook.getSheet("Sheet1");
             Row HeaderRow =


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
