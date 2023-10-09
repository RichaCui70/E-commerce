package ecommerce;
import java.util.ArrayList;

public class ShoppingCart{
    private double sumOfCosts;
    private String productName;
    private String allProducts;
    private ArrayList<Product> cart = new ArrayList<>();

    //Contructor
    public ShoppingCart(){
        sumOfCosts = 0;
        productName = "";
        allProducts = "";
    }

    // Public Methods
     //adds a single object of the product to the cart
    public void addProduct(Product aProduct){
        cart.add(aProduct);
    }
    public void removeProduct(Product aProduct){
        cart.remove(aProduct);
    }

    // returns true if product is in cart already, false otherwise
    public boolean hasProduct(Product aProduct){
        productName = aProduct.getName();
        for (int a = 0; a < cart.size(); a++){
            if (productName.equals(cart.get(a).getName())){
                return true;
            }
        }
        return false;
    }

    //returns the total retail cost of the products in the cart, including tax
    public double totalCartPrice(){
        sumOfCosts = 0;
        for (int a = 0; a < cart.size(); a++){
            sumOfCosts = sumOfCosts + cart.get(a).getRetailPrice();
        }
        return sumOfCosts;
    }

    //returns the total retail cost of products in the cart without tax
    public double beforeTaxPrice(){
        sumOfCosts = 0;
        for (int a = 0; a < cart.size(); a++){
            sumOfCosts = sumOfCosts + (cart.get(a).getCost() * (1 + cart.get(a).getMarkupRate()));
        }
        return sumOfCosts;
    }

    // returns the total cost of the products in the cart, including tax, empties the cart
    public double checkout(){
        sumOfCosts = totalCartPrice();
        cart.clear();
        return sumOfCosts;

    }

    // returns the number of items in the cart
    public int getCartSize(){
        return cart.size();
    }


    /* returns a single String that contains every item in the cart, each on its own line. 
    Product lines must be the same format as specified in the Product toString() method.
    */
    public String toString(){
        if (getCartSize() == 0){
            return "Empty Cart";
        }
        allProducts = cart.get(0).getName();
        for (int a = 1; a < cart.size(); a++){
            allProducts = allProducts + "\n" + cart.get(a).getName();
        }
        return allProducts;
    }
}