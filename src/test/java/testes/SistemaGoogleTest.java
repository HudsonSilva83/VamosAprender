package testes;

import org.easetech.easytest.annotation.Param;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BasePages;
import pages.LoginPages;
import suporte.Web;

public class SistemaGoogleTest {
    private WebDriver navegador;

    @Before
    public void Setup(){
     navegador = Web.InciarPagina();
 }

    @Test
public void LogarGmail(){
      BasePages mensagemCapturada= new BasePages(navegador);
        new LoginPages(navegador)
        .clicarSingIn()
        .digitarEmail("hu.psilva@gmail.com")
        .digitarSenha("hudsonsilva838383");

    Assert.assertEquals("Brasil",mensagemCapturada.VerificarAutenticacao());
    }

    @Test

    public void PesquisarGoogle(){



    }

    @After
    public void Fechar(){
        navegador.quit();
    }

}
