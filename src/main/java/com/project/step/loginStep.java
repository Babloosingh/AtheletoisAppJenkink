package com.project.step;

import com.project.Po.loginPo;
import com.project.capabilitySetup.capabilitySetup;

import io.qameta.allure.Step;

public class loginStep extends capabilitySetup {

	@Step("Eter Inivitioons code")
	public static void enterInvitition() {
		enterText("xpath", loginPo.ENTERINIVITITION_CODE, "ungqgx");
	}

	@Step("Click On Send Button")
	public static void clickonSendButton() {
		click("xpath", loginPo.SEND_BUTTON);
	}

}
