/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chubb.automation.ah.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 *
 * @author lorenzolince
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/",
        glue = "com.chubb.automation.ah.test")
public class LoginCucumberIntegrationTest {

}
