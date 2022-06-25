package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;

    @Before
    public void iniciarNavegador(){
        new Driver("chrome");
    }

    @After
    public void fechaNavegador(){
        Driver.getDriver().quit();
    }

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFecharModal();
    }

    @Entao("a janela model deve ser fechada")
    public void aJanelaModelDeveSerFechada() throws Exception {
       try {
           loginPage.invisibilityOfBtnFechar();
       } catch (Exception e){
           throw new Exception("A janela modal nao foi fechada");
       }
    }
    @Quando("for realizado um clique no icone de fechar")
    public void forRealizadoUmCliqueNoIconeDeFechar() {
        loginPage.clickBtnFechar();
    }

    @Quando("for realizado no clique no link create new account")
    public void forRealizadoNoCliqueNoLinkCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
    }

    @Entao("a pagina create new account deve ser exibida")
    public void aPaginaCreateNewAccountDeveSerExibida() {

    }

    @Quando("os campos de login forem preenchido da seguinte forma")
    public void osCamposDeLoginForemPreenchidoDaSeguinteForma(Map<String, String> map) {
        String username = map.get("login");
        String password = map.get("password");
        boolean remember = Boolean.parseBoolean(map.get("Remember"));

        loginPage.setInpUserName(username);
        loginPage.setInpPassword(password);

        if(remember) loginPage.clickInpRemember();
    }

    @Quando("for realizado um clique no botao sign in")
    public void forRealizadoUmCliqueNoBotaoSignIn() {
        loginPage.clickBtnSignIn();

    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {

    }

    @Entao("o sistema deve exibir uma mensagem de erro")
    public void oSistemaDeveExibirUmaMensagemDeErro() {

    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);

    }
}
