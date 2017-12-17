package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePages {

    protected WebDriver navegador;

    public BasePages(WebDriver navegador){
        this.navegador = navegador;

    }

    public String VerificarAutenticacao (){

        return navegador.findElement(By.xpath("//div[@class=\"_Cbu\"]//span[@class=\"_Vbu\"]")).getText();
    }

    }

