package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver navegador;
    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public LoginPage informarOUsuario (String usuario) {
        this.navegador.findElement(By.id("login")).sendKeys(usuario);
        return this;
    }

    public LoginPage informarASenha (String senha) {
        this.navegador.findElement(By.id("password")).sendKeys(senha);
        return this;
    }

    public ErrorPage submeterLogin() {
        this.navegador.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[5]/button[1]")).click();
        return new ErrorPage(navegador);
    }


}
