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
       Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }
    public void clickBtnFechar() {
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
    public void visibilityOfBtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);
    }
    public void invisibilityOfBtnFechar(){
        Driver.invisibilityOf(loginMap.btnFechar);
    }
    public void aguardaLoader(){
        Driver.attibuteChange(loginMap.divLoader,"display", "none");
    }
    public String getUsuarioLogado(){
        Driver.visibilityOf(loginMap.txtLogado);
        return loginMap.txtLogado.getText();
    }
    public String getErroLogin(){
        Driver.visibilityOf(loginMap.txtErroLogin);
        return loginMap.txtErroLogin.getText();
    }

}
