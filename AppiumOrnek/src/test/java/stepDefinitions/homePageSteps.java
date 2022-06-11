package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

    homePage homePage = new homePage(DriverFactory.getDriver());
    @Given("oppened lcWaikiki app")
    public void oppenedLcWaikikiApp() {
    }

    @When("click skip buton")
    public void clickSkipButon() {
        homePage.clickSkipButon();
    }

    @When("click {string} title")
    public void clickTitle(String arg0) {
        homePage.clickTitle(arg0);
    }

    @When("click {string} icon")
    public void clickIcon(String arg0) {
        homePage.clickIcon(arg0);
    }

    @When("click {string} category")
    public void clickCategory(String arg0) {
        homePage.clickCategory(arg0);
    }

    @When("click {string} product")
    public void clickProduct(String arg0) {
        homePage.clickProduct(arg0);
    }

    @When("click product name{string}")
    public void clickProductName(String arg0) {
        homePage.clickProductName(arg0);
    }

    @When("add favorite")
    public void addFavorite() {
        homePage.addFavorite();
    }

    @When("close product")
    public void closeProduct() {
        homePage.closeProduct();
    }

    @When("click {string}")
    public void click(String arg0) {
        homePage.click(arg0);
    }

    @Then("check product favorite")
    public void checkProductFavorite() {
        homePage.checkProductFavorite();
    }

    @When("remove product")
    public void removeProduct() {
        homePage.removeProduct();
    }

    @Then("check empty favorite")
    public void checkEmptyFavorite() {
        homePage.checkEmptyFavorite();
    }
}
