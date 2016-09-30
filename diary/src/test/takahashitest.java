package test;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class takahashitest {
    WebDriver wd;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.ie.driver", "C:\\Jenkins\\workspace\\SeleniumServer\\IEDriverServer.exe");
        wd = new InternetExplorerDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void takahashitest() {
        wd.get("http://localhost:8088/cxm/userRegistration.htm");
        wd.findElement(By.id("name")).click();
        wd.findElement(By.id("name")).sendKeys("\\undefined");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).sendKeys("\\undefined");
        wd.findElement(By.id("name")).click();
        wd.findElement(By.id("name")).clear();
        wd.findElement(By.id("name")).sendKeys("takahashi");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("takuya");
        if (!wd.findElement(By.id("gender1")).isSelected()) {
            wd.findElement(By.id("gender1")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='country']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='country']//option[2]")).click();
        }
        wd.findElement(By.id("aboutYou")).click();
        wd.findElement(By.id("aboutYou")).clear();
        wd.findElement(By.id("aboutYou")).sendKeys("txt");
        if (!wd.findElement(By.id("community1")).isSelected()) {
            wd.findElement(By.id("community1")).click();
        }
        wd.findElement(By.xpath("//form[@id='user']/table/tbody/tr[9]/td/input")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
