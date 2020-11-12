package br.rs.luiz.actions;

import org.openqa.selenium.WebDriver;

import br.rs.luiz.pageobjects.HomeObjects;

public class HomeActions {
	
	private static HomeObjects objHome;
	
	public HomeActions(WebDriver driver) {
		objHome = new HomeObjects(driver);
	}
	
	public void clickContas(){
		objHome.getLinkContas().click();
	}
	
	public void clickAdicionar(){
		objHome.getLinkAdicionar().click();
	}
	
	

}
