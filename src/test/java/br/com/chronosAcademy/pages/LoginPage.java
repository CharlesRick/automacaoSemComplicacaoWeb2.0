package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }
    public void clickBtnLogin(){
        loginMap.btnLogin.click();
    }
    public void clickBtnFechar(){
        loginMap.btnFechar.click();
    }
    public void clickDivFecharModal(){
        loginMap.divFecharModal.click();
    }
    public void setInpUserName(String userName){
        loginMap.inpUserName.sendKeys(userName);
    }
    public void setInpPassword(String password){
        loginMap.inpPassword.sendKeys(password);
    }
    public void clickInpRemember(){
        loginMap.inpRemember.click();
    }
    public void clickLinkCreateAccount(){
        loginMap.linkCreatAccount.click();
    }
    public void clickBtnSignIn(){
        loginMap.btnSignIn.click();
    }
    public boolean isBtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }


}
