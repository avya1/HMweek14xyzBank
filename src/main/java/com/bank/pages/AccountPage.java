package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Watchable;

public class AccountPage extends Utility {
    public AccountPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccount;
    @FindBy(xpath = "//select[@id='userSelect']")
           WebElement customerSearch;
    @FindBy(xpath = "//select[@id='currency']")
          WebElement currency;
    @FindBy(xpath = "//button[@type='submit']")
            WebElement processButton;


    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
    public void selectCustomerSearch()  {

        selectFromDropDown(customerSearch,"6");

    }
    public void selectCurrency(){
        selectFromDropDown(currency,"Pound");
    }
    public void clickOnProcessButton(){
        clickOnElement(processButton);
    }
    public void verifyPopWindowTextAndAccept(String exp){
        alertPopUpWindowAndVerifyText(exp);
    }


}
