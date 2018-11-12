package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserformPage {
    @FindBy(name="TitleId")
    private WebElement titledrpdwn;

    @FindBy(id="Initial")
    private WebElement initialField;

    @FindBy(id="FirstName")
    private WebElement firstNameField;

    @FindBy(id="MiddleName")
    private WebElement middleNameField;

    @FindBy(name="Male")
    private WebElement btnMaleRadio;

    @FindBy(name="Female")
    private WebElement btnFemaleRadio;

    @FindBy(name="english")
    private WebElement checkBoxEnglish;

    @FindBy(name="Hindi")
    private WebElement getCheckBoxHindi;

    @FindBy(name="Save")
    private WebElement btnSave;

    public UserformPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void titleChoose(String titleToChoose){
        Select drpdwn = new Select(titledrpdwn);
        drpdwn.selectByVisibleText(titleToChoose);
    }

    public void enterInitial(String initial){
        initialField.sendKeys(initial);
    }

    public void enterName(String firstname, String middlename){
        firstNameField.sendKeys(firstname);
        middleNameField.sendKeys(middlename);
    }


}
