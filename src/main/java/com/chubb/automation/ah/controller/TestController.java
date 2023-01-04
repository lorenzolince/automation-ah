/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chubb.automation.ah.controller;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lorenzolince
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/chubb")
public class TestController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/testChrome", method = RequestMethod.POST)
    public void testChrome() {
        LOGGER.info("INIT TEST 1");
        try {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setCapability("browserName", "chrome");
            chromeOptions.setCapability("browserVersion", "109.0");
            chromeOptions.setCapability("platformName", "LINUX");
            chromeOptions.setCapability("se:noVncPort", "7900");
            chromeOptions.setCapability("se:vncEnabled", "true");
            WebDriver driver = new RemoteWebDriver(new URL("http://selenium-hub:4444"), chromeOptions);
            driver.get("http://www.google.com");
            Thread.sleep(10000);
            driver.quit();

        } catch (Exception e) {
            System.out.println("############ Exception ##########");
            System.out.println(e.getMessage());
        }
    }

    @RequestMapping(value = "/testFirefox", method = RequestMethod.POST)
    public void testFirefox() {
        LOGGER.info("INIT TEST testFirefox");
        try {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setCapability("browserName", "firefox");
//            firefoxOptions.setCapability("browserVersion", "109.0b7");
            firefoxOptions.setCapability("platformName", "LINUX");
            firefoxOptions.setCapability("se:noVncPort", "7900");
            firefoxOptions.setCapability("se:vncEnabled", "true");
            WebDriver driver = new RemoteWebDriver(new URL("http://selenium-hub:4444"), firefoxOptions);
            driver.get("http://www.google.com");
            Thread.sleep(10000);
            driver.quit();

        } catch (Exception e) {
            System.out.println("############ Exception ##########");
            System.out.println(e.getMessage());
        }
    }

    @RequestMapping(value = "/testEdge", method = RequestMethod.POST)
    public void testEdge() {
        LOGGER.info("INIT TEST testEdge");
        try {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.setCapability("browserName", "MicrosoftEdge");
            edgeOptions.setCapability("browserVersion", "109.0");
            edgeOptions.setCapability("platformName", "LINUX");
            edgeOptions.setCapability("se:noVncPort", "7900");
            edgeOptions.setCapability("se:vncEnabled", "true");
            WebDriver driver = new RemoteWebDriver(new URL("http://selenium-hub:4444"), edgeOptions);
            driver.get("http://www.google.com");
            Thread.sleep(10000);
            driver.quit();

        } catch (Exception e) {
            System.out.println("############ Exception ##########");
            System.out.println(e.getMessage());
        }
    }
}
