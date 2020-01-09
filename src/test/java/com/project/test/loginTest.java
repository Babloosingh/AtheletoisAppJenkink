package com.project.test;

import org.testng.annotations.Test;

import com.project.feature.loginFeature;

public class loginTest extends loginFeature {

	@Test(description = "go to login pages")
	public void goToLoginWithValideUser() {
		goTologinPages();

	}

}
