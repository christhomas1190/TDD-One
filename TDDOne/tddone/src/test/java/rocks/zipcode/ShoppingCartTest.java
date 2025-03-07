package rocks.zipcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    private double taxRate;
    private double price;
    private String name;
    private int quantity;
    private ShoppingCart shoppingCartTests;
    private ShoppingCart.Item newItem;
    private List<ShoppingCart.Item> shoppingCartList;
@BeforeEach
    public void setUp(){

        this.shoppingCartTests = new ShoppingCart(taxRate);
        this.newItem = new ShoppingCart.Item(name, price, quantity);
    }
    @Test
    public void addingItems(){
//        assertArrayEquals(shoppingCartTests.addItem(newItem));
        //Item newItem= new Item(...);
        //shoppingCart.addItem(newItem);
        //Item expected = s getItem(shoppingCart.getItemCount()-1);
        //assertequal(expected,newItem);

    }

    // TODO: Write tests for the ShoppingCart class
    // Make sure to test all functionality including:
    // - Adding and removing items
    // - Calculating subtotal, tax, and total
    // - Edge cases like an empty cart
    // - Invalid inputs (e.g., negative prices, zero quantity)



}