package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import pages.UserformPage;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest(){
        System.out.println("Opening Browser: MOCK");
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        base.driver= new ChromeDriver();
        base.loginPage = new LoginPage(base.driver);
        base.userformPage = new UserformPage(base.driver);
    }

    @After
    public void tearDownTest(Scenario scenario){

        if (scenario.isFailed()){
            //take the screenshot
            System.out.println("Suppose to take the Screenshot here");
        }
        System.out.println("Closing Browser: MOCK");
        base.driver.close();
    }
}
