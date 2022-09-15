package modulos.login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.LoginPage;

import java.time.Duration;

@DisplayName("Testes Web de Login")
public class LoginTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver 105.0.5195.52\\chromedriver.exe");
        this.navegador = new ChromeDriver();
        this.navegador.manage().window().maximize();
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.navegador.get("https://auth.netcombo.com.br/web/index.html");
    }

    @Test
    @DisplayName("Não é permitido logar com usuário e/ou senha incorretos")
    public void testLoginInvalido () {

        new LoginPage(navegador)
                .informarOUsuario("frndb90@gmail.com")
                .informarASenha("Teste123")
                .submeterLogin();
    }

    @AfterEach
    public void afterEach() {
        this.navegador.quit();
    }
}
