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

        googlePage.inserirNome("");

        googlePage.inserirEmail("");

        googlePage.selecionarBandeiraVisa();

        googlePage.inserirNumeroCartao("");

        googlePage.inserirDataNascimento("");

        googlePage.clicarEmEnviar();

    }

    @Test
    public void CT03_dadosInvalidos() throws InterruptedException{

        googlePage.inserirNome("212141224");

        googlePage.inserirEmail("rixardy@gmail.com");

        googlePage.selecionarBandeiraVisa();
        googlePage.selecionarBandeiraMaster();
        googlePage.selecionarBandeiraElo();

        googlePage.inserirNumeroCartao("werwerwerwerwerwerw");

        googlePage.inserirDataNascimento("32/01/1988");

        googlePage.clicarEmEnviar();

    }

    @Test
    public void CT04_limparFormulario() throws InterruptedException{

        googlePage.inserirNome("212141224");

        googlePage.inserirEmail("rixardy#gmail.com");

        googlePage.selecionarBandeiraVisa();
        googlePage.selecionarBandeiraMaster();
        googlePage.selecionarBandeiraElo();

        googlePage.inserirNumeroCartao("werwerwerwerwerwerw");

        googlePage.inserirDataNascimento("32/01/1988");

        googlePage.clicarEmLimparFormulario();
        googlePage.clicarEmConfirmarLimparFormulario();

    }

    @Test
    public void CT05_cancelarLimparFormulario() throws InterruptedException{

        googlePage.inserirNome("212141224");

        googlePage.inserirEmail("rixardy#gmail.com");

        googlePage.selecionarBandeiraVisa();
        googlePage.selecionarBandeiraMaster();
        googlePage.selecionarBandeiraElo();

        googlePage.inserirNumeroCartao("werwerwerwerwerwerw");

        googlePage.inserirDataNascimento("32/01/1988");

        googlePage.clicarEmLimparFormulario();
        googlePage.clicarEmCacelarFormulario();

    }

    @Test
    public void CT06_cadastrarComSucesso() throws InterruptedException{

        googlePage.inserirNome("Ricardo Carvalho Pires");

        googlePage.inserirEmail("rixardy@gmail.com");

        googlePage.selecionarBandeiraMaster();

        googlePage.inserirNumeroCartao("111122223333334444");

        googlePage.inserirDataNascimento("23/01/1988");

        googlePage.clicarEmEnviar();

    }

    @Test
    public void CT07_clienteCadastrado() throws InterruptedException{

        googlePage.inserirNome("Ricardo Carvalho Pires");

        googlePage.inserirEmail("rixardy@gmail.com");

        googlePage.selecionarBandeiraVisa();

        googlePage.inserirNumeroCartao("111122223333334444");

        googlePage.inserirDataNascimento("23/01/1988");

        googlePage.clicarEmEnviar();

    }

    @Test
    public void CT08_editarCadastro() throws InterruptedException{

        googlePage.inserirNome("Ricardo Carvalho Pires");

        googlePage.inserirEmail("rixardy@gmail.com");

        googlePage.selecionarBandeiraVisa();

        googlePage.inserirNumeroCartao("111122223333334444");

        googlePage.inserirDataNascimento("23/01/1988");

        googlePage.clicarEmEnviar();

        googlePage.clicarEmEditar();

    }
}