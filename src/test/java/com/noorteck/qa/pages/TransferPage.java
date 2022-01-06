package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-transfers[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement originalAcct;
	
	@FindBy(xpath = "//span[contains(text(),'Rainy Day')]")
	WebElement moveToRainyDay;//hower
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-transfers[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement destinationAcct;
	
	@FindBy(xpath = "//span[contains(text(),'Investing')]")
	WebElement clickInvesting;
	
	@FindBy(xpath = "//input[@id='mat-input-0']")
	WebElement amountField;
	
	@FindBy(css = ".v24DomSyncHide.v24DomSyncDenyAgent.mat-input-element.mat-form-field-autofill-control.cdk-text-field-autofill-monitored")
    WebElement socialSecurity;
	
	@FindBy(css = ".v24DomSyncMaskInput.v24DomSyncDenyAgent.mat-input-element.mat-form-field-autofill-control.cdk-text-field-autofill-monitored")
	WebElement atmPin;
	
	@FindBy(css = ".v24DomSyncDenyAgent.mat-raised-button.mat-primary")
	WebElement transferFund;
	
	@FindBy(css = ".mat-card-title")
	WebElement transferSuccess;
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void originalAccount() {
		click(originalAcct);
	}
	public void clickRainy() {
		moveToElementAndClick(moveToRainyDay);
	}
	public void destinAcct() {
		click(destinationAcct);
	}
	
	public void clickInvest() {
		moveToElementAndClick(clickInvesting);
	}
	
	public void enterAmountField(String amount) {
		enter(amountField, amount);
	}
	
	public void enterSocial(String amount) {
		enter(socialSecurity, amount);
	}
	
	public void enterPin(String atmpin) {
		enter(atmPin, atmpin);
	}
	
	public void clickTransferFund() {
		click(transferFund);
	}
	
	public boolean displayMessage() {
		return isDisplayed(transferSuccess);
	}
	
	
	
	
}
