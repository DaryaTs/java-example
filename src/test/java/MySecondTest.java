from selenium import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MySecondTest {
}

    private WebDriver driver;
    private WebDriver wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void MySecondTest() {
        driver.get("http://www.localhost.litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

    @After
    public void stop () {
        driver.quit();
        driver=null;
    }
}