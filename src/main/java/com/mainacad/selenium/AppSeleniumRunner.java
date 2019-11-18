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
                ("petechkin123456", "123456789", "Alex", "Bond", "pet12349875@ukr.net");

        driver = PromAccountService.registerAccount(account, driver);

        driver.quit();
    }
}
