package tests;
import org.junit.jupiter.api.Test;
import pages.components.TextBoxPage;
public class TestBoxTests extends TestBase {
    @Test
    void fillFormTest() {
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage
                .openPage("Student Registration Form")
                .setUserName("Marina Ivanova")
                .setUserEmail("123@mail.ru")
                .setCurrentAddress("123000, Russia, Moscow, Tsvetnoi 1")
                .setPermanentAddress("123000, India, Goa, Street 1")
                .clickSubmit()
                .checkUserName("Marina Ivanova")
                .checkUserEmail("123@mail.ru")
                .checkCurrentAddress("123000, Russia, Moscow, Tsvetnoi 1")
                .checkPermanentAddress("123000, India, Goa, Street 1");
    }
}