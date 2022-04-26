package br.com.chronosAcademy.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    private WebDriver driver;

    public Driver(String navegador){
        switch (navegador){
            case "chrome":
                //abrir chrome
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "ie":
                //abrir ie
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                //abrir firefox
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                //abrir edge
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                //abrir chrome
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
    }
    public WebDriver getDriver (){
        return driver;
    }
}
