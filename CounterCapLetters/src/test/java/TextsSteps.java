import domain.TextsDomain;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import service.TextsService;

public class TextsSteps {
    private TextsService textsService;
    private TextsDomain textsDomain;
    private int result;

    @Given("I have the text {string}")
    public void iHaveTheText(String text) {
        textsDomain=new TextsDomain(text);
        textsService=new TextsService();
    }

    @When("I count capital letters")
    public void iCountCapitalLetters() {
        result = textsService.couterCapLetters(textsDomain);
    }

    @Then("The result should be {int}")
    public void theResultShouldBe(int expected) {
        Assertions.assertEquals(expected, result);
    }

}
