package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUser") //ID em CSS = [#]
    public WebElement btnLogin;
    @FindBy(css = ".closeBtn") // Class em CSS = [.]
    public WebElement btnFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;
    @FindBy(css = "input[name='username']") // CSS = input[name='username'] ou *[name='username']
                                            // xpath //input[@name='username']
    public WebElement inpUserName;
    @FindBy(css = "input[name='password']")
    public WebElement inpPassword;
    @FindBy(css = "#sign_in_btnundefined")
    public WebElement btnSignIn;
    @FindBy(css ="*[name='remember_me']" )
    public WebElement inpRemember;
    @FindBy(linkText = "CREATE NEW ACCOUNT")
    public WebElement linkCreatAccount;
}
