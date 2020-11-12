package br.rs.luiz.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {

	private WebDriver driver;
	
	@FindBy(linkText = "Contas")
	private WebElement linkContas;
	
	@FindBy(linkText = "Adicionar")
	private WebElement linkAdicionar;

	public WebElement getLinkContas() {
		return linkContas;
	}

	public void setLinkContas(WebElement linkContas) {
		this.linkContas = linkContas;
	}

	public WebElement getLinkAdicionar() {
		return linkAdicionar;
	}

	public void setLinkAdicionar(WebElement linkAdicionar) {
		this.linkAdicionar = linkAdicionar;
	}

	public HomeObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
