import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<String> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    // add cart
    public void addToCart(String product) {
        cart.add(product);
        System.out.println(product + " is added");
    }

    // remove cart
    public void removeFromCart(String product) {
        if(cart.remove(product)) {
            System.out.println(product + " is removed");
        }
        else {
            System.out.println(product + " not found");
        }
    }

    // check
    public void checkOut() {
        if(cart.isEmpty()) {
            System.out.println("Cart is Empty");
        }
        else {
            for(String product : cart) {
                System.out.println(product);
            }
        }
    }
}