package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioLogin extends BasePages {


    public FormularioLogin(WebDriver navegador) {
        super(navegador);
    }

    public FormularioLogin digitarEmail(String Email) {
        navegador.findElement(By.id("identifierId")).sendKeys(Email);
        navegador.findElement(By.className("CwaK9")).click();

        return this;
    }

    public FormularioLogin digitarSenha(String senha) {
        navegador.findElement(By.name("password")).sendKeys(senha);
        navegador.findElement(By.xpath("//div[@class=\"OZliR\"]//div[@role=\"button\"]")).click();



        return this;
    }


}

