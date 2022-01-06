package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {
	
	@FindBy(xpath = "//span[text()='Transfer Money']")
	WebElement transferClick;
	
	//@FindBy(xpath = "//a[text()='Loans']")
	//WebElement loansClick;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/mat-toolbar[1]/div[3]/ul[1]/li[4]/a[1]/span[1]")
	WebElement loanPage;
	
	@FindBy(xpath = "//span[@class='label']")
	WebElement logOutClick;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickTransfer() {
		click(transferClick);
	}
	
	//public void clickLoans() {
		//click(loansClick);
	//}
	public void clickLoan() {
		click(loanPage);
	}
	public void logoutClick() {
		click(logOutClick);
	}

}
