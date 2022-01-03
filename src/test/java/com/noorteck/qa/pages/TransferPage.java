package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {
	
	@FindBy(css = ".mat-select-placeholder.ng-tns-c10-2.ng-star-inserted")
	WebElement originalAcct;
	
	@FindBy(css = "//span[text()='Rainy Day']")
	WebElement clickRainyDay;
	
	@FindBy(css = "span.mat-select-placeholder.ng-tns-c10-4.ng-star-inserted")
	WebElement destinationAcct;
	
	@FindBy(css = "//span[text()='Investing']")
	WebElement clickInvesting;
	
	@FindBy(xpath = "//input[@id='mat-input-0']")
	WebElement amountField;
	
	@FindBy(css = ".v24DomSyncHide.v24DomSyncDenyAgent.mat-input-element.mat-form-field-autofill-control.cdk-text-field-autofill-monitored")
    WebElement socialSecurity;
	
	@FindBy(css = ".v24DomSyncMaskInput.v24DomSyncDenyAgent.mat-input-element.mat-form-field-autofill-control.cdk-text-field-autofill-monitored")
	WebElement atmPin;
	
	@FindBy(css = ".v24DomSyncDenyAgent.mat-raised-button.mat-primary")
	WebElement transferFund;
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void originalAccount() {
		click(originalAcct);
	}
	
	public void clickRainy() {
		click(clickRainyDay);
	}
	public void destinAcct() {
		click(destinationAcct);
	}
	
	public void clickInvest() {
		click(clickInvesting);
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
	
	
	
	
}
