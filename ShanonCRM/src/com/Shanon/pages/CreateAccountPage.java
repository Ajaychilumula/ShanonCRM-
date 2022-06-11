package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class CreateAccountPage {

	@FindBy(xpath = "//a[@id=\"Accountstab\"]") private WebElement AccountTab;
	public CreateAccountPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
		
	}
	public WebElement getAccountTab() {
		return AccountTab;
		
	}
public void clickAccountTab() {
	AccountTab.click();
}
}
