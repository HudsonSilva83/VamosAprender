package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPages {
    private WebDriver navegador;

    public LoginPages (WebDriver navegador){
        this.navegador = navegador;
  }

   public FormularioLogin clicarSingIn(){
       navegador.findElement(By.id("gb_70")).click();
       navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return new FormularioLogin(navegador);


   }



}



