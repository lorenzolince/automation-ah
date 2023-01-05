/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chubb.automation.ah.service.impl;

import com.chubb.automation.ah.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author lorenzolince
 */
@Service
public class LoginServiceImpl implements LoginService {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public void senLogin() {
        LOGGER.info("################ TEST ############");
    }

}
