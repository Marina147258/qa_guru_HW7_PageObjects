package pages;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class RegistrationPage extends TestBase {
    @Test
    private SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitInput = $("#submit");

    public RegistrationPage openPage() {
        open("/text-box");
        return this;
    }
    public RegistrationPage setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }
    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }
    public RegistrationPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }
    public RegistrationPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }
    public RegistrationPage submit() {
        submitInput.click();
        return this;
    }
    public RegistrationPage checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));
        return this;
    }
}