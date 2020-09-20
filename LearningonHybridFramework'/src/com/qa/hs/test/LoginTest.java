package com.qa.hs.test;

import org.testng.annotations.Test;
import com.keyword.engine.KeyWordEngine;

public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
@Test
public void loginTest() {
	keyWordEngine = new KeyWordEngine();
	keyWordEngine.startExecution("login");
	
}
}
