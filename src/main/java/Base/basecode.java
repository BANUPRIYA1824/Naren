package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import Excel.excelreport;

public class basecode {
    public WebDriver driver;
	excelreport obj= new excelreport("D:\\Downloads\\Naren\\banupriya\\Book1.xlsx");//create excel and set the path-Admin-admin123
	@BeforeClass
	public void setup() {
	System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	@DataProvider(name ="Credentials1")
	public Object[][] getExcelData() {
	//Totals rows count
	int rows=obj.getRowCount("data");
	//Total Columns
	int column=obj.getColumnCount("data");
	int actRows=rows-1;
	Object[][] data= new Object[actRows][column];
	for(int i=0;i<actRows;i++) {
	for(int j=0; j<column;j++) {
	data[i][j]=obj.getCellData("data", j, i+2);
	}
	}
	return data;
	}
	}

