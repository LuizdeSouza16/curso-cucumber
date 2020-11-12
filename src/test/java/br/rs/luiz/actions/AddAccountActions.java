package br.rs.luiz.actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import br.rs.luiz.pageobjects.AddAccountObjects;

public class AddAccountActions {

	private static AddAccountObjects objAccount;
	public AddAccountActions(WebDriver driver) {
		objAccount = new AddAccountObjects(driver);
	}
	
	public void inserirNome(String nome) {
		objAccount.getInputNome().sendKeys(nome);
	}
	
	public void clickSalvar() {
		objAccount.getButtonSalvar().click();
	}
	
	public void verificarSucesso() {
		Assert.assertTrue("Conta não foi cadastrada",objAccount.getDivSuccess().getAttribute("innerText").contains("Conta adicionada com sucesso!"));
	}
	
	public void notificarNomeObrigatorio() {
		Assert.assertTrue("Problema na verificação do alert",objAccount.getDivAvisoNome().getAttribute("innerText").contains("Informe o nome da conta"));
	}
	
	public void notificarNomeJaExiste() {
		Assert.assertTrue("Problema na verificação do alert",objAccount.getDivNomeJaExiste().getAttribute("innerText").contains("Já existe uma conta com esse nome!"));
	}
	
}
