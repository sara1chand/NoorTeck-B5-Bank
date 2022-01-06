package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;


public class BankTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "https://usdemo.vee24.com/#/transactions";

		

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);

		initializeClassObj();
	     TestCaseOne();
		 TestCaseTwo();

		CommonUI.quitBrowser();
	}


	public static void TestCaseOne() {
		
        homeObj.clickTransfer();
        transferObj.originalAccount();
		transferObj.clickRainy();
		transferObj.destinAcct();
		transferObj.clickInvest();
		transferObj.enterAmountField("1000");
		transferObj.enterSocial("123435677");
		transferObj.enterPin("1234");
		transferObj.clickTransferFund();
		System.out.println(transferObj.displayMessage());


	}

	public static void TestCaseTwo() {
		
		
		homeObj.clickLoan();
		loansObj.enterName("John, Cena");
		loansObj.enterAddress("1234 Cena, Reston, 20155");
		loansObj.clickLoan();
		loansObj.chooseRetire();
		loansObj.enterYearRepay("2");
		loansObj.clickNext();
		loansObj.enterLoanAmount("5000");
		loansObj.enterMotherMaiden("Kim");
		loansObj.enterSocialSecurity("123456778");
		loansObj.clickNext();
		loansObj.clickConfirm();
		System.out.println(loansObj.displayMessage());
		
	}
	
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */