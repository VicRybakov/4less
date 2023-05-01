
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Homjob {

@Test
    void SuccessTest () {
    open("https://github.com/");
    $(".header-menu-wrapper").$(byText("Solutions")).hover();
    $(byText("Enterprise")).click();
    $("div.position-relative h1").shouldHave(text("Build like the best"));
    }
}