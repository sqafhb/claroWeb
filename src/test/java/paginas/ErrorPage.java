package paginas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorPage {
    private WebDriver navegador;

    public ErrorPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ErrorPage mensagemError() {
        String mensagemError = navegador.findElement(By.id("errorInfo")).getText();
        Assertions.assertEquals("Ocorreu um erro inesperado. Você está sendo redirecionado para o site da Claro.", mensagemError);
        return this;
    }
}
