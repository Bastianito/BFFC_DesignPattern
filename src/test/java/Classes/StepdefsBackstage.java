package Classes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StepdefsBackstage {
    private Inventory inventory;
    private Item[] items ;
    private Item vest;
    private Item backstage;

    @Given("^I have a new inventory$")
    public void iHaveANewInventory() throws Throwable {
        inventory = new Inventory();
        items = inventory.getItems();
        backstage = items[4];
    }

    @Then("^the quality of the backstage item is initialized as (\\d+)$")
    public void theQualityOfTheBackstageIs( int backstageQuality) throws Throwable {
        assertThat(backstage.getQuality(), is(backstageQuality));
    }

    @When("^I update the inventory$")
    public void iUpdateTheInventory() throws Throwable {
        inventory.updateQuality();
    }

    @Then("^the quality of the conjured item is (\\d+)$")
    public void theQualityOfTheBackstageItemIs(int backstageQuality) throws Throwable {
        assertThat(backstage.getQuality(), is(backstageQuality));
    }
}
