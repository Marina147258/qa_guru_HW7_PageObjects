package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    void successfulFillForm() {
        String fullName = "Marina Ivanova";
        String email = "123@mail.ru";
        String currentAddress = "123000, Russia, Moscow, Tsvetnoi 1";
        String permanentAddress = "123000, India, Goa, Street 1";

        textBoxPage
                .openPage()
                .setFullName(fullName)
                .setEmailInput(email)
                .setCurrentAddressInput(currentAddress)
                .setPermanentAddressInput(permanentAddress)
                .clickSubmit()
                .checkUserName(fullName)
                .checkUserEmail(email)
                .checkCurrentAddress(currentAddress)
                .checkPermanentAddress(permanentAddress);
    }
}