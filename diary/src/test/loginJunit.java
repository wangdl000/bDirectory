




import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class loginJunit {
    WebDriver wd;

    @Before
    public void setUp() throws Exception {
//        File file = new File("C:/Jenkins/workspace/SeleniumServer/IEDriverServer.exe");
//        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

//        System.setProperty("webdriver.firefox.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//        C:\Program Files (x86)\Mozilla Firefox\firefox.exe
        System.setProperty("webdriver.ie.driver", "C:\\Jenkins\\workspace\\SeleniumServer\\IEDriverServer.exe");
        wd = new InternetExplorerDriver();
        wd.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    }

    @Test
    public void loginJunit() {
        wd.get("http://localhost:8088/cxm/userRegistration.htm");
//        wd.findElement(By.id("name")).click();
//        wd.findElement(By.id("name")).sendKeys("test");
//        wd.findElement(By.id("password")).click();
//        wd.findElement(By.id("password")).sendKeys("test");
//        wd.findElement(By.id("aboutYou")).click();
//        wd.findElement(By.id("aboutYou")).clear();
//        wd.findElement(By.id("aboutYou")).sendKeys("selenium builder test ");
//        if (!wd.findElement(By.id("community1")).isSelected()) {
//            wd.findElement(By.id("community1")).click();
//        }
//        wd.findElement(By.xpath("//form[@id='user']/table/tbody/tr[8]/td[2]")).click();
//        if (!wd.findElement(By.id("mailingList1")).isSelected()) {
//            wd.findElement(By.id("mailingList1")).click();
//        }
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
