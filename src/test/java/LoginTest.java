import model.User;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends pages.TestBase {

    @Before
    public void mayBeLogout() {
        if (app.getUserHelper().isNotLoggedIn()) {
            return;
        }
        app.getUserHelper().logout();
    }

    @Test
    public void testLoginOK() throws Exception {
        User user = new User().setLogin("admin").setPassword("admin");
        app.getUserHelper().loginAs(user);
        assertTrue(app.getUserHelper().isLoggedInAs(user));
    }

    @Test
    public void testLoginFailed() throws Exception {
        User user = new User().setLogin("admin").setPassword("wrong");
        app.getUserHelper().loginAs(user);
        // assertFalse(app.getUserHelper().isLoggedIn());
        assertTrue(app.getUserHelper().isNotLoggedIn());
    }

}




/*import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;

        import java.awt.*;
        import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void toAuthorize() throws AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://10.100.7.71:57775/osop/LoginForm.csp");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("vova");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("bMS$2016");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/form/div[3]/input")).click();
    }
}*/