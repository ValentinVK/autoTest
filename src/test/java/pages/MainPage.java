package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    public SelenideElement SingInBtn = $("app-header button.header_signin");
    public SelenideElement LoginFormTitle = $("app-signin-modal > div.modal-header > h4 ");
    private SelenideElement emailFild = $("#signinEmail");
    private SelenideElement passwordField = $("#signinPassword");
    private SelenideElement loginBtn = $(" app-signin-modal button.btn.btn-primary");

    public MainPage open(){
        Selenide.open(baseUrl,"","guest","welcome2qauto" );
        return this;
    }
    public MainPage clickSingInBtn(){
        SingInBtn.shouldBe(visible).click();
        return this;
    }
    public MainPage checkLoginFormTitle(String expectedText) {
        LoginFormTitle.shouldHave(text(expectedText));
        return this;
    }

    public MainPage setEmail(String email) {
        emailFild.sendKeys(email);
        return this;
    }

    public MainPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public PanelGaragePage clickLoginBtn() {
        loginBtn.shouldHave(visible).click();
        return new PanelGaragePage();
    }


}
