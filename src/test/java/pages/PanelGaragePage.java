package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PanelGaragePage {
    private SelenideElement myProfile = $ ("#userNavDropdown");
    private SelenideElement AddCarBtn =$("app-garage > div > div.panel-page_heading.d-flex.justify-content-between > button");
    private SelenideElement AddAnExpenseBtn = $ ("button.car_add-expense.btn.btn-success");
    private SelenideElement EditACarBtn = $ ("button.car_edit.btn.btn-edit");
    private SelenideElement AddACar = $ ("app-add-car-modal > div.modal-header > h4");
    private SelenideElement AddAnExpense = $ ("app-add-expense-modal");
    private SelenideElement EditACar = $ ("app-edit-car-modal");

    public PanelGaragePage checkMyProfile(String profileText) {
        myProfile.shouldHave(Condition.text(profileText));
        return this;
    }

    public PanelGaragePage clickAddCarBtn() {
        AddCarBtn.shouldHave(visible).click();
        return this;
    }

    public PanelGaragePage clickAddAnExpenseBtn() {
        AddAnExpenseBtn.shouldHave(visible).click();
        return this;
    }

    public PanelGaragePage clickEditACarBtn() {
        EditACarBtn.shouldHave(visible).click();
        return this;
    }

    public PanelGaragePage checkAddACar(String profileText) {
        AddACar.shouldHave(Condition.text(profileText));
        return this;

    }

    public PanelGaragePage checkAddAnExpense(String profileText) {
        AddAnExpense.shouldHave(Condition.text(profileText));
        return this;
    }

    public PanelGaragePage checkEditACar(String profileText) {
        EditACar.shouldHave(Condition.text(profileText));
        return this;
    }
}
