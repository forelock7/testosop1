package pages;

import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by ChubenkoV on 02.06.2016.
 */
public class TestBase {
    protected ApplicationManager app;

    @BeforeClass
    public void init() {
        app = new ApplicationManager1();
    }

    @AfterClass
    public void stop() {
        app.stop();
    }
}
