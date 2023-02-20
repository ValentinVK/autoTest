package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://qauto2.forstudy.space";
        Configuration.savePageSource = false;
        Configuration.timeout = Long.parseLong("5000");
    }
}
