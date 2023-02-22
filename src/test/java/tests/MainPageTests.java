package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTests extends BaseTest {

    @Test
    public void checkLoginFormTitle() {
        new MainPage().open()
                .clickSingInBtn()
                .checkLoginFormTitle("Log in");
    }
    @Test
    public void checkLogin() {
        new MainPage().open()
                .clickSingInBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("valyok.punk@gmail.com")
                .setPassword("28052022Aa")
                .clickLoginBtn()
                .checkMyProfile("My profile");
    }
    @Test
    public void checkLogOut() {
        new MainPage().open()
                .clickSingInBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("valyok.punk@gmail.com")
                .setPassword("28052022Aa")
                .clickLoginBtn()
                .checkMyProfile("My profile")
                .clickAddCarBtn()
                .checkAddACar("Add a car");
    }
    @Test
    public void checkAddAnExpense() {
        new MainPage().open()
                .clickSingInBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("valyok.punk@gmail.com")
                .setPassword("28052022Aa")
                .clickLoginBtn()
                .checkMyProfile("My profile")
                .clickAddAnExpenseBtn()
                .checkAddAnExpense("Add an expense");
    }
    @Test
    public void checkEditACar() {
        new MainPage().open()
                .clickSingInBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("valyok.punk@gmail.com")
                .setPassword("28052022Aa")
                .clickLoginBtn()
                .checkMyProfile("My profile")
                .clickEditACarBtn()
                .checkEditACar("Edit a car");
    }
}
