package FormularioGoogleSelenium.test;

import FormularioGoogleSelenium.page.GooglePO;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Classe que fará os testes
 */
public class GoogleTest extends BaseTest {

    private static GooglePO googlePage;
    //WebDriverWait wait = new WebDriverWait(driver, 1000);
    
    @BeforeClass
    public static void prepararTestes() throws InterruptedException{
        googlePage = new GooglePO(driver);

    }

    @Test
    public void CT01_enviarCamposVazios() throws InterruptedException{

        googlePage.clicarEmEnviar();

    }

    @Test
    public void CT02_verificarCamposObrigatorios() throws InterruptedException{

        googlePage.escrever(googlePage.inputNome, "");

        googlePage.escrever(googlePage.inputEmail, "");

        googlePage.selecionarBandeiraVisa();

        googlePage.escrever(googlePage.inputCartao,"");

        googlePage.escrever(googlePage.inputDataNascimento,"");

        googlePage.clicarEmEnviar();

    }

    @Test
    public void CT03_dadosInvalidos() throws InterruptedException{

        googlePage.escrever(googlePage.inputNome,"212141224");

        googlePage.escrever(googlePage.inputEmail,"rixardy#gmail.com");

        googlePage.selecionarBandeiraVisa();
        googlePage.selecionarBandeiraMaster();
        googlePage.selecionarBandeiraElo();

        googlePage.escrever(googlePage.inputCartao,"werwerwerwerwerwerw");

        googlePage.escrever(googlePage.inputDataNascimento,"32/01/1988");

        googlePage.clicarEmEnviar();

    }

    @Test
    public void CT04_limparFormulario() throws InterruptedException{

        googlePage.escrever(googlePage.inputNome,"212141224");

        googlePage.escrever(googlePage.inputEmail,"rixardy#gmail.com");

        googlePage.selecionarBandeiraVisa();
        googlePage.selecionarBandeiraMaster();
        googlePage.selecionarBandeiraElo();

        googlePage.escrever(googlePage.inputCartao,"werwerwerwerwerwerw");

        googlePage.escrever(googlePage.inputDataNascimento,"32/01/1988");

        googlePage.clicarEmLimparFormulario();
        googlePage.clicarEmConfirmarLimparFormulario();

    }

    @Test
    public void CT05_cancelarLimparFormulario() throws InterruptedException{

        googlePage.escrever(googlePage.inputNome,"212141224");

        googlePage.escrever(googlePage.inputEmail,"rixardy#gmail.com");

        googlePage.selecionarBandeiraVisa();
        googlePage.selecionarBandeiraMaster();
        googlePage.selecionarBandeiraElo();

        googlePage.escrever(googlePage.inputCartao,"werwerwerwerwerwerw");

        googlePage.escrever(googlePage.inputDataNascimento,"32/01/1988");

        googlePage.clicarEmLimparFormulario();
        googlePage.clicarEmCacelarFormulario();

    }

    @Test
    public void CT06_cadastrarComSucesso() throws InterruptedException{

        googlePage.escrever(googlePage.inputNome,"Ricardo Carvalho Pires");

        googlePage.escrever(googlePage.inputEmail,"rixardy@gmail.com");

        googlePage.selecionarBandeiraMaster();

        googlePage.escrever(googlePage.inputCartao,"111122223333334444");

        googlePage.escrever(googlePage.inputDataNascimento,"23/01/1988");

        googlePage.clicarEmEnviar();

    }

    @Test
    public void CT07_clienteCadastrado() throws InterruptedException{

        googlePage.escrever(googlePage.inputNome,"Ricardo Carvalho Pires");

        googlePage.escrever(googlePage.inputEmail,"rixardy@hotmail.com");

        googlePage.selecionarBandeiraVisa();

        googlePage.escrever(googlePage.inputCartao,"111122223333334444");

        googlePage.escrever(googlePage.inputDataNascimento,"23/01/1988");

        googlePage.clicarEmEnviar();

    }

    @Test
    public void CT08_editarCadastro() throws InterruptedException{

        googlePage.escrever(googlePage.inputNome,"Ricardo Santos Pires");

        googlePage.escrever(googlePage.inputEmail,"rixardy@hotmail.com");

        googlePage.selecionarBandeiraVisa();

        googlePage.escrever(googlePage.inputCartao,"111122223333334444");

        googlePage.escrever(googlePage.inputDataNascimento,"23/01/1990");

        googlePage.clicarEmEnviar();

        googlePage.clicarEmEditar();

        googlePage.limpar();

        googlePage.escrever(googlePage.inputNome,"Ricardo Pires Santos");

        googlePage.escrever(googlePage.inputEmail,"teste@gmail.com");

        googlePage.selecionarBandeiraElo();

        googlePage.escrever(googlePage.inputCartao,"111122223333334444");

        googlePage.escrever(googlePage.inputDataNascimento,"23/01/1988");

    }
}