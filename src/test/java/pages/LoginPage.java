package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name="UserName")
    private WebElement userNameTextBox;

    @FindBy(name="Password")
    private WebElement passwordTextBox;

    @FindBy(name="Login")
    private WebElement btnLogin;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterUsernameAndPassword(String username,String password){
        userNameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);

    }

    public void submit(){
        btnLogin.submit();
    }
}
