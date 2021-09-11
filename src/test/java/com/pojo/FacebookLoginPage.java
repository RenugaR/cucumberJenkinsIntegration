package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;
import com.utils.BaseClass;


public class FacebookLoginPage extends BaseClass{

	public FacebookLoginPage() {
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(id="email")
	private WebElement txtUserName;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(WebElement txtUserName) {
		this.txtUserName = txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}

	
}
