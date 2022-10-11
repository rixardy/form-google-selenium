package FormularioGoogleSelenium.test;

import FormularioGoogleSelenium.page.GooglePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcaoDeCadastrar extends GooglePO {

    /**
     * Construtor para criação da página do google
     *
     * @param driver Driver da página do google
     * @throws InterruptedException
     */
    public AcaoDeCadastrar(WebDriver driver) {
        super(driver);
    }

    public void executarCadastro(String nome, String email, String cartao, String nascimento) throws InterruptedException {
        escrever(inputNome, nome);
        escrever(inputEmail, email);
        escrever(inputCartao, cartao);
        escrever(inputDataNascimento, nascimento);
    }
}
