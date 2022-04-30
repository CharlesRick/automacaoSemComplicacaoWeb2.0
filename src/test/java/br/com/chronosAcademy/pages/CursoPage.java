package br.com.chronosAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {
  private WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getTitulo2() {
        //div.text-center > div.large-h1
        //section[4]/div/div/div/div[1]/div/div
        String cssTitulo = "div.text-center > div.large-h1";
        WebElement txtTitulo = driver.findElement(By.cssSelector(cssTitulo)) ;
        String titulo = txtTitulo.getText();
        return txtTitulo;
    }
}
