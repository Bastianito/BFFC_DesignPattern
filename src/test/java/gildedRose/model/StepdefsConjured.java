package gildedRose.model;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gildedRose.model.Inventory;
import gildedRose.model.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StepdefsConjured {
    private Inventory inventory;
    private Item[] items ;
    private Item vest;
    private Item conjured;

    @Given("^I have a new inventory$")
    public void iHaveANewInventory() {
        inventory = new Inventory();
        items = inventory.getItems();
        conjured = items[5];
    }

    @Then("^the quality of the conjured item is initialized as (\\d+)$")
    public void theQualityOfTheConjuredIs( int conjuredQuality) {
        assertThat(conjured.getQuality(), is(conjuredQuality));
    }

    @When("^I update the inventory$")
    public void iUpdateTheInventory() {
        inventory.updateQuality();
    }

    @Then("^the quality of the conjured item is (\\d+)$")
    public void theQualityOfTheConjuredItemIs(int conjuredQuality) {
        assertThat(conjured.getQuality(), is(conjuredQuality));
    }
}
