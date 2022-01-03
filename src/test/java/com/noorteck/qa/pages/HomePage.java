package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {
	
	@FindBy(xpath = "//span[contains(text(),'Transfer')]")
	WebElement transferClick;
	
	@FindBy(xpath = "//span[contains(text(),'Loans')]")
	WebElement loansClick;
	
	@FindBy(xpath = "//span[contains(text(),'LogOut')]")
	WebElement logOutClick;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickTransfer() {
		click(transferClick);
	}
	
	public void clickLoans() {
		click(loansClick);
	}
	
	public void logoutClick() {
		click(logOutClick);
	}

}
