/*
public class ShoppingCartTestDrive {
    public static void main(String[] args){
        ShoppingCart S = new ShoppingCart();
        
        S.addCart("Pizza");
        S.addCart("Coffee");
        S.addCart("Snack");
        S.addCart("Steak");
        S.addCart("Cake");
        S.addCart("Crab");
        System.out.println();
        S.removeCart("Iphone");
        S.removeCart("MacBook");
        S.removeCart("Cake");
        S.removeCart("Snack");
        System.out.println();
        S.checkOut();
    }
}
*/

public class ShoppingCartTestDrive {
    public static void main(String[] args) {
        ShoppingCart S = new ShoppingCart();

        S.addToCart("Iphone");
        S.addToCart("MacBook");
        S.addToCart("Ipad");
        S.addToCart("Apple Watch");
        S.addToCart("Ipod");
        System.out.print("\n");
        S.removeFromCart("Ipod");
        S.removeFromCart("Apple");
        System.out.print("\n");
        S.checkOut();
    }
}
