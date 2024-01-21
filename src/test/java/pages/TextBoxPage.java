package pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class TextBoxPage {
    private final SelenideElement fullNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit"),
            resultName = $("#output #name"),
            resultEmail = $("#output #email"),
            resultCurrentAddress = $("#output #currentAddress"),
            resultPermanentAddress = $("#output #permanentAddress");

    public TextBoxPage openPage() {
        open("/text-box");

        return this;
    }

    public TextBoxPage setFullName(String value) {
        fullNameInput.setValue(value);

        return this;
    }

    public TextBoxPage setEmailInput(String value) {
        emailInput.setValue(value);

        return this;
    }

    public TextBoxPage setCurrentAddressInput(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage setPermanentAddressInput(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage clickSubmit() {
        submitButton.click();

        return this;
    }

    public TextBoxPage checkUserName(String name) {
        resultName.shouldHave(text("Name:" + name));

        return this;
    }

    public TextBoxPage checkUserEmail(String email) {
        resultEmail.shouldHave(text("Email:" + email));

        return this;
    }

    public TextBoxPage checkCurrentAddress(String currentAddress) {
        resultCurrentAddress.shouldHave(text("Current Address :" + currentAddress));

        return this;
    }

    public TextBoxPage checkPermanentAddress(String permanentAddress) {
        resultPermanentAddress.shouldHave(text("Permananet Address :" + permanentAddress));

        return this;
    }

}