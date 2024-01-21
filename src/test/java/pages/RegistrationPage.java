package pages;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.ModalTableComponent;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class RegistrationPage {
    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement genderWrapper = $("#genterWrapper");
    private final SelenideElement mobileNumberInput = $("#userNumber");
    private final SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    private final SelenideElement submitButton = $("#submit");
    private final CalendarComponent calendarComponent = new CalendarComponent();
    private final ModalTableComponent modalTableComponent = new ModalTableComponent();

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setMobileNumber(String value) {
        mobileNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage clickOnSubmit() {
        removeBanner();
        submitButton.click();
        return this;
    }

    private static void removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

    public RegistrationPage checkModalTableResult(String key, String value) {
        modalTableComponent.checkTableResult(key, value);
        return this;
    }

    public RegistrationPage checkMobileNumberValidation() {
        String redColor = "rgb(220, 53, 69)";
        mobileNumberInput.shouldHave(cssValue("border-color", redColor));
        ;
        return this;
    }
}