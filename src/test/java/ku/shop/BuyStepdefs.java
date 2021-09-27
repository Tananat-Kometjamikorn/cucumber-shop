package ku.shop;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyStepdefs {

    private ProductCatalog catalog;
    private Order order;

    @Before
    public void setup() {
        catalog = new ProductCatalog();
        order = new Order();
    }

    @Given("a product {string} with price {float} exists")
    public void a_product_with_price_exists(String name, double price) {
        catalog.addProduct(name, price);
    }

    @When("I buy {string} with quantity {int}")
    public void i_buy_with_quantity(String name, int quantity) {
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quantity);
    }

    @Then("total should be {float}")
    public void total_should_be(double total) {
        assertEquals(total, order.getTotal());
    }

//    @Given("a product {string} have {int} item in stock")
//    public void a_product_have_item_in_stock(String name, int quantity) {
//        catalog.addProduct(name, 0, quantity);
//    }
//
//    @When("customer buy {string} with quantity {int}")
//    public void customer_buy_with_quantity(String name, int quantity){
//
//    }
//
//    @Then("user say {string}")
//    public void user_say(String result){
//        assertEquals();
//    }
}

