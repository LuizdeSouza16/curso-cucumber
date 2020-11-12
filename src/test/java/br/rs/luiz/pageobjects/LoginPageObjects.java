package br.rs.luiz.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	private WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement inputLogin;
	
	@FindBy(id = "senha")
	private WebElement inputSenha;
	
	@FindBy(xpath ="//button[@type ='submit']")
	private WebElement buttonEntrar;

	public WebElement getInputLogin() {
		return inputLogin;
	}

	public void setInputLogin(WebElement inputLogin) {
		this.inputLogin = inputLogin;
	}

	public WebElement getInputSenha() {
		return inputSenha;
	}

	public void setInputSenha(WebElement inputSenha) {
		this.inputSenha = inputSenha;
	}

	public WebElement getButtonEntrar() {
		return buttonEntrar;
	}

	public void setButtonEntrar(WebElement buttonEntrar) {
		this.buttonEntrar = buttonEntrar;
	}

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
