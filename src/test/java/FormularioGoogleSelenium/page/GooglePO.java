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

    @FindBy(css = "#mG61Hd>div.RH5hzf.RLS9Fe>div>div.ThHDze>div.DE3NNc>div>div>span>span")
    public WebElement buttonEnviarEditar;

    @FindBy(css = "#mG61Hd>div.RH5hzf.RLS9Fe>div>div.ThHDze>div.DE3NNc.CekdCb>div.nYdzXd>div>span>span")
    public WebElement buttonLimparFormulario;

    @FindBy(css = "body>div.NBxL9e.iWO5td>div>div.I7OXgf.muQ9xc.ZEeHrd.Inn9w.iWO5td>div.OE6hId.J9fJmf>div:nth-child(2)>span>span")
    public WebElement buttonConfirmarLimparFormulario;

    @FindBy(css = "body>div.NBxL9e.iWO5td>div>div.I7OXgf.muQ9xc.ZEeHrd.Inn9w.iWO5td>div.OE6hId.J9fJmf>div:nth-child(1)>span>span")
    public WebElement buttonCancelarLimparFormulario;
    
    @FindBy(css = "body>div.Uc2NEf>div:nth-child(2)>div.RH5hzf.RLS9Fe>div>div.c2gzEf>a")
    public WebElement cliarEmEditar;

    /**
     * Construtor para cria????o da p??gina do google
     * @param driver Driver da p??gina do google
     * @throws InterruptedException
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }

    /**
     * M??todo que ir?? escrever nos campos de texto
     * @param texto Texto a ser digitado
     * @throws InterruptedException
     */
    public void escrever(WebElement input,String texto) throws InterruptedException {
        Thread.sleep(1000);
        input.sendKeys(texto);
    }

    /**
     * M??todo que ir?? selecionar a bandeira visa
     * @throws InterruptedException
     */
    public void selecionarBandeiraVisa() throws InterruptedException {
        Thread.sleep(1000);
        checkBandeiraVisa.click();
    }

    /**
     * M??todo que ir?? selecionar a bandeira masterccard
     * @throws InterruptedException
     */
    public void selecionarBandeiraMaster() throws InterruptedException {
        Thread.sleep(1000);
        checkBandeiraMaster.click();
    }

    /**
     * M??todo que ir?? selecionar a bandeira elo
     * @throws InterruptedException
     */
    public void selecionarBandeiraElo() throws InterruptedException {
        Thread.sleep(1000);
        checkBandeiraElo.click();
    }

    /**
     * M??todo que clica no bot??o enviar
     * @throws InterruptedException
     */
    public void clicarEmEnviar() throws InterruptedException {
        Thread.sleep(1000);
        buttonEnviar.click();
    }

    /**
     * M??todo que clica no bot??o enviar
     * @throws InterruptedException
     */
    public void clicarEmEnviarEditar() throws InterruptedException {
        Thread.sleep(1000);
        buttonEnviarEditar.click();
    }

    /**
     * M??todo que cclica no bot??o limpar formul??rio
     * @throws InterruptedException
     */
    public void clicarEmLimparFormulario() throws InterruptedException {
        Thread.sleep(1000);
        buttonLimparFormulario.click();
    }

    /**
     * M??todo que clica no bot??o confirmar o cancelamento da limpeza de formul??rio
     * @throws InterruptedException
     */
    public void clicarEmConfirmarLimparFormulario() throws InterruptedException {
        Thread.sleep(1000);
        buttonConfirmarLimparFormulario.click();
    }

    /**
     * M??todo que clica no bot??o cancelar
     * @throws InterruptedException
     */
    public void clicarEmCacelarFormulario() throws InterruptedException {
        Thread.sleep(1000);
        buttonCancelarLimparFormulario.click();
    }

    /**
     * M??todo que ir?? clicar no bot??o Editar
     * @throws InterruptedException
     */
    public void clicarEmEditar() throws InterruptedException {
        Thread.sleep(1000);
        cliarEmEditar.click();
    }

    /**
     * M??todo que limpar todos os campos
     * @throws InterruptedException
     */
    public void limpar() throws InterruptedException {
        Thread.sleep(1000);
        inputNome.clear();
        inputEmail.clear();
        if (checkBandeiraVisa.isEnabled())
        {
            checkBandeiraVisa.click();
        }
        if (checkBandeiraMaster.isSelected())
        {
            checkBandeiraMaster.click();
        }
        if (checkBandeiraElo.isSelected())
        {
            checkBandeiraElo.click();
        }
        inputCartao.clear();
        inputDataNascimento.clear();
    }

}
