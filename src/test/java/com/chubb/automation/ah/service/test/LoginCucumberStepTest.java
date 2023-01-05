/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chubb.automation.ah.service.test;

import com.chubb.automation.ah.service.LoginService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Given("^the bag is empty$")
    public void the_bag_is_empty() {
        LOGGER.info("################ Given ############");
    }

    @When("^I put 1 potato in the bag$")
    public void i_put_something_in_the_bag() {
        LOGGER.info("################ When ############");
    }

    @Then("^the bag should contain only 1 potato$")
    public void the_bag_should_contain_only_something() {
        LOGGER.info("################ Then ############");
        loginService.senLogin();
    }
}
