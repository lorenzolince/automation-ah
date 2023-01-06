/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chubb.automation.ah.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author lorenzolince
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "login")
public class LoginPropertiesDto {
    
    private String urlLogin;
    private String userName;
    private String userNameKey;
    private String password;
    private String passwordKey;
    private String result;
}
