package pages.components;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
public class ModalTableComponent {
    private final SelenideElement table = $(".table-responsive");

    public void checkTableResult(String key, String value) {
        table.find(byText(key))
                .parent()
                .shouldHave(text(value));
    }
}