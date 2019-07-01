import com.bdd.michelin.domain.Order;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

import java.util.List;

public class CocktailSteps {

    private Order order;
    @Given("^Romeo who wants to buy a drink$")
    public void romeoWhoWantsToBuyADrink() {
        order =new Order();
        order.declareOwner("Romeo");
    }

    @When("^an order is declared for Juliette$")
    public void anOrderIsDeclaredForJuliette() {
        order.declareOwner("Juliette");
    }

    @Then("^there is no cocktail in the order$")
    public void thereIsNoCocktailInTheOrder() {
        List<String > cocktails = order.getCocktails();
        Assertions.assertThat(cocktails.size())
                .isEqualTo(0);
    }
}
