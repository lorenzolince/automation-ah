/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chubb.automation.ah.conf;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author loren
 */
@Configuration
public class ApplicationConfig {
    
    @Value("${web.driver.chrome.version}")
    private String chromeDriverVersion;
    @Value("${remote.driver}")
    private boolean useRemoteDriver;
    
    @Value("${user.remote.driver.url}")
    private String remoteUrl;
    
     @Value("${selenium.wait.time}")
    private long timeWait;
    
    @Bean
    @Scope
    public WebDriver driverChrome() throws MalformedURLException {
        WebDriver driver = null;
        
        if (useRemoteDriver) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setCapability("browserName", "chrome");
            chromeOptions.setCapability("browserVersion", "109.0");
            chromeOptions.setCapability("platformName", "LINUX");
            chromeOptions.setCapability("se:noVncPort", "7900");
            chromeOptions.setCapability("se:vncEnabled", "true");
            driver = new RemoteWebDriver(new URL(remoteUrl), chromeOptions);
        } else {
            WebDriverManager.chromedriver().version(chromeDriverVersion).setup();
            driver = new ChromeDriver();
        }
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(timeWait, TimeUnit.SECONDS);
        
        return driver;
    }

    @Bean
    @Scope
    public WebDriverWait webDriverWait() {
        WebDriverWait wait = null;
        try {
            wait = new WebDriverWait(driverChrome(), Duration.ofSeconds(timeWait));
        } catch (Exception ex) {
            
        }
        return wait;
    }
}
