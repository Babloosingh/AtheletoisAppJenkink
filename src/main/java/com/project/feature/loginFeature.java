package com.project.feature;

import com.project.step.loginStep;

import io.qameta.allure.Step;

public class loginFeature extends loginStep {
	@Step("Go login pages")
	public void goTologinPages() {
		enterInvitition();
		clickonSendButton();


	}

}
