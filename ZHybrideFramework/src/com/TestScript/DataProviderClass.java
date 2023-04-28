package com.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

import com.generic.DataFromExcell;
import com.generic.frame_canstant;

public class DataProviderClass implements frame_canstant
	{
		@DataProvider(name="logincred")
		public Object[][] testData() throws EncryptedDocumentException, IOException 
		{
			Object[][] value = DataFromExcell.getMultipleData(SheetName);
			return value;
		}
	}


