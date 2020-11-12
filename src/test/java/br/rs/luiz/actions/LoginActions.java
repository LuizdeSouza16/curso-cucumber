package br.rs.luiz.actions;

import org.openqa.selenium.WebDriver;

import br.rs.luiz.pageobjects.LoginPageObjects;

public class LoginActions {

	private static LoginPageObjects objLogin;
	
	public LoginActions(WebDriver driver) {
		objLogin = new LoginPageObjects(driver);
	}
	
	public void informaUsuario(String email) {
		objLogin.getInputLogin().sendKeys(email);
	}
	
	public void informaSenha(String senha) {
		objLogin.getInputSenha().sendKeys(senha);
	}
	
	public void clickarEntrar() {
		objLogin.getButtonEntrar().click();
	}
}
