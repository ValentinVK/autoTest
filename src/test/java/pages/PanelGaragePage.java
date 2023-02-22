package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PanelGaragePage {
    private SelenideElement myProfile = $ ("#userNavDropdown");
    private SelenideElement addCarBtn =$("app-garage > div > div.panel-page_heading.d-flex.justify-content-between > button");
    private SelenideElement addAnExpenseBtn = $ ("button.car_add-expense.btn.btn-success");
    private SelenideElement editACarBtn = $ ("button.car_edit.btn.btn-edit");
    private SelenideElement addACar = $ ("app-add-car-modal > div.modal-header > h4");
    private SelenideElement addAnExpense = $ ("app-add-expense-modal");
    private SelenideElement editACar = $ ("app-edit-car-modal");

    public PanelGaragePage checkMyProfile(String profileText) {
        myProfile.shouldHave(Condition.text(profileText));
        return this;
    }

    public PanelGaragePage clickAddCarBtn() {
        addCarBtn.shouldHave(visible).click();
        return this;
    }

    public PanelGaragePage clickAddAnExpenseBtn() {
        addAnExpenseBtn.shouldHave(visible).click();
        return this;
    }

    public PanelGaragePage clickEditACarBtn() {
        editACarBtn.shouldHave(visible).click();
        return this;
    }

    public PanelGaragePage checkAddACar(String profileText) {
        addACar.shouldHave(Condition.text(profileText));
        return this;

    }

    public PanelGaragePage checkAddAnExpense(String profileText) {
        addAnExpense.shouldHave(Condition.text(profileText));
        return this;
    }

    public PanelGaragePage checkEditACar(String profileText) {
        editACar.shouldHave(Condition.text(profileText));
        return this;
    }
}
