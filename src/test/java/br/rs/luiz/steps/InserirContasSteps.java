package br.rs.luiz.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import br.rs.luiz.actions.AddAccountActions;
import br.rs.luiz.actions.HomeActions;
import br.rs.luiz.actions.LoginActions;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.After;
public class InserirContasSteps {

	private WebDriver driver;
	private LoginActions actLogin;
	private HomeActions actHome;
	private AddAccountActions actAccount;
	
	@Dado("^que estou acessando a aplicação$")
	public void queEstouAcessandoAAplicação() throws Throwable {
	    System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
        // Set driver
        driver = new EdgeDriver();
        //Wait devido a falha nos testes
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Site to test
        driver.get("https://srbarriga.herokuapp.com/");
        // maximize the window
        driver.manage().window().maximize();
        
        actLogin = new LoginActions(driver);
        actHome = new HomeActions(driver);
        actAccount = new AddAccountActions(driver);
	}

	@Quando("^informo o usuário \"([^\"]*)\"$")
	public void informoOUsuário(String email) throws Throwable {
		actLogin.informaUsuario(email);
	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String senha) throws Throwable {
	    actLogin.informaSenha(senha);
	}

	@Quando("^seleciono entrar$")
	public void selecionoEntrar() throws Throwable {
	    actLogin.clickarEntrar();
	}

	@Então("^visualizo a página inicial$")
	public void visualizoAPáginaInicial() throws Throwable {
		Assert.assertTrue("Login não realizado",driver.getTitle().contains("Home"));
	}

	@Quando("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
	   actHome.clickContas();
	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {
	    actHome.clickAdicionar();
	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String nome) throws Throwable {
		actAccount.inserirNome(nome);
	}

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {
	   actAccount.clickSalvar();
	}

	@Então("^a conta é inserida com sucesso$")
	public void aContaEInseridaComSucesso() throws Throwable {
		actAccount.verificarSucesso();
	}
	
	@Então("^sou notificar que o nome da conta é obrigatório$")
	public void souNotificarQueONomeDaCntaEObrigatório() throws Throwable {
	    actAccount.notificarNomeObrigatorio();
	}
	
	@Então("^sou notificado que já existe uma conta com esse nome$")
	public void notificadoExiste() throws Throwable {
	    actAccount.notificarNomeJaExiste();
	}
	
	@After
	public void fecharNavegador() {
		driver.quit();
	}
}
