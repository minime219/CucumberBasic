package Steps;

import Base.BaseUtil;
import Transformation.EmailTransformation;
import Transformation.SalaryCountTransformation;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {
    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Then("^I should see userform page$")
    public void iShouldSeeUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(base.driver.findElement(By.id("Initial")).isDisplayed(),"It is not displayed");


    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I navigate to the login page");
        base.driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }






    @And("^I enter the following Details$")
    public void iEnterTheFollowingDetails(DataTable table) throws Throwable {
        //List<List<String>> list = table.raw();
        //System.out.println("I enter the username as: "+list.get(1).get(0));
        //System.out.println("I enter the password as: "+list.get(1).get(1));
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);
        for (User user : users
             ) {
            base.loginPage.enterUsernameAndPassword(user.username,user.password);
        }
    }
    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("I click login button");
        base.loginPage.submit();
        Thread.sleep(2000);
    }







    public class User {
        public String username;
        public String password;

        public User(String username,String password){
            this.username=username;
            this.password=password;
        }
    }
}
