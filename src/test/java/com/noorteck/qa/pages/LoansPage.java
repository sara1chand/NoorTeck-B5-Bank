package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI {

	@FindBy(xpath = "//input[@placeholder='First name, Last name']")
	WebElement nameField;

	@FindBy(xpath = "//input[@placeholder='Street, City, Zip Code']")
	WebElement addressField;

	@FindBy(css = ".mat-select-placeholder.ng-tns-c10-12.ng-star-inserted")
	WebElement loanType;

	@FindBy(xpath = "//span[text()='Retirement']")
	WebElement clickRetire;

	@FindBy(xpath = "//input[starts-with(@placeholder,'Ex. 1')]")
	WebElement yearRepay;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement clickNext;

	@FindBy(xpath = "//input[starts-with(@placeholder,'Ex. 10')]")
	WebElement loanAmount;

	@FindBy(xpath = "//input [@placeholder='Ex. Smith']")
	WebElement motherMaiden;

	@FindBy(xpath = "//input [@placeholder='Format: XXX-XX-XXXX']")
	WebElement socialSecurity;

	@FindBy(xpath = "//span[text()='Back']")
	WebElement backButton;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement confirmButton;

	@FindBy(xpath = "//span[text()='Back']")
	WebElement backButton1;

	public LoansPage() {
		PageFactory.initElements(driver, this);

	}

	public void enterName(String firstname) {
		enter(nameField, firstname);
	}

	public void enterAddress(String addressfield) {
		enter(addressField, addressfield);
	}

	public void enterLoan() {
		click(clickRetire);
	}

	public void enterYearRepay(String repay) {
		enter(yearRepay, repay);
	}

	public void nextClick() {
		click(clickNext);
	}

	public void enterLoanAmount(String loanamount) {
		enter(loanAmount, loanamount);
	}

	public void enterMotherMaiden(String maiden) {
		enter(motherMaiden, maiden);
	}

	public void enterSocialSecurity(String socialsecurity) {
		enter(socialSecurity, socialsecurity);
	}
	
	public void clickBack() {
		click(backButton);
	}
	
	public void clickNext() {
		click(nextButton);
	}
	
	public void clickConfirm() {
		click(confirmButton);
	}
	
	public void clickbackButton1() {
		click(backButton1);
	}

}
