package br.rs.luiz.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAccountObjects {

	private WebDriver driver;
	
	@FindBy(id = "nome")
	WebElement inputNome;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement buttonSalvar;
	
	@FindBy(xpath = "//div[text()='Conta adicionada com sucesso!']")
	WebElement divSuccess;
	
	@FindBy(xpath = "//div[text()='Informe o nome da conta']")
	WebElement divAvisoNome;
	
	@FindBy(xpath = "//div[text()='Já existe uma conta com esse nome!']")
	WebElement divNomeJaExiste;
	
	public WebElement getDivSuccess() {
		return divSuccess;
	}

	public void setDivSuccess(WebElement divSuccess) {
		this.divSuccess = divSuccess;
	}

	
	public WebElement getInputNome() {
		return inputNome;
	}

	public void setInputNome(WebElement inputNome) {
		this.inputNome = inputNome;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public void setButtonSalvar(WebElement buttonSalvar) {
		this.buttonSalvar = buttonSalvar;
	}
	
	public WebElement getDivAvisoNome() {
		return divAvisoNome;
	}

	public void setDivAvisoNome(WebElement divAvisoNome) {
		this.divAvisoNome = divAvisoNome;
	}

	public WebElement getDivNomeJaExiste() {
		return divNomeJaExiste;
	}

	public void setDivNomeJaExiste(WebElement divNomeJaExiste) {
		this.divNomeJaExiste = divNomeJaExiste;
	}

	public AddAccountObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
