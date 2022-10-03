package ProjetosTestedeSoftware.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Classe base para os testes
 */
public abstract class BaseTest { //classe abstrata só pode ser herdada e não estanciada
    
    protected static WebDriver driver; //criando uma instancia do webdriver proteggida, só essa classe e quem herdar pode usar
    private static final String URL_BASE = "https://forms.gle/WJyY2BmFA1Upv8Bm7"; //URL utilizada nos testes
    private static final String CAMINHO_DRIVER = "src/test/java/ProjetosTestedeSoftware/resource/chromedriver.exe"; //caminho do web criver

    @BeforeClass //anotação que chama o método antes de qualquer outra classe
    public static void iniciar(){ //metódo que inicia o navegador e acessa a URL
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER); //sseta as propriedades
        driver = new ChromeDriver(); //instancia um novo navegador
        driver.manage().window().maximize(); //abre o navegador e maximiza a janela
        driver.get(URL_BASE);//abre a url definida
    }
/** 
    @AfterClass //anotação que chama o método após todos os testes
    public static void finalizar() throws InterruptedException{ //método para fechar o navegador
        Thread.sleep(1000);
        driver.quit(); //fecha o navegador
    }*/

}
