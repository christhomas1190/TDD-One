package rocks.zipcode;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    ShoppingCart.Item newItem = new ShoppingCart.Item("Papaya",20, 2);
    private double taxRate;
//    private double price;
//    private String name;
//    private int quantity;
    private ShoppingCart shoppingCart;
//    private ShoppingCart.Item newItem;
    private List<ShoppingCart.Item> shoppingCartList;
    @BeforeEach
    public void setUp(){
        double taxRate =.07;

        this.shoppingCart = new ShoppingCart(taxRate);
    }
    @Test
    public void addingItems(){
    shoppingCart.addItem(newItem);
        assertEquals(1,shoppingCart.getItemCount());
//        assertArrayEquals(shoppingCartTests.addItem(newItem));
        //Item newItem= new Item(...);
        //shoppingCart.addItem(newItem);
        //Item expected = s getItem(shoppingCart.getItemCount()-1);
        //assertequal(expected,newItem);
    } @Test
    public void removeItems(){
    shoppingCart.removeItem(newItem);
        assertEquals(0,shoppingCart.getItemCount());
//        assertArrayEquals(shoppingCartTests.addItem(newItem));
        //Item newItem= new Item(...);
        //shoppingCart.addItem(newItem);
        //Item expected = s getItem(shoppingCart.getItemCount()-1);
        //assertequal(expected,newItem);
    }
    @Test
    public void subTotal(){
        shoppingCart.addItem(newItem);
        shoppingCart.getSubtotal();
        assertEquals(20,shoppingCart.getSubtotal());

    }
    @Test
    public void taxes(){
        shoppingCart.addItem(newItem);

        assertEquals(1.4,shoppingCart.getTaxAmount(), 0.001);


    }@Test
    public void totalTest(){
        shoppingCart.addItem(newItem);

        assertEquals(21.4,shoppingCart.getTotal(), 0.001);
    }
    @Test
    public void emptyTest(){
        shoppingCart.addItem(newItem);
        newItem.setQuantity(8);
        assertEquals(8,newItem.getQuantity(), 0.001);
    }
    @Test
    public void negativePrice(){
//        shoppingCart.addItem(newItem);
//        Exception exception = assertThrows(IllegalArgumentException.class, ()->){
            assertFalse(newItem.getPrice() <0);
        };
    @Test
    public void negativeQuantity(){
//        shoppingCart.addItem(newItem);
//        Exception exception = assertThrows(IllegalArgumentException.class, ()->){
        assertFalse(newItem.getQuantity() <0);
    };
//
//
//        assertEquals(-5,newItem.getPrice(), 0.001);
    }
//    @Test
//    public void emptyCart(){
//        shoppingCart.
//        assertEquals(0,ShoppingCart.getPrice());
//
//    }

    // TODO: Write tests for the ShoppingCart class
    // Make sure to test all functionality including:
    // - Adding and removing items
    // - Calculating subtotal, tax, and total
    // - Edge cases like an empty cart
    // - Invalid inputs (e.g., negative prices, zero quantity)



