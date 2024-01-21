package tests;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
public class RegistrationWithPageObjectsTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    void successfulRegistrationWithRequiredFields() {
        registrationPage
                .openPage()
                .setFirstName("Marina")
                .setLastName("Ivanova")
                .setGender("Female")
                .setMobileNumber("1234558834")
                .setDateOfBirth("12", "July", "1988")
                .clickOnSubmit()
                .checkModalTableResult("Student Name", "Marina Ivanova")
                .checkModalTableResult("Mobile", "1234558834")
                .checkModalTableResult("Date of Birth", "12 July,1988")
                .checkModalTableResult("Gender", "Female");
    }

    @Test
    void unsuccessfulRegistrationWithoutMobileNumber() {
        registrationPage
                .openPage()
                .setFirstName("Marina Ivanova")
                .setLastName("123@mail.ru")
                .setGender("Female")
                .setDateOfBirth("12", "July", "1988")
                .clickOnSubmit()
                .checkMobileNumberValidation();
    }
}