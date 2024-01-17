package pages.components;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class TextBoxPage extends TestBase {
    @Test
    public TextBoxPage openPage() {
        open("/text-box");
        return this;
    }
    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }
    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }
    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }
    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }
    public TextBoxPage submit() {
        submitInput.click();
        return this;
    }
    public TextBoxPage checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));

        return this;
    }
}