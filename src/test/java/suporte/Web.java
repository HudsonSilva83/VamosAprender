package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver InciarPagina(){

        System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("https:www.google.com.br");
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return navegador;

    }
}
