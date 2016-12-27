package com.br.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private static final Logger LOG = Logger.getLogger(AddBedroomPage.class.getName());
	@FindBy(id = "formLogin:login")
	private WebElement tfUserName;

	@FindBy(id = "formLogin:senha")
	private WebElement tfPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement btnLogin;
	
	
	public void informUserName(String username){
		LOG.info("filling in the textfield username with: "+ username);
		tfUserName.clear();
		tfUserName.sendKeys(username);
	}
	
	public void informPassword(String password){
		LOG.info("filling in the textfield password with: "+ password);
		tfPassword.clear();
		tfPassword.sendKeys(password);
	}
	
	public void clickLoginButton(){
		LOG.info("Clicking the button Login");
		btnLogin.click();
	}
	
	
}
