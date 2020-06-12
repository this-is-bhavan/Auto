package com.adactin.stepdefnition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
public void beforeHooks() {
	System.out.println("Secnario started");
}
	@After
public void afterHooks() {
		System.out.println("Secnario completed");
}
}
