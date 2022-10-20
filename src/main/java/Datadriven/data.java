package Datadriven;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Base.basecode;

public class data extends basecode {

@Test(dataProvider = "Credentials1")
public void loginTest(String username,String password) {
driver.findElement(By.id("email")).sendKeys(username);

driver.findElement(By.id("pass")).sendKeys(password);
driver.findElement(By.id("login")).click();

String actualURL=driver.getCurrentUrl();
String expectedURL="https://www.facebook.com"; AssertJUnit.assertEquals(actualURL, expectedURL);
}
}
