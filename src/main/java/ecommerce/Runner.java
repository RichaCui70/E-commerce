package ecommerce;

public class Runner {
    public static void main(String[] args) {
        // Create some Product objects
        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setCost(10.0);
        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setCost(20.0);
        Product product3 = new Product();
        product3.setName("Product 3");
        product3.setCost(30.0);

        // Test static method setTax(int)
        Product.setTaxRate(0.5);
        // Setting markup for all three products
        product1.setMarkUp(0.3);product2.setMarkUp(0.2);product3.setMarkUp(0.1);

        System.out.printf("%s\n", product3.toString()); //Expected Product 3: 49.5

        // Create a ShoppingCart
        ShoppingCart cart = new ShoppingCart();

        // Test adding products to the cart
        cart.addProduct(product1);
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Test getting the cart size
        System.out.println("Cart size: " + cart.getCartSize()); // Expected: 3

        // Test removing products from cart
        cart.removeProduct(product1);
        System.out.println("Cart size: " + cart.getCartSize()); // Expected: 2

        cart.addProduct(product1);

        // Test hasProduct method
        System.out.println("Product 1 in cart: " + cart.hasProduct(product1)); // Expected: true
        System.out.println("Product 3 in cart: " + cart.hasProduct(product3)); // Expected: false

        // Test totalCartPrice method
        System.out.println("Total Cart Price: " + cart.totalCartPrice()); // Expected: 19.5 + 19.5 + 36 == 75

        // Test beforeTaxPrice method
        System.out.println("Before Tax Price: " + cart.beforeTaxPrice()); // Expected: 13 + 13 + 24 = 50

        // Test toString method
        System.out.println("Cart contents: \n" + cart.toString()); // Expected: "Product 1
                                                                                //Product 2
                                                                                //Product 1" 

        // Test checkout method
        System.out.println("Total Price after checkout: " + cart.checkout()); // Expected: 75
        System.out.println("Cart size after checkout: " + cart.getCartSize()); // Expected: 0

        //IF THERE'S NOTHING IN THE CART THEN DON'T PRINT ANYTHING
        System.out.println("Cart contents: \n" + cart.toString()); // Expected: "Empty Cart"
    }
}