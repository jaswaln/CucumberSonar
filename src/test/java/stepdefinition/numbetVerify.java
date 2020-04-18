package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class numbetVerify {
    @Given("test one")
    public void test_one() {
        Assert.assertEquals(1, 1);
    }

    @Given("test two")
    public void test_two() {
        Assert.assertEquals(1, 1);
    }

    @Then("test three")
    public void test_three() {
        Assert.assertEquals(1, 1);
    }

}
