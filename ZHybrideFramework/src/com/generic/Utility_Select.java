package com.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Select
{

	public static Select Selectdrop(WebElement drop)
	{
		Select sel=new Select(drop);
		return sel;
		
	}
	
}
