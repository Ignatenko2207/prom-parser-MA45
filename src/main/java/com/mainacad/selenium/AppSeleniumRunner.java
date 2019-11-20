package com.mainacad.selenium;

import com.mainacad.model.Item;
import com.mainacad.selenium.driver.WebDriverFactory;
import com.mainacad.selenium.model.Account;
import com.mainacad.selenium.service.PromAccountService;
import com.mainacad.util.Timer;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class AppSeleniumRunner {

    private static final Logger LOG = Logger.getLogger(AppSeleniumRunner.class.getName());

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getChromedriver();

        Account account = new Account
                ("petechkin123891", "123456789", "Alex", "Bond", "tyreey1234885@ukr.net");

        driver = PromAccountService.registerAccount(account, driver);

        driver = PromAccountService.checkRegisteredAccount(account, driver);

        if (driver == null) {
            LOG.warning("Account was not registered!");
        }
        else {
            LOG.info("Congratulations!!!");
            driver.quit();
        }

    }
}
