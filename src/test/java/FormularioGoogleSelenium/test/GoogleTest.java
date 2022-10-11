package FormularioGoogleSelenium.test;

import FormularioGoogleSelenium.page.GooglePO;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Classe que fará os testes
 */
public class GoogleTest extends BaseTest {

    private static AcaoDeCadastrar cadastroPage;
    
    @BeforeClass
    public static void prepararTestes() throws InterruptedException{
        cadastroPage = new AcaoDeCadastrar(driver);

    }

    @Test
    public void CT01_enviarCamposVazios() throws InterruptedException{

        cadastroPage.clicarEmEnviar();

    }

    @Test
    public void CT02_verificarCamposObrigatorios() throws InterruptedException{

        cadastroPage.executarCadastro("","","", "");

    }

    @Test
    public void CT03_dadosInvalidos() throws InterruptedException{

        cadastroPage.executarCadastro("212141224","rixardy#gmail.com","werwerwerwerwerwerw", "32/01/1988");

        cadastroPage.selecionarBandeiraMaster();
        cadastroPage.selecionarBandeiraElo();

        cadastroPage.clicarEmEnviar();

    }

    @Test
    public void CT04_limparFormulario() throws InterruptedException{

        cadastroPage.executarCadastro("212141224","rixardy#gmail.com","werwerwerwerwerwerw", "32/01/1988");

        cadastroPage.selecionarBandeiraMaster();
        cadastroPage.selecionarBandeiraElo();

        cadastroPage.clicarEmLimparFormulario();
        cadastroPage.clicarEmConfirmarLimparFormulario();

    }

    @Test
    public void CT05_cancelarLimparFormulario() throws InterruptedException{

        cadastroPage.executarCadastro("212141224","rixardy#gmail.com","werwerwerwerwerwerw", "32/01/1988");

        cadastroPage.selecionarBandeiraMaster();
        cadastroPage.selecionarBandeiraElo();

        cadastroPage.clicarEmLimparFormulario();
        cadastroPage.clicarEmCacelarFormulario();

    }

    @Test
    public void CT06_cadastrarComSucesso() throws InterruptedException{

        cadastroPage.executarCadastro("Ricardo Carvalho Pires","rixardy@gmail.com","111122223333334444", "23/01/1988");

        cadastroPage.clicarEmEnviar();

    }

    @Test
    public void CT07_clienteCadastrado() throws InterruptedException{

        cadastroPage.executarCadastro("Ricardo Carvalho Pires","rixardy@gmail.com","111122223333334444", "23/01/1988");

        cadastroPage.clicarEmEnviar();

    }

    @Test
    public void CT08_editarCadastro() throws InterruptedException{

        cadastroPage.selecionarBandeiraVisa();

        cadastroPage.executarCadastro("Ricardo Carvalho Pires","rixardy@gmail.com","111122223333334444", "23/01/1988");

        cadastroPage.clicarEmEnviar();

        cadastroPage.clicarEmEditar();

        cadastroPage.limpar();

        cadastroPage.selecionarBandeiraElo();

        cadastroPage.executarCadastro("Ricardo Pires Santos","teste@gmail.com", "111122223333334444", "23/01/1988");

        cadastroPage.clicarEmEnviarEditar();

    }
}