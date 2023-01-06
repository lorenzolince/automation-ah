/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chubb.automation.ah.test.steps;

import com.chubb.automation.ah.service.LoginService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author lorenzolince
 */
public class LoginCucumberStepTest {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginService loginService;

    @Given ("^The user access the Chubb sales portal$")
    public void navigateToChubb() throws InterruptedException {
        loginService.navigateToChubb();
    }

    @When ("^the user enter a valid username and password$")
    public void enterUsernamePassword() throws InterruptedException {
       loginService.enterUsernamePassword();
    }

    @Then ("^the user can see the Chubb sales menu$")
    public void openSalesMenu() throws InterruptedException {
        Assert.assertTrue("No se muestra el enlace Weblink", loginService.openSalesMenu());
    }
}
