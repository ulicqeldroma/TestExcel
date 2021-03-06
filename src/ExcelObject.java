import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by israel on 14/03/15.
 */
public class ExcelObject {
    private final HSSFWorkbook wb;
    private final HSSFSheet sheet;

    public ExcelObject(File file, int index) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        wb = new HSSFWorkbook(fileInputStream);
        sheet = wb.getSheetAt(index);
    }

    public ExcelObject(String name, String sheetName) throws Exception{
        File myFile = new File(name);
        FileInputStream fileInputStream = new FileInputStream(myFile);
        wb = new HSSFWorkbook(fileInputStream);
        sheet = wb.createSheet(sheetName);
    }

    public void copyRow(HSSFSheet sheetCopy){

    }
}
