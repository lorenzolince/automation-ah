/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chubb.automation.ah.service.impl;

import com.chubb.automation.ah.dto.LoginPropertiesDto;
import com.chubb.automation.ah.service.LoginService;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author lorenzolince
 */
@Service
public class LoginServiceImpl implements LoginService {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private WebDriver driver;
    @Autowired
    private WebDriverWait webDriverWait;
    @Autowired
    private LoginPropertiesDto process;
    @Value("${selenium.step.sleep}")
    private int stepSleep;

    @Override
    public void navigateToChubb() throws InterruptedException {
        LOGGER.info("________________ Start Login ____________");
        driver.get(process.getUrlLogin());
        String title = driver.getTitle();
        LOGGER.info("title {}", title);
        Thread.sleep(stepSleep);
    }

    @Override
    public void enterUsernamePassword() throws InterruptedException {

        LOGGER.info("________________ enterUsernamePassword  ____________");
        driver.findElement(By.id(process.getUserNameKey())).sendKeys(process.getUserName(), Keys.TAB);
        Thread.sleep(stepSleep);
        driver.findElement(By.id(process.getPasswordKey())).sendKeys(process.getPassword(), Keys.ENTER);
        Thread.sleep(stepSleep);
    }

    @Override
    public boolean openSalesMenu() throws InterruptedException {
        boolean result = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(process.getResult()))).isDisplayed();
        Thread.sleep(stepSleep);
        return result;
    }

}
