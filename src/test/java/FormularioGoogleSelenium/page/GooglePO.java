package FormularioGoogleSelenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {

    @FindBy(css = "#mG61Hd>div.RH5hzf.RLS9Fe>div>div.o3Dpx>div:nth-child(1)>div>div>div.AgroKb>div>div.aCsJod.oJeWuf>div>div.Xb9hP>input")
    public WebElement inputNome;

    @FindBy(css = "#mG61Hd>div.RH5hzf.RLS9Fe>div>div.o3Dpx>div:nth-child(2)>div>div>div.AgroKb>div>div.aCsJod.oJeWuf>div>div.Xb9hP>input")
    public WebElement inputEmail;

    @FindBy(css = "#i14")
    public WebElement checkBandeiraVisa;

    @FindBy(css = "#i17")
    public WebElement checkBandeiraMaster;

    @FindBy(css = "#i20")
    public WebElement checkBandeiraElo;

    @FindBy(css = "#mG61Hd>div.RH5hzf.RLS9Fe>div>div.o3Dpx>div:nth-child(4)>div>div>div.AgroKb>div>div.aCsJod.oJeWuf>div>div.Xb9hP>input")
    public WebElement inputCartao; 

    @FindBy(css = "#mG61Hd>div.RH5hzf.RLS9Fe>div>div.o3Dpx>div:nth-child(5)>div>div>div:nth-child(2)>div>div>div.rFrNMe.yqQS1.hatWr.zKHdkd>div.aCsJod.oJeWuf>div>div.Xb9hP>input")
    public WebElement inputDataNascimento;

    @FindBy(css = "#mG61Hd>div.RH5hzf.RLS9Fe>div>div.ThHDze>div.DE3NNc.CekdCb>div.lRwqcd>div>span>span")
    public WebElement buttonEnviar;

    @FindBy(css = "#mG61Hd>div.RH5hzf.RLS9Fe>div>div.ThHDze>div.DE3NNc.CekdCb>div.nYdzXd>div>span>span")
    public WebElement buttonLimparFormulario;

    @FindBy(css = "body>div.NBxL9e.iWO5td>div>div.I7OXgf.muQ9xc.ZEeHrd.Inn9w.iWO5td>div.OE6hId.J9fJmf>div:nth-child(2)>span>span")
    public WebElement buttonConfirmarLimparFormulario;

    @FindBy(css = "body>div.NBxL9e.iWO5td>div>div.I7OXgf.muQ9xc.ZEeHrd.Inn9w.iWO5td>div.OE6hId.J9fJmf>div:nth-child(1)>span>span")
    public WebElement buttonCancelarLimparFormulario;
    
    @FindBy(css = "body>div.Uc2NEf>div:nth-child(2)>div.RH5hzf.RLS9Fe>div>div.c2gzEf>a")
    public WebElement cliarEmEditar;

    /**
     * Construtor para criação da página do google
     * @param driver Driver da página do google
     * @throws InterruptedException
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }

    /**
     * Método que irá digitar o nome
     * @param texto Texto a ser digitado
     * @throws InterruptedException
     */
    public void inserirNome(String texto) throws InterruptedException {
        Thread.sleep(1000);
        inputNome.sendKeys(texto);
    }

    /**
     * Método que irá digitar o email
     * @param texto Texto a ser digitado
     * @throws InterruptedException
     */
    public void inserirEmail(String texto) throws InterruptedException {
        Thread.sleep(1000);
        inputEmail.sendKeys(texto);
    }

    /**
     * Método que irá selecionar a bandeira visa
     * @throws InterruptedException
     */
    public void selecionarBandeiraVisa() throws InterruptedException {
        Thread.sleep(1000);
        checkBandeiraVisa.click();
    }

    /**
     * Método que irá selecionar a bandeira masterccard
     * @throws InterruptedException
     */
    public void selecionarBandeiraMaster() throws InterruptedException {
        Thread.sleep(1000);
        checkBandeiraMaster.click();
    }

    /**
     * Método que irá selecionar a bandeira elo
     * @throws InterruptedException
     */
    public void selecionarBandeiraElo() throws InterruptedException {
        Thread.sleep(1000);
        checkBandeiraElo.click();
    }

    /**
     * Método que digita o numero do cartão de crédito
     * @param texto Texto a ser digitado
     * @throws InterruptedException
     */
    public void inserirNumeroCartao(String texto) throws InterruptedException {
        Thread.sleep(1000);
        inputCartao.sendKeys(texto);
    }
    
    /**
     * Método que digita a data de nascimento
     * @param texto Texto a ser digitado
     * @throws InterruptedException
     */
    public void inserirDataNascimento(String texto) throws InterruptedException {
        Thread.sleep(1000);
        inputDataNascimento.sendKeys(texto);
    }

    /**
     * Método que clica no botão enviar
     * @throws InterruptedException
     */
    public void clicarEmEnviar() throws InterruptedException {
        Thread.sleep(1000);
        buttonEnviar.click();
    }

    /**
     * Método que clica no botão enviar
     * @throws InterruptedException
     */
    public void clicarEmEnviarEditar() throws InterruptedException {
        Thread.sleep(1000);
        buttonEnviarEditar.click();
    }

    /**
     * Método que cclica no botão limpar formulário
     * @throws InterruptedException
     */
    public void clicarEmLimparFormulario() throws InterruptedException {
        Thread.sleep(1000);
        buttonLimparFormulario.click();
    }

    /**
     * Método que clica no botão confirmar o cancelamento da limpeza de formulário
     * @throws InterruptedException
     */
    public void clicarEmConfirmarLimparFormulario() throws InterruptedException {
        Thread.sleep(1000);
        buttonConfirmarLimparFormulario.click();
    }

    /**
     * Método que clica no botão cancelar
     * @throws InterruptedException
     */
    public void clicarEmCacelarFormulario() throws InterruptedException {
        Thread.sleep(1000);
        buttonCancelarLimparFormulario.click();
    }

    /**
     * Método que irá clicar no botão Editar
     * @throws InterruptedException
     */
    public void clicarEmEditar() throws InterruptedException {
        Thread.sleep(1000);
        cliarEmEditar.click();
    }

    /**
     * Método que limpar todos os campos
     * @throws InterruptedException
     */
    public void limpar() throws InterruptedException {
        Thread.sleep(1000);
        inputNome.clear();
        inputEmail.clear();
        if (checkBandeiraVisa.isDisplayed())
        {
            checkBandeiraVisa.click();
        }
        if (checkBandeiraMaster.isDisplayed())
        {
            checkBandeiraMaster.click();
        }
        if (checkBandeiraElo.isDisplayed())
        {
            checkBandeiraElo.click();
        }
        inputCartao.clear();
        inputDataNascimento.clear();
    }

}
